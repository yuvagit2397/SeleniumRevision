package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelExample {
	static WebDriver driver;

	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}

	@Test
	public void openFb() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.fb.com");
	}

	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bing.com");

	}

}
/*<suite name="yuvasri" parallel="methods">
<test name="test">
	<classes>
	<class name="com.testNG.ParallelExample"/>
	</classes>
</test>
</suite>*/

