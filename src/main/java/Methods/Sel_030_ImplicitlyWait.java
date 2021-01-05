package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_030_ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {

		// This wait tells webdriver to wait if the element is not available immediately
		// Webdriver waits until the element is visible in specified time
		// NoSuchElementException
		// Imp wait can be used only with web element

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Implicitly Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		System.out.println("Title is : " + driver.getTitle()); // non-element
		
		//Synchronization
		

	}

}
