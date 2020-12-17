package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	@DataProvider(name = "test")
	public Object[][] testData() {
		return new Object[][] { { "paanaa","pa123" }, 
								{ "senthil","se123"},
								{ "yuvasri","yu123"} };
	}
	@Test(dataProvider="test")
	public void getData(String userName,String passWord) throws InterruptedException {
		
		//System.out.println(userName);
		//System.out.println(passWord);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		WebElement id=driver.findElement(By.id("email"));
		WebElement pw=driver.findElement(By.id("pass"));
		id.sendKeys(userName);
		pw.sendKeys(passWord);
		Thread.sleep(2000);
		id.clear();
		pw.clear();
	}
}
