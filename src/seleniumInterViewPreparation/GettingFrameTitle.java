package seleniumInterViewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingFrameTitle {
	public GettingFrameTitle() {
		System.out.println("empty");
	}
	public GettingFrameTitle(int a) {
		GettingFrameTitle ob=new GettingFrameTitle();
		System.out.println("one");
	}
	public static void main(String[] args) {
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		WebElement iframe = driver.findElement(By.xpath("//div[@id='mainLeaderboard']/following::iframe[1]"));
		driver.switchTo().frame(iframe);
		String text = driver.findElement(By.tagName("title")).getAttribute("innerHTML");
		System.out.println(text);
	System.out.println("done");
	*/
		GettingFrameTitle ob1=new GettingFrameTitle(10);
	}
}
