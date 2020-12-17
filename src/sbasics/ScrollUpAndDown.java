package sbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.fb.com");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)");
	driver.close();
	
}
}
