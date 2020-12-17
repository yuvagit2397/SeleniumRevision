
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\javaSeleniumJars\\driver\\chrome87\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	/*Dimension d=new Dimension(200,200);
	driver.manage().window().setSize(d);*/
	
	Point p=new Point(200, 200);
	driver.manage().window().setPosition(p);
	
	driver.manage().window().maximize();
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	
}
}
