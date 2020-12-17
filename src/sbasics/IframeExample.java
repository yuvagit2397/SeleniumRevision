package sbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver",
			//	"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.xpath("//button[@id='Click']"));
		button1.click();
		String text= driver.findElement(By.id("Click")).getText();
		
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		//driver.close();
		}
}
