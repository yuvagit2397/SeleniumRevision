package seleniumInterViewPreparation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PassInputWithoutSendKeys {
	@Test
	public void passingInputs() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchBox=driver.findElement(By.name("q"));
		//searchBox.sendKeys("about corona"+Keys.ENTER);
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("document.getElementsByName('q')[0].value='corona'");
		//or
		//js.executeScript("arguments[0].value='corona'",searchBox);
		
		//using Robot class
		Robot robot =new Robot();
		
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
