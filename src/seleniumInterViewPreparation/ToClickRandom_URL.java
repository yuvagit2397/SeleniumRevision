package seleniumInterViewPreparation;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickRandom_URL {
	  public static void main(String[] args) throws InterruptedException 
	   {
	      // TODO Auto-generated method stub
	      WebDriver obj=new ChromeDriver();
	      obj.get("http://www.bbc.com/");
	      Thread.sleep(5000);
	      WebElement Boxarea = obj.findElement(By.xpath(".//*[@id='page']/section[6]/div/div/div[2]"));
	      List<WebElement> l1 = Boxarea.findElements(By.tagName("a"));
	      System.out.println("The Number Of Anchor Text" + l1.size());
	      for (int i=0; i<l1.size(); i++)
	      {
	         Random r=new Random();
	         l1.get(r.nextInt(5)).click();
	         String ptitle=obj.getTitle();
	         System.out.println("The Page Title is :" + ptitle);
	         Thread.sleep(5000);
	         obj.get("http://www.bbc.com/");
	         Thread.sleep(5000);
	         Boxarea = obj.findElement(By.xpath(".//*[@id='page']/section[6]/div/div/div[2]"));
	         l1 = Boxarea.findElements(By.tagName("a"));   
	      }
	   }

}
