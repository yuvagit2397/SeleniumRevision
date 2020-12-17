package seleniumInterViewPreparation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static void ScreenShot(String fileName) throws Exception {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(fileName);
		FileHandler.copy(source, des);

	}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static WebDriver browserLaunch(String browserName) throws Exception {
		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Firefox")) {

				System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\Automation\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("give valid browser name");
			}
		} catch (Exception e) {
			throw new Exception("invalid");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public static void SendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void dropDown (WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement option : options) {
			String text = option.getText();
			System.out.println(text);
		}

	}

	public static void brokenLinks(List<WebElement> element) throws IOException {
		System.out.println("Broken Links are ");
		for (WebElement href : element) {
			String link = href.getAttribute("href");
			URL url = new URL(link);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			int responseCode = con.getResponseCode();

			if (responseCode == 200) {
				continue;
			} else {
				System.out.println(link);
			}

		}
	}

	public static void keyDownAndUp(int num, String toWards) throws AWTException {
		Robot r = new Robot();
		if (toWards.equalsIgnoreCase("down")) {
			for (int i = 1; i <= num; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} else if (toWards.equalsIgnoreCase("up")) {
			for (int i = 1; i <= num; i++) {
				r.keyPress(KeyEvent.VK_UP);
				r.keyRelease(KeyEvent.VK_UP);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	public static void rightClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).contextClick(element).perform();

	}

	public static void visiblityOfElement(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(element));
	}

	public static void mouseHover(WebElement element) {
		visiblityOfElement(element);

		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public static void alertHandling(WebElement element,String text) {
      element.click();
      Alert alert = driver.switchTo().alert();
      if(text.equalsIgnoreCase("accept")) {
    	  alert.accept();
      }else if(text.equalsIgnoreCase("dismiss")) {
    	  alert.dismiss();
      }
	}
	public static void alertSendKeys(WebElement element,String text) {
      element.click();
      Alert alert = driver.switchTo().alert();
      alert.sendKeys(text);
	}
	public static void doubleClick(WebElement element) {
      Actions ac=new Actions(driver);
      ac.doubleClick(element).build().perform();
	}
	public static void scrollUsingPixel(int xaxis,int yaxis) {
     JavascriptExecutor js=(JavascriptExecutor) driver;
     js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}
	public static void scrollToEnd() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		
	}
	public static void getParticularRowIndex(String actual,String path,String sheetName,String rowOrColumn) throws IOException {
		FileInputStream fs=new FileInputStream(path);
		Workbook wb=new XSSFWorkbook(fs);
		Sheet sheet=wb.getSheet(sheetName);
		int rowIndex=0;
		int colIndex=0;
		int p = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < p; i++) {
			Row row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			String value = "";
			for (int j = 0; j < cells; j++) {
				Cell cell = row.getCell(j);

				if (cell.getCellType().equals(CellType.STRING)) {
					value = cell.getStringCellValue();
					if(actual.equalsIgnoreCase(value)) {
						System.out.println(value);
						if(rowOrColumn.contains("row")) {
				 rowIndex = cell.getRowIndex();}else {
					 colIndex=cell.getColumnIndex();
				 }
					}
					else {
						rowIndex=rowIndex-1;
						colIndex=colIndex-1;
					}
					
				} else if (cell.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					if(actual.equalsIgnoreCase(value)) {
						System.out.println(value);
						if(rowOrColumn.contains("row")) {
							 rowIndex = cell.getRowIndex();}else {
								 colIndex=cell.getColumnIndex();
							 }					
					}
					else {
						rowIndex=rowIndex-1;
						colIndex=colIndex-1;
					}
				}
          
			}
		
		}
		if (rowOrColumn.contains("row")) {
			Row ro = sheet.getRow(colIndex);
			String va="";
			for (int i = 0; i < ro.getPhysicalNumberOfCells(); i++) {
				Cell cell = ro.getCell(i);
				if (cell.getCellType().equals(CellType.STRING)) {
					va = cell.getStringCellValue();
					System.out.println(va);
				} else if (cell.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					va = String.valueOf(l);
					System.out.println(va);
				}
			}
		}else {
			int rows = sheet.getPhysicalNumberOfRows();
			for (int i = 0; i <rows; i++) {
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(colIndex);
				String colvalue="";
				if (cell.getCellType().equals(CellType.STRING)) {
					colvalue = cell.getStringCellValue();
					System.out.println(colvalue);
				} else if (cell.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					colvalue = String.valueOf(l);
					System.out.println(colvalue);
				}
			}
		}
	}
	
}
