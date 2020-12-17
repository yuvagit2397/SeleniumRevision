package sbasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableExample {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 driver.get("http://www.leafground.com/pages/table.html");
	 
	 List<WebElement> td = driver.findElements(By.xpath("//td"));
	 
	/*for (WebElement webElement : td) {
		String text = webElement.getText();
		//System.out.println(text);
		if(text.equals("Actions class")) {
			System.out.println(text);
		}
	}*/
	 //get the vital task of least completed process
	 List<String> li =new ArrayList<String>();
	 List<Integer> li1 =new ArrayList<Integer>();
	 List<WebElement> td2 = driver.findElements(By.xpath("//th"));
	 for (WebElement header : td2) {
		li.add(header.getText());
	}
	 int indexOf = li.indexOf("Progress");
	 System.out.println(indexOf);
	 int columnNum=indexOf+1;
	 List<WebElement> td1 = driver.findElements(By.xpath("//td["+columnNum+"]"));
	 for (WebElement col2 : td1) {
		String value=col2.getText();
		String replace = value.replace("%", "");
		 //convert String to int
		int parseInt = Integer.parseInt(replace);
		
		li1.add(Integer.parseInt(value.replace("%", "")));
	}
	 
	 Integer min = Collections.min(li1);
	 
	 String valueOf = String.valueOf(min);
	 valueOf=valueOf+"%";
	 System.out.println(valueOf);
	 
	 WebElement leastTask=driver.findElement(
			 By.xpath("//td[normalize-space()='"+valueOf+"']//following::td[1]"));
	 //System.out.println(leastTask.getText());
	 leastTask.click();
	 
	 
	//driver.close();

	 //Note
/*WebElement element=driver.findElement(By.xpath("//*[normalize-space()='Gopi']/following::td"));
String text=element.getText();
System.out.println(text);
System.out.println("done");*/


}
}
