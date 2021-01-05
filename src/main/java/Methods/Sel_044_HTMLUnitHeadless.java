package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_044_HTMLUnitHeadless {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new HtmlUnitDriver();

		// Webdriver components chrome, android, firefox, safari, HtmlUnitDriver()
		// HtmlUnitDriver() is the fastest

		driver.get("https://siliconelabs.com");
		System.out.println(driver.getTitle());

	}

}
