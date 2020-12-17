package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FindingWebElementWithoutFindElement {

	public static WebElement email;
	public static WebElement pass;
	public static WebElement u_0_b;
	
	@Test
	public void toFind() {
  
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		
		PageFactory.initElements(driver,FindingWebElementWithoutFindElement.class);
		email.sendKeys("senthil");
		pass.sendKeys("paanai1234");
		u_0_b.click();
		
		
		
		
	}
	
}
