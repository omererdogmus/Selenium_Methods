package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessFireFox {
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "/Users/omererdogmus/Documents/Drivers/geckodriver");
		
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//		firefoxOptions.addArguments("--headless");
		
		WebDriver driver = new HtmlUnitDriver();
		//WebDriver driver = new FirefoxDriver(firefoxOptions);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
	}

}
