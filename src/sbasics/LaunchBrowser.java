package sbasics;

import java.io.OutputStreamWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
 public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.fb.com");
   // driver.findElement(By.name("email")).sendKeys(""+23456789);
    
 String s= driver.findElement(By.tagName("title")).getText();
 System.out.println(s); 
 System.out.println("done");
 System.out.println(driver.getTitle());
 
 
 }
}
