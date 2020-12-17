package seleniumInterViewPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownValuesAreSortedOrNot {
public static void main(String[] args) {
	List<String> li=new ArrayList<String>();
	int x=0;
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	WebElement drpodown = driver.findElement(By.xpath("//select[@id='first']"));
	Select s=new Select(drpodown);
	List<WebElement> options = s.getOptions();
	for (int i = 0; i < options.size(); i++) {
		WebElement option = options.get(i);
		String text1 = option.getText();
		li.add(text1);
	}
	Collections.sort(li);
	for (int j = 0; j < options.size(); j++) {
		WebElement option = options.get(j);
		String text2 = option.getText();
		if (!(text2).equals(li.get(j))) {
			x++;
		}
}
	if (x==0) {
		System.out.println("sorted");
	}
	else {
		System.out.println("not sorted");
	}
}}
