package yuPackage;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShotEx {
	public static void main(String[] args) throws IOException, AWTException {
		//System.setProperty("webdriver.chrome.driver",
				//"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("fb21.jpg");
		FileHandler.copy(source, des);
		
		
		//fullscreenshot
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(size);
		Robot r=new Robot();
		BufferedImage screenCapture = r.createScreenCapture(rec);
		File place = new File("fbfull1.png");
		ImageIO.write(screenCapture, "png", place);
		
		//Screenshot for webelement
		
		WebElement email = driver.findElement(By.id("email"));
		File screenshotAs = email.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotAs, new File("email1.png"));
	
		
		
		
	}

}
