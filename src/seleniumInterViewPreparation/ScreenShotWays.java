package seleniumInterViewPreparation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class ScreenShotWays {
	@Test(enabled=false)
	public void forWebelement() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		WebElement userName = driver.findElement(By.id("email"));
		File source = userName.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("ScreenshotforWebelement.png"));
	}
	@Test
	public void forMultipleWebelement() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		WebElement findElement = driver.findElement(By.id("reg_form_box"));
		File source = findElement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("ScreenshotforMultipleWebelement.png"));
	}
}
