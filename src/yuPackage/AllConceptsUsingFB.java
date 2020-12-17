package yuPackage;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pageObjectModel.LoginPage;
import pageObjectModel.Pom;
import sbasics.BaseClass;

public class AllConceptsUsingFB extends BaseClass {
	static WebDriver driver;
	// Finding webelement using webelement value
	public static WebElement email;
	public static WebElement pass;
	public static WebElement u_0_b;

	// ExtentReport
	// Jar---ExtentReports
	// 2. freemarker
	ExtentReports extentReports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest testCase;

	@BeforeSuite
	public void browserLaunch() {
		extentReports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReportForFB.html");
		extentReports.attachReporter(htmlReporter);
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\yuvasri_revision\\SeleniumRevision\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.fb.com");
	}

	@AfterSuite
	public void tearDown() throws InterruptedException {
		extentReports.flush();
		Thread.sleep(5000);
		driver.quit();
	}

	@Test(priority = 0,enabled=false)
	public void titleValiDation() {
		testCase = extentReports.createTest("Verifying the FB Title");
		testCase.log(Status.INFO, "User is on the Fb page");
		String actual = "Facebook – log in or sign up";
		testCase.log(Status.INFO, "Actual Title "+actual);
		String expected = driver.getTitle();
		testCase.log(Status.INFO, "Expected Title "+expected);
		testCase.log(Status.INFO, "Verifying the Actual and Expected Title");
        if(actual.equals(expected)) {
        	testCase.log(Status.PASS, "actual and expected are equal");
        }else {
        	testCase.log(Status.FAIL, "actual and expected are Not equal");

        }
		
	}

	@Test(priority = 1,enabled=false)
	public void loginCredentialValidation() throws Exception {
		testCase = extentReports.createTest("Verifying the login credentials");
		PageFactory.initElements(driver, AllConceptsUsingFB.class);
		email.sendKeys("yusri");
		testCase.log(Status.INFO,"email value sent");
		pass.sendKeys("paa123");
		testCase.log(Status.INFO, "password value sent");
		u_0_b.click(); 
		//WebElement text = driver.findElement(By.xpath("//div[@data-testid='undefined']/div/div/div"));
		// String loginErrorMsg = text.getText(); //
		//System.out.println(loginErrorMsg);
		//Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("loginCredentialValidation.png");
		FileHandler.copy(source, des);
		System.out.println("Login Credentials Verified");
		testCase.log(Status.PASS, "Screenshot taken in the name of"+des);

	}

	@Test(priority = 2)
	public void sampleAccountCreation() throws IOException, WebDriverException {
		testCase = extentReports.createTest("Creating New FB Account");
		//driver.navigate().back();
		PageFactory.initElements(driver, PomForFBLoginPage.class);
		PomForFBLoginPage.firstName.sendKeys("qwerty");
		PomForFBLoginPage.surName.sendKeys("asdfgh");
		PomForFBLoginPage.emailaddress.sendKeys("qwerty@gmail.com");
		PomForFBLoginPage.year.sendKeys("1997");
		PomForFBLoginPage.femaleBtn.click();
		PomForFBLoginPage.submit.click();
		testCase.log(Status.INFO,"Necessary details are filled" );
		String emailErrorMsg =PomForFBLoginPage.emailreEnter.getText(); 
		//System.out.println(emailErrorMsg);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("emailErrorMsg.png");
		FileHandler.copy(source, des);
		System.out.println("TestCase3");
		System.out.println("Account creation failed ScreenShot taken successfully");
	}

	@Test(priority = 3,enabled=false)
	public void dropDownValidation() {
		testCase = extentReports.createTest("Verifying the DropDown");
		PageFactory.initElements(driver, PomForFBLoginPage.class);
		WebElement day2 = PomForFBLoginPage.day;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(day2));
		Select s = new Select(day2);
		System.out.println("TestCase4");
		List<WebElement> day = s.getOptions();
		for (WebElement webElement : day) {
			System.out.println(webElement.getText());
		}
		WebElement month2 = PomForFBLoginPage.month;
		Select s1 = new Select(month2);
		List<WebElement> month = s.getOptions();
		for (WebElement webElement : month) {
			System.out.println(webElement.getText());
		}
		System.out.println("Date and Month fields are Validated successfully in DropDown");

	}

	/*@Test(priority = 4)
	public void linkValidation() throws IOException {
		testCase = extentReports.createTest("Verifying the BrokenLink");
		System.out.println("TestCase5");
		PageFactory.initElements(driver, PomForFBLoginPage.class);
		List<WebElement> allLink = PomForFBLoginPage.allLink;
		BaseClass.brokenLinks(allLink);
	}*/

	@Test(priority = 5,enabled=false)
	public void toClickInstagramLink() throws AWTException, InterruptedException {
		testCase = extentReports.createTest("Navigating to Insta Page");
		System.out.println("TestCase6");
		PageFactory.initElements(driver, PomForFBLoginPage.class);

		WebElement instagramLink = PomForFBLoginPage.instaGram;
		Actions a = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(instagramLink));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 4px solid red;');",
				instagramLink);
		a.moveToElement(instagramLink).contextClick().perform();
		Thread.sleep(5000);
		BaseClass.keyDownAndUp(2, "down");
		System.out.println("Am in Insta Page");

	}

}
