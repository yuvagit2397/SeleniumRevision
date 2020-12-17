package seleniumInterViewPreparation;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;


public class ImageBroken {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSeleniumJars\\driver\\chrome87\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/broken_images");
		/*List<WebElement> images = driver.findElements(By.tagName("img"));
		for (WebElement image : images) {
			if (image.getAttribute("naturalWidth").equals("0")) {
				System.out.println(image.getAttribute("outerHTML"));
			}
		}*/
		String title = driver.getTitle();
		
		EventFiringWebDriver dri=new EventFiringWebDriver(driver);
		File shot = dri.getScreenshotAs(OutputType.FILE);
		File f=new File("assertShot1.png");
		FileHandler.copy(shot, f);
		Assert.assertEquals(title, "The Internet");
		
		
		
	}
	
	
	

}
