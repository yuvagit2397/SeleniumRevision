package seleniumInterViewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CharacterSequenceInSendKeys {

	public static void main(String[] args) {
		
		String s="I";
		StringBuffer b=new StringBuffer();
		b.append(" ");
		b.append("am");
		
		StringBuilder builder=new StringBuilder();
		builder.append(" ");
		builder.append("paanachi");
		
	try {	
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.fb.com");
    WebElement email = driver.findElement(By.id("email"));
    email.sendKeys(s,b,builder);
    driver.quit();
	}
	finally {
		System.out.println("done");
	}
	
    
	}

}
