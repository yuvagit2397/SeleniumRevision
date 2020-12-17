package seleniumInterViewPreparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeTakenToOpenWebsite {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		long start = System.currentTimeMillis();
		driver.get("https:\\www.google.com");
		   long finish = System.currentTimeMillis();
		   long totalTime = finish - start; 
		   System.out.println("Total Time for page load::"+totalTime);
	

}}
