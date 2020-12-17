package seleniumInterViewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToCheckTextUnderlinedOrNot {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement element=driver.findElement(By.xpath("//a[text()='Helpful tips to avoid COVID-19 online scams']"));
	
	System.out.println(element.getText());
	
	String cssValue = element.getCssValue("text-decoration");
	System.out.println(cssValue);
	
	
	Actions actions=new Actions(driver);
	Thread.sleep(2000);
	actions.moveToElement(element).perform();
	
	Thread.sleep(2000);
	String cssValue1 = element.getCssValue("text-decoration");
	System.out.println(cssValue1);
	
	
	
}
}
