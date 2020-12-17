package yuPackage;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample1 {
	static WebDriver driver;

	public static void printAllData() {
		driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> row = table.findElements(By.tagName("tr"));// 4
		for (WebElement rowDatas : row) {
			List<WebElement> datas = rowDatas.findElements(By.tagName("td"));
			for (WebElement data : datas) {
				String text = data.getText();
				if (text.equalsIgnoreCase("china")) {
					System.out.println(text);
					break;
				}
			}
		}
	}

	public static void dynamicTable() {

		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		String toCompare = "Learn to interact with Elements";
		List<WebElement> firstColumn = driver.findElements(By.xpath("//tr/following::td[1]"));
		for (WebElement colData : firstColumn) {
			String text = colData.getText();
			if (text.equals(toCompare)) {
				WebElement val = driver.findElement(By.xpath("//*[normalize-space()='" + text + "']/following::td[1]"));
				String progress = val.getText();
				System.out.println(progress);
			}
		}

	}

	public static void particularColumn() {
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> headings = driver.findElements(By.tagName("th"));
		Scanner scanner=new Scanner(System.in);
		String input = scanner.nextLine();
		int index=0;
		for (WebElement header : headings) {
			index++;
			
			if (header.getText().equalsIgnoreCase(input)) {
				WebElement head = driver.findElement(By.xpath("//th["+index+"]"));
				System.out.println(head.getText());
				List<WebElement> columnData = driver.findElements(By.xpath("//td["+index+"]"));
				for (WebElement data : columnData) {
					System.out.println(data.getText());
				}
			}
			
			
			
		}
	}

	public static void main(String[] args) {
		// printAllData();
		//dynamicTable();
		particularColumn();
	}
}
