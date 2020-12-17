package yuPackage;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		/*driver.findElement(By.xpath("//*[text()='File Upload']")).click();
		Thread.sleep(5000);
*/		driver.findElement(By.xpath("//*[@id='file-upload']")).click();
		StringSelection file=new StringSelection("C:\\Users\\SENTHIL\\Desktop\\IMG_1996.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
		System.out.println(msg);
		String filename = driver.findElement(By.id("uploaded-files")).getText();
		System.out.println("the file name is "+filename);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
