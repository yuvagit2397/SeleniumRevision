package sbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		String pId = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement edit = driver.findElement(By.xpath("//*[text()='Edit']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(edit).contextClick(edit).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement btn = driver.findElement(By.xpath("//*[text()='Button']"));
		ac.moveToElement(btn).contextClick(btn).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement link = driver.findElement(By.xpath("//*[text()='HyperLink']"));
		ac.moveToElement(link).contextClick(link).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> wSize = driver.getWindowHandles();
		int size = wSize.size();
		System.out.println("Total Windows " + size);
		Set<String> allId = driver.getWindowHandles();
		/*
		 * TestLeaf - Selenium Playground TestLeaf - Interact with HyperLinks TestLeaf -
		 * Interact with Buttons TestLeaf - Interact with Edit Fields
		 */
		String title = "TestLeaf - Interact with HyperLinks";
		String title1 = "TestLeaf - Interact with Edit Fields";
		for (String id : allId) {
			if (driver.switchTo().window(id).getTitle().equals(title)) {
				driver.switchTo().window(title);
				System.out.println("Am in third window");
			}
		}
		for (String id1 : allId) {
			if (driver.switchTo().window(id1).getTitle().equals(title1)) {
				driver.switchTo().window(id1);
				System.out.println("Am in first window");
				driver.close();
				System.out.println("first window closed");
			}
		}
		Set<String> wSize1 = driver.getWindowHandles();
		int size1 = wSize.size();
		System.out.println("Total Windows " + size1);
		driver.switchTo().window(pId);
		WebElement image = driver.findElement(By.xpath("//*[text()='Image']"));
		ac.moveToElement(image).contextClick(image).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement checkBox = driver.findElement(By.xpath("//*[text()='Checkbox']"));
		ac.moveToElement(checkBox).contextClick(checkBox).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement table = driver.findElement(By.xpath("//*[text()='Table']"));
		ac.moveToElement(table).contextClick(table).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> allId1 = driver.getWindowHandles();

		int size2 = allId1.size();
		System.out.println("Total Windows " + size2);
	}
}