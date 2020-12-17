package sbasics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	public static void main(String[] args) {
		Set<String> st=new TreeSet<String>();
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(250,0)");
		WebElement date = driver.findElement(By.id("day"));
		Select s = new Select(date);
		List<WebElement> options = s.getOptions();
		for (WebElement option : options) {
			String text = option.getText();
			System.out.println(text);
		}
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

		// choose Dob
		// date.click();
		s.selectByValue("23");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1=new Select(month);
		List<WebElement> monOpt = s1.getOptions();
		for (WebElement mon : monOpt) {
			String m = mon.getText();
			st.add(m);
		}
		
		s1.selectByIndex(5);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1997");
		
		System.out.println("all months in ascending order");
		for (String ascend : st) {
			System.out.println(ascend);
			
			
		}
	}
}
