package sbasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksExample {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.fb.com");
	
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println("Broken Links");
	for (WebElement link : allLinks) {
		String href = link.getAttribute("href");
		URL url=new URL(href);
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		int responseCode = con.getResponseCode();
		if(responseCode==200) {
			continue;
		}else {
			
			System.out.println(url);
		}
	
		
	}
	
}
}
