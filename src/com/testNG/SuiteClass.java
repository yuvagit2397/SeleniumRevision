package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteClass {
	static WebDriver driver;
	long start;
	long end;
	long timeTaken;
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
		end = System.currentTimeMillis();
		timeTaken = end - start;
		System.out.println("TotalTime " + timeTaken);
		driver.quit();
	}
	@Test
	public void openGoogle() {

		driver.get("https://www.google.com");

	}

	@Test
	public void openFb() {

		driver.get("https://www.fb.com");
	}

	@Test
	public void openBing() {

		driver.get("https://www.bing.com");

	}

	@BeforeSuite
	public  void beforeSuite() {
		System.out.println("BeforeSuite");
		start = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	}

	
}
