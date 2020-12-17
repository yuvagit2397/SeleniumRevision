package yuPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomForFBLoginPage {
	@FindBy(id="u_0_m")
public static WebElement firstName;
	
	@FindBy(id="u_0_o")
public static WebElement surName;
	
	@FindBy(id="u_0_r")
public static WebElement emailaddress;
	
	@FindBy(id="u_0_w")
public static WebElement passWord;

@FindBy(id="year")
public static WebElement year;

@FindBy(id="u_0_6")
public static WebElement femaleBtn;

@FindBy(id="u_0_13")
public static WebElement submit;

@FindBy(id="js_a0")
public static WebElement emailreEnter;

@FindBy(id="day")
public static WebElement day;

@FindBy(id="month")
public static WebElement month;

@FindBy(tagName="a")
public static List<WebElement> allLink;

@FindBy(xpath="//a[text()='Instagram']")
public static WebElement instaGram;
}
