package yuPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    WebElement day = driver.findElement(By.id("day"));
	    Select s = new Select(day);
	   // List<WebElement> days = s.getOptions();
	    WebElement selectedOption = s.getFirstSelectedOption();
	    String date = selectedOption.getText();
	    System.out.println("the default date is "+date);
	    
	    
	    //month
	    WebElement month = driver.findElement(By.id("month"));
	    Select s1 = new Select(month);
	    WebElement mon = s1.getFirstSelectedOption();
	    String text = mon.getText();
	    System.out.println("the default month is "+text);
	    
	    
	    //year
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2 = new Select(year);
	    WebElement y = s2.getFirstSelectedOption();
	    String text1 = y.getText();
	    System.out.println("the default year is "+text1);
	    driver.close();
	    
	
	
	}

}
