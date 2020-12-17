package sbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInandZoomOut {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='30'");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='200'");

	}
}
