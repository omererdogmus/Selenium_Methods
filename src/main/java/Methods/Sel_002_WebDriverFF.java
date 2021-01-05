package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_002_WebDriverFF {

	public static void main(String[] args) {

		// Set Property
		System.setProperty("webdriver.gecko.driver", "/Users/omererdogmus/Documents/Drivers/geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://siliconelabs.com/");

		// Get Title

		String title = driver.getTitle();
		System.out.println("Page title is " + title);

		// Validation == verify

		if (title.equals("Silicone Labs")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		// driver.close();
		driver.quit();

		System.out.println("Test is done");

	}

}
