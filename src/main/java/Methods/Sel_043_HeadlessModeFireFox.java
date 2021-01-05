package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_043_HeadlessModeFireFox {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		driver.get("https://www.siliconelabs.com");
		System.out.println(driver.getTitle());

	}

}
