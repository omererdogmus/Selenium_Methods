package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_001_WebDriverChrome {

	public static void main(String[] args) {
		
		// Set Property
		System.setProperty("webdriver.chrome.driver", "/Users/omererdogmus/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://siliconelabs.com/");
		
		// Get Title
		
		String title = driver.getTitle();
		System.out.println("Page title is " + title);
		
		// Validation == verify
		
		if(title.equals("Silicone Labs")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}
		
		//driver.close();
		driver.quit();
		
		System.out.println("Test is done");
		

	}

}
