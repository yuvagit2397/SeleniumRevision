package sbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("apple" + Keys.ENTER);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

	JavascriptExecutor js=(JavascriptExecutor) driver;
	//vertical move
js.executeScript("window.scrollBy(0,500)");
//horizontal move
js.executeScript("window.scrollBy(250,0)");
Thread.sleep(3000);
driver.close();
	}
}
