package sbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https:www.fb.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		/*WebElement female = driver.findElement(By.id("u_0_6"));
		female.click();
		WebElement name=driver.findElement(By.xpath("//input[@id='u_0_6']/following-sibling::*"));
		System.out.println(name.getText());
		boolean b = female.isSelected();
		
		System.out.println(b);
		
		Thread.sleep(2000);
		
		driver.close();*/
		
		List<WebElement> allRadioBt = driver.findElements(By.xpath("//span[@id='u_0_z']/span"));
		int i=0;
		for (WebElement radioBt : allRadioBt) {
			i++;
			if(radioBt.isSelected()==false) {
			WebElement text=	driver.findElement(By.xpath("//span[@id='u_0_z']/span["+i+"]/input/following-sibling::*"));
			
			String text2 = text.getText();
			System.out.println(text2);
			
			}else {
				continue;
			}
		
		}
	}

}
