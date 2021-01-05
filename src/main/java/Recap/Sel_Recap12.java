package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap12 {
	
	// Element Visibility
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		
		By signIn = By.xpath("//button[contains(text(), 'Sign in')]");
		
		WebElement element = driver.findElement(signIn);
		
		// isDisplayed method to verify if the element present within web page
		
		boolean display = element.isDisplayed();
		
		System.out.println("Element displayed is : " + display);
		
		boolean enabled = element.isEnabled();
		
		System.out.println("Element enabled is : " + enabled);
		
		driver.quit();
		
	}

}
