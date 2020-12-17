package sbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/radio.html");
	WebElement e=driver.findElement(By.id("vfb-6-0"));
	e.click();
	boolean b = e.isSelected();
	System.out.println(b);
	
	List<WebElement> allClick=driver.findElements(By.xpath("//*[@style='margin-left:20px;']/strong[2]/following::input"));
	for (WebElement x : allClick) {
		x.click();
	}
	Thread.sleep(3000);
	//driver.close();
}
}
