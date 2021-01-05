package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_005_NavigateGet {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Get method
		driver.get("https://www.google.com");

		Thread.sleep(2000);

		// Navigate method
		driver.navigate().to("https://www.amazon.com");

		Thread.sleep(2000);

		// Back method - provides to go back to previous page
		driver.navigate().back();

		Thread.sleep(2000);

		// Forward method
		driver.navigate().forward();

		Thread.sleep(2000);

		// Back method
		driver.navigate().back();

		Thread.sleep(2000);

		// Refresh method
		driver.navigate().refresh();

		Thread.sleep(2000);

		driver.quit();

	}

}
