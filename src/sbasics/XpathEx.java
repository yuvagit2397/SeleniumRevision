package sbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//normal
		WebElement surName = driver.findElement(By.xpath("//*[@id='u_0_o']"));
		surName.sendKeys("chandran");
		
		
		//contains
		WebElement pass = driver.findElement(By.xpath("//*[contains(@for,'pass')]"));
		String text = pass.getText();
		System.out.println(text);
		
		//using or,and
		WebElement surname = driver.findElement(By.xpath("//*[@name='lastname' or @id='u_0_o']"));
		surname.clear();
		Thread.sleep(2000);
		
		//using text
		WebElement birth = driver.findElement(By.xpath("//*[text()='Birthday']"));
		String bir = birth.getText();
		System.out.println(bir);
		
		driver.close();
		
	}

}
