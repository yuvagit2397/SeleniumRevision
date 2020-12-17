package yuPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		JavascriptExecutor jse=driver;
		jse.executeScript("window.scrollBy(250,0)");
		
		//name
		WebElement fstName = driver.findElement(By.name("firstname"));
		fstName.sendKeys("yuvasri");
		
		//classname
		/*WebElement quick = driver.findElement(By.className("_52lr fsm fwn fcg"));
		String text = quick.getText();
		System.out.println(text);*/
		
		//tagname
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement li : allLinks) {
			String text2 = li.getText();
			if (text2.equals("About")) {
				System.out.println(text2);
				}
			}
		
		//partiallinktext
				WebElement signUp = driver.findElement(By.partialLinkText("Sign "));
				String sg = signUp.getText();
				System.out.println(sg);
		
		//linktext
		String parentId = driver.getWindowHandle();
		WebElement lt = driver.findElement(By.linkText("Places"));
		lt.click();
		
		}

}
