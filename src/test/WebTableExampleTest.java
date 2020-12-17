package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExampleTest {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-table/");
	List<WebElement> findElements = driver.findElements(By.xpath("//table/tbody/tr/td"));
      
       
for (WebElement webElement : findElements) {
	if(webElement.getText().equals("Taiwan")){
		int indexOf = findElements.indexOf(webElement);
	 System.out.println("index of "+indexOf);
	System.out.println(webElement.getText());
	}
}
}
}
