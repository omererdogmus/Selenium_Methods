package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize web page
		driver.manage().deleteAllCookies();	// delete all cookies
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		By signup = By.linkText("Sign up");
		ElementUtil.getElement(driver, signup).click();
		By signup1 = By.partialLinkText("Sign");
		ElementUtil.getElement(driver, signup1).click();
		
		

	}

}
