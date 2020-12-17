package yuPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select s=new Select(dd1);
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select s2=new Select(dd2);
		s2.selectByVisibleText("Selenium");
		Thread.sleep(2000);
		
		WebElement dd3 = driver.findElement(By.className("dropdown"));
		Select s3=new Select(dd3);
		int count=0;
		List<WebElement> options = s3.getOptions();
		for (WebElement option : options) {
			count++;
			}
		System.out.println("total no of options "+count);
		driver.close();
	}

}
