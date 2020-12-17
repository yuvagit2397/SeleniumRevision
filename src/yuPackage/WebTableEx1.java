package yuPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sbasics.BaseClass;

public class WebTableEx1 extends BaseClass{
	public static WebDriver driver;

public static void main(String[] args) throws Exception {
	System.setProperty("WebDriver.chrome.driver", 
			"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	
	//to print all datas
	/*List<WebElement> rows = driver.findElements(By.tagName("td"));
	for (WebElement data : rows) {
		String text = data.getText();
		System.out.println(text);
		
	}
*/	
	//to print 2 row
	/*List<WebElement> rowData = driver.findElements(By.xpath("//tr[2]"));
	for (WebElement data1 : rowData) {
		System.out.println(data1.getText());
		
	}*/
	
	//to print one column
	/*List<WebElement> column = driver.findElements(By.xpath("//tr/td[5]"));
	for (WebElement col : column) {
		String text1 = col.getText();
		if (text1.equals("Babu")) {
			List<WebElement> nxtText = driver.findElements(By.xpath("//*[normalize-space()='Babu']/following::tr/td[5]"));
			for(WebElement nxt:nxtText) {
				System.out.println(nxt.getText());
			}
			
			
		}
		System.out.println();
	}*/
	
	//to print heading datas
	List<WebElement> headings = driver.findElements(By.xpath("//th"));
	for (WebElement head : headings) {
		String text = head.getText();
		System.out.println(text);
		if (head.getText().equals("Progress")) {
			int no = headings.indexOf(head);
			no=no+1;
			
			System.out.println(no);
			List<WebElement> headingDatas = driver.findElements(By.xpath("//td["+no+"]"));
			for (WebElement data :headingDatas ) {
				System.out.println(data.getText());
			}
			
		}
		
}

}//th/following::tr/td[2]
}

