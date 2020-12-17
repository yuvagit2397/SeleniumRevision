package interviewPreparation1;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GetBrowserName {
	 WebDriver driver;
	 @Test
public void details(){
	
	Capabilities ca=((RemoteWebDriver)driver).getCapabilities();
	String browserName = ca.getBrowserName();
	System.out.println(browserName);
	String version = ca.getVersion();
	System.out.println(version);
	String osname = System.getProperty("os.name");
	System.out.println(osname);
}
}
