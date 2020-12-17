package com.testNG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	@Test
	@Parameters({"UserName","PassWord"})
	public void getParameter(String a,String b) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys(a);
		driver.findElement(By.id("pass")).sendKeys(b);
		System.out.println("enter i");
		Scanner sc=new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
	}

	@Test
	@Parameters({"UserName","PassWord"})
	public void getParameter1(@Optional("paanai") String x,String y) {
		System.out.println("The given name is " + x);
		System.out.println("The given pw is " + y);
	}
}
