package yuPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", 
			"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Window.html");
	WebElement home = driver.findElement(By.id("home"));
	home.click();
	WebElement multibtn = driver.findElement(By.xpath("//*[text()='Open Multiple Windows']"));
	multibtn.click();
	String parentId = driver.getWindowHandle();
	Set<String> allIds = driver.getWindowHandles();
	for (String id : allIds) {
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
		if (title.equals("TestLeaf - Interact with HyperLinks")) {
			driver.switchTo().window(id);
			System.out.println("i am in hyperlink window");
			
			
		}
		
	}
	/*TestLeaf - Interact with Windows
	TestLeaf - Interact with HyperLinks
	TestLeaf - Interact with Buttons
	TestLeaf - Selenium Playground*/
	/*String parentTitle = driver.switchTo().window(parentId).getTitle();
	driver.switchTo().window(parentId);
	System.out.println("i am in "+parentTitle);*/
	}
	}
