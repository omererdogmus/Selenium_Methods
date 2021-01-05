package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		// Implicitly Wait
		// This wait tells webdriver to wait if the element is not available immediately
		// Webdriver waits until the element is visible in specified time
		// NoSuchElementException 
		// Implicitly Wait works only element - does not work with non-element
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("username")).sendKeys("omer@gmail.com");
		
		System.out.println("Title is : " + driver.getTitle());
		

	}

}
