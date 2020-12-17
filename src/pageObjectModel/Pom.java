package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pom {
	
	@Test
public  void accessingObjects() {
	System.setProperty("webdriver.chrome.driver",
			"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.fb.com");
	
	PageFactory.initElements(driver, LoginPage.class);
	LoginPage.userName.sendKeys("senthil");
	LoginPage.passWord.sendKeys("paana123");
	LoginPage.loginBtn.click();
	
	
	
	
	
	
	
	/*LoginPage lgn=new LoginPage();
	lgn.userName(driver).sendKeys("user@phptravels.com");
	lgn.passWord(driver).sendKeys("demouser");
	
	lgn.login(driver).click();*/
	
	
	
	
}
}
