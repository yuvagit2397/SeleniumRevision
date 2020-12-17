package interviewPreparation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

public class BrokenImage {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.google.com");
	driver.switchTo().activeElement().sendKeys("chennai"+Keys.ENTER);
	List<WebElement> images = driver.findElements(By.tagName("img"));
	System.out.println(images.size());
	int broken=0;
	for (WebElement image : images) {
		if ((image.getAttribute("naturalWidth")).equals("0")) {
			System.out.println("height "+image.getAttribute("height"));
			broken++;
		}else {
			System.out.println("width "+image.getAttribute("width"));
		}
	}
	System.out.println("the no of broken images "+broken);
	System.out.println("done");
	
	LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
	System.out.println(logEntries);
	//another way to find broken or find not loaded image
	/*JavascriptExecutor js=(JavascriptExecutor) driver;
	int tr=0;
	int fa=0;
	for (WebElement imageWebElement : images) {
		Boolean isLoaded = (Boolean) js.executeScript("return arguments[0].complete &&"
				+ " typeof arguments[0].naturalWidth != \"undefined\" && "
				+ "arguments[0].naturalWidth > 0", imageWebElement);
		if (isLoaded==false) {
			fa++;
		}
	}
	System.out.println("no of not loaded image "+fa);*/
}
}
