package sbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver",
			//"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
	Actions a=new Actions(driver);
	WebElement drag=driver.findElement(By.xpath("//*[text()='Learning DHTMLX Suite UI']"));
    WebElement drop = driver.findElement(By.id("treeTarget"));
    JavascriptExecutor j=(JavascriptExecutor) driver;
    j.executeScript("window.scrollBy(0,400)");
    Thread.sleep(3000);
    
    a.dragAndDrop(drag, drop).perform();
    
    
    //a.clickAndHold(drag).moveToElement(drop).release().perform();
    


}
}
