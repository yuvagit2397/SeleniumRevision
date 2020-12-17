package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	@FindBy(how=How.ID,using="email")
	public static  WebElement userName;
	
	@FindBy(id="pass")
	public static WebElement passWord;
	
	@FindBy(xpath="//label[@id='loginbutton']/input")
	public static WebElement loginBtn;
	
	
	
	
	/*public WebElement userName(WebDriver driver) {
		
		return driver.findElement(By.id("email"));
	}
	public WebElement passWord(WebDriver driver) {
		
		return driver.findElement(By.id("pass"));
	}
	public WebElement login(WebDriver driver) {
		
		return driver.findElement(By.id("u_0_b"));
	}*/
}
