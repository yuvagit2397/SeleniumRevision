package sbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AlertExapmle {
	
  
  @Test
  public void alert() throws Exception {
	System.setProperty("webdriver.gecko.driver",
			"D:\\yuvasri_revision\\TnstcAutomation\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	
	driver.get("http://www.leafground.com/pages/Alert.html");
	//simple alert
	 WebElement button1 = driver.findElement(By.xpath("//button[text()='Alert Box']"));
   button1.click();
   Thread.sleep(2000);
   
   driver.switchTo().alert().accept();
   
   
   //confirm alert
   driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
   Thread.sleep(2000);
   Alert alert2 = driver.switchTo().alert();
   alert2.accept();
   //prompt alert
   driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
   
   Alert alert = driver.switchTo().alert();
   alert.sendKeys("paanai");
   String text = alert.getText();
   System.out.println("alert text "+text);
   alert.accept();
   
   //driver.switchTo().alert().sendKeys("sdfgh").accept();

}

}
