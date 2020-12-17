package yuPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling1 {
	static WebDriver driver = new ChromeDriver();
	public static void getWindowUsingIndex() {
		
		driver.get("http://www.leafground.com/pages/Window.html");
		WebElement mulW = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		mulW.click();
        String parent = driver.getWindowHandle();
        Set<String> allId = driver.getWindowHandles();
        /*int x=0;
        for (String id : allId) {
        	System.out.println(driver.switchTo().window(id).getTitle());
        	if(!id.equals(parent)) {
			x++;
			}
			if(x==2) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println(title);
				Thread.sleep(3000);
				driver.close();
				System.out.println("am in "+x +"window");
			}
		}*/
        
        int size = allId.size();
        int i=0;
        for (String string : allId) {
			//i=i;
			if(i==1) {
				
				String title = driver.switchTo().window(string).getTitle();
				System.out.println(title);
				System.out.println("am in  "+i+" window");
			}
			System.out.println(driver.switchTo().window(string).getTitle());
			i++;
		}
        }
	
	public static void getWindowUsingTitle() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Window.html");
		WebElement mulW = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		mulW.click();
        String parent = driver.getWindowHandle();
        Set<String> allId = driver.getWindowHandles();
        String comp="TestLeaf - Interact with HyperLinks";
        		
        for (String ids : allId) {
        	//String title1 = driver.switchTo().window(ids).getTitle();
        	//System.out.println(title1);
        	if (driver.switchTo().window(ids).getTitle().equals(comp)) {
        		
				System.out.println("i am closing"+comp+"window");
				
				driver.close();
			}
			
		}
        driver.switchTo().defaultContent();
        System.out.println("i am in parent window");
	}
	public static void main(String[] args) {
		getWindowUsingIndex();
	}
	
}
	

