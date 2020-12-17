package interviewPreparation1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyScrollBar {
	public static void main(String[] args) {
		//find the presence of scroll bar
		WebDriver driver=new ChromeDriver();
				//for horizontelbar
				JavascriptExecutor js=(JavascriptExecutor) driver;
				Boolean horizon = (Boolean)js.executeScript("return document.documentElement."
						+ "scrollWidth>document.documentElement.clientWidth;");
				if (horizon==true) {
					System.out.println("Horizontal scroll bar present in a web page");
				}
				else {
					System.out.println("Horizontal scroll bar is not present in a web page");
				}
				
				//for Verticalbar
				Boolean vertical = (Boolean)js.executeScript("return document.documentElement."
						+ "scrollHeight>document.documentElement.clientHeight;");
				if (vertical==true) {
					System.out.println("Vertical scroll bar present in a web page");
				}
				else {
					System.out.println("Vertical scroll bar is not present in a web page");
				}
	}

}
