package yuPackage;

import java.sql.Driver;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WebTableEx {
	static WebDriver driver;

	@BeforeSuite
	public static void BeforeSuite() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterSuite
	private void afterSuite() {
		driver.close();
	}

	@Test(enabled=false)
	public static void allData() {

		driver.get("https://www.facebook.com/directory/places/");

		List<WebElement> allData = driver.findElements(By.xpath("//*[@class='uiGrid _51mz mam']/tbody/tr/td/div/a"));
		for (WebElement data : allData) {
			System.out.println(data.getAttribute("title"));
		}
		
	}

	@Test(enabled=false)
	public static void particularRow() {
		driver.get("https://www.facebook.com/directory/places/");
		List<WebElement> row = driver.findElements(By.xpath("//*[@class='uiGrid _51mz mam']/tbody/tr[1]/td/div/a"));
	    for (WebElement element : row) {
			System.out.println(element.getAttribute("title"));
		}
	
	}
	@Test(enabled=false)
	private void particularColoumn() {
		driver.get("https://www.facebook.com/directory/places/");
		System.out.println("enter the coloumn no");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		System.out.println(c+"rd column datas are");
			List<WebElement> row = driver.findElements(By.xpath("//*[@class='uiGrid _51mz mam']/tbody/tr/td["+c+"]/div/a"));
			System.out.println();
			for (WebElement data : row) {
				System.out.println(data.getAttribute("title"));
				
			}
		}
	@Test(enabled=false)
     public void particularData() {
    	 driver.get("https://www.facebook.com/directory/places/");
    	 List<WebElement> datas = driver.findElements(By.xpath("//*[@class='uiGrid _51mz mam']/tbody/tr/td/div/a"));
    	 String p="Los Angeles, California";
    	 for (WebElement place : datas) {
    		 String name = place.getAttribute("title");
    		 if (name.equals(p)) {
    			 System.out.println(name);
    			 driver.findElement(By.xpath("//a[text()='"+name+"']")).click();
			}	
		}
	}
	
	
	@Test
	public void toClick() {
		driver.get("https://www.facebook.com/directory/places/");
   	  //driver.findElement(By.xpath("//*[@title='Hong Kong']/following::td/div/a")).click();
		WebElement element = driver.findElement(By.xpath("//*[normalize-space()='Bogotá, Colombia']/following::td/div/a"));
	   	 
	   	 System.out.println(element.getAttribute("title"));
   	 
	}
}
