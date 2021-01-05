package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_031_ExplicitlyWait_1 {

	public static void main(String[] args) {

		// It works with web element and non-element
		// It uses WebDriverWait class

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		// Non-WebElement
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("H"));

		// WebElement
		By email = By.id("username");
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(email));
		WebElement username = driver.findElement(email);
		username.sendKeys("omer@newjersey.com");
		System.out.println(driver.getTitle());
	}

}
