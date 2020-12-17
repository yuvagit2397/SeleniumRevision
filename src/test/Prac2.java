package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Prac2 {
	public static WebDriver driver;
	
	public Prac2(WebDriver webdriver) {
		this.driver=webdriver;
		PageFactory.initElements(driver, this);
		}
	public static void main(String[] args) {
		driver.findElement(By.name("q")).sendKeys("chennai");
	}
	
}

