package seleniumInterViewPreparation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingNestedFrames {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
	int size = iframes.size();
	System.out.println(size);
	driver.switchTo().frame(0);
	System.out.println("Inside the Parent Frame");
	driver.switchTo().frame("frame3");
	System.out.println("Inside the nested Frame");
	WebElement checkBox = driver.findElement(By.id("a"));
	checkBox.click();
	driver.switchTo().parentFrame();
	System.out.println("Again i back to the Parent Frame");
	driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("asdf");
	System.out.println("done");
	String attribute = driver.findElement(By.tagName("title")).getAttribute("innerHTML");
	System.out.println(attribute);
}
}
