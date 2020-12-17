package interviewPreparation1;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementSizeInPixel {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement element = driver.findElement(By.id("hplogo"));
	
	Dimension d = element.getSize();
	double height = d.getHeight();
	double width = d.getWidth();
	System.out.println("height = "+height);
	System.out.println("width = "+width);
}
}
