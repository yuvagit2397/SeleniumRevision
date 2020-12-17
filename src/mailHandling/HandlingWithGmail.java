package mailHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingWithGmail {
	@Test
public static void login() {
		/*System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\Automation\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();*/
		WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signin");

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	driver.findElement(By.id("identifierId")).sendKeys("yuvagit2397@gmail.com", Keys.ENTER);

}
}
