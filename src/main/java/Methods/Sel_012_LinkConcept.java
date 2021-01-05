package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_012_LinkConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // provides to maximize window
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		By signUp = By.linkText("Sign up");
		By signUp1 = By.partialLinkText("Privacy");
		ElementUtil.getElement(driver, signUp1).click();
		ElementUtil.getElement(driver, signUp).click();
		
		
	}

}
