package yuPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinkEX {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int size=allLinks.size();
		
	    int count=0;
	    int count1=0;
		for (WebElement link : allLinks) {
			String href = link.getAttribute("href");
			
		    URL url=new URL(href);
		    HttpURLConnection con=(HttpURLConnection) url.openConnection();
			int code = con.getResponseCode();
			if (code==200) {
				count++;
				continue;
				}
			else {
				count1++;
			System.out.println(url);
			}
			
			
		}
		System.out.println("size "+size
				);
		System.out.println(" No of Normal links="+count);
		System.out.println(" No of Broken links="+count1);
		driver.close();
	}

}
