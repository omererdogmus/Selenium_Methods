package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/omererdogmus/Documents/Drivers/chromedriver");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");

		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
	}

}
