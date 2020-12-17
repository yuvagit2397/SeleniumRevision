package test;

import org.bson.codecs.CollectibleCodec;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.config.ConcatenatingConfig;

public class WindowsHandling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	String windowHandle = driver.getWindowHandle();
	String title=driver.switchTo().window(windowHandle).getTitle();
	if(title.equals("abc")) {
		System.out.println("done");
	}else {
		driver.close();
		System.out.println("the title is "+title);
	}
	
}
}
