package seleniumInterViewPreparation;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetBrowserNameUsingJavascriptExecutor {
	 public static void main(String[] args) 
	   {
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.google.com");
	     Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
	     String browsername = cap.getBrowserName();
	     System.out.println(browsername);
	   }

}
