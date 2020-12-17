package sbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActionEx {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	/*driver.get("https://www.fb.com");
	WebElement day = driver.findElement(By.id("day"));
	day.click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	driver.close();*/
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	WebElement name = driver.switchTo().activeElement();
	
	name.sendKeys("chennai");
	
	
	Robot r1=new Robot();
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	
}
}
