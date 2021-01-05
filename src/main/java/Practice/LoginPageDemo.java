package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Methods.ElementUtil;

public class LoginPageDemo {

	public static WebDriver driver;
	static By email = By.id("username");
	static By password = By.xpath("//input[@id='password']");
	static By loginBtn = By.cssSelector("#loginBtn");

	public static void main(String[] args) throws InterruptedException {

		String url = "https://app.hubspot.com/login";
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		Thread.sleep(5000);
		ElementUtil.getElement(driver, email).sendKeys("omer@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("test123@");
		ElementUtil.clickOn(driver, loginBtn);
		ElementUtil.quitBrowser(driver);

	}

}