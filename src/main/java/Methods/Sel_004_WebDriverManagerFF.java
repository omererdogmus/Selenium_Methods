package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_004_WebDriverManagerFF {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.com");
		
		String title = driver.getTitle();
		System.out.println("title : " + title);
		
		driver.close();
		System.out.println("Test completed...");
		
	}

}
