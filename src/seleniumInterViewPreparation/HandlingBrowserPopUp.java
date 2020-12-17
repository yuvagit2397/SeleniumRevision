package seleniumInterViewPreparation;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingBrowserPopUp {

	public static void main(String[] args) {
		
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("profile.default_content_setting_values.notifications", 1);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://examsdaily.in/");
	}

}
