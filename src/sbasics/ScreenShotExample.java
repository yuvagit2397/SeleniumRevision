package sbasics;

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
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {
public static void main(String[] args) throws IOException, AWTException {
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("chennai"+Keys.ENTER);
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	File des=new File("Google.png");
	
	FileHandler.copy(source, des);
	
	
//full screenshot
	
	//toolKit().getDefaultToolKit().getScreenSize()
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rec=new Rectangle(screenSize);
	//System.out.println(screenSize);
	Robot r=new Robot();
	BufferedImage source1 = r.createScreenCapture(rec);
	
	File des1=new File("GoogleFullScreenShot.jpg");
	ImageIO.write(source1, "jpg", des1);
	
	driver.close();
	
	
}
}
