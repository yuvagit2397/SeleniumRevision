package seleniumInterViewPreparation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoItExample {
public static void main(String[] args) throws IOException, InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://tinyupload.com/");
	Thread.sleep(3000);
	Actions ac=new Actions(driver);
	WebElement chooseFile = driver.findElement(By.xpath("//input[@name='uploaded_file']"));
	ac.moveToElement(chooseFile).click().perform();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("D:\\AutoIT\\autoitscript.exe");

}
}
