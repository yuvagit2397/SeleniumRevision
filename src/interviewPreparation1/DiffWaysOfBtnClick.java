package interviewPreparation1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DiffWaysOfBtnClick {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\www.facebook.com");
	WebElement btn = driver.findElement(By.xpath("//button[@id='u_0_b']"));
	
	//btn.sendKeys(Keys.RETURN);
	//btn.sendKeys(Keys.ENTER);
	//btn.submit();
	//JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript("arguments[0].click();",btn);

	Actions ac=new Actions(driver);
	ac.moveToElement(btn).click().perform();
}
}
