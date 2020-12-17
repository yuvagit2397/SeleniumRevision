package interviewPreparation1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCookiesBeforeExecution {
public static void main(String[] args) throws Throwable {
	
	//Before starting the execution
	/*WebDriver driver=new ChromeDriver();
	driver.get("chrome://settings/clearBrowserData") ;
	Thread.sleep(3000);
	driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
	System.out.println("done");
	*/
	String s="#it@has+spec*ial%characters&";
	//s=s.replaceAll("[^a-zA-Z0-9]", " ");
	s=s.replaceAll("[\\w]","");
	System.out.println("string = "+s);
}
}
