package seleniumInterViewPreparation;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsEx {
public static void main(String[] args) {
	ChromeOptions chromeOptions=new ChromeOptions();
	chromeOptions.addArguments("--start-maximized");
	
	
	WebDriver driver=new ChromeDriver(chromeOptions);
	//driver.manage().window().maximize();
	
	
	driver.get("https://www.google.com");
	//selenium class
	Dimension dimension=new Dimension(600, 400);
	driver.manage().window().setSize(dimension);	
}
}
