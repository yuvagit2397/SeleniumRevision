package interviewPreparation1;

import java.awt.Dimension;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MOuseHoverChange {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
		Thread.sleep(2000);
		String cssValue = element.getCssValue("cursor");
		System.out.println(cssValue);
		System.out.println(element.getCssValue("font-size"));
		
		WebElement logo = driver.findElement(By.xpath("//img[@id='hplogo']"));
		ac.moveToElement(logo).perform();
		Thread.sleep(3000);
		System.out.println(logo.getCssValue("cursor"));
		
		
		
	}
	

}
