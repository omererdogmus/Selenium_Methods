package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Methods.ElementUtil;

public class Sel_Recap6 {

	static WebDriver driver;
	static By username = By.id("username");
	static By password = By.cssSelector("#password");
	static By signInBtn = By.cssSelector(".btn__primary--large");
	static By errorMessage = By.id("error-for-username");
	static String message = "Hmm, we don't recognize that email. Please try again.";

	public static void main(String[] args) {

		driver = ElementUtil.launchBrowser(driver, "chrome");
		String url = "https://www.linkedin.com/login";
		ElementUtil.launchURL(driver, url);
		ElementUtil.sendKeys(driver, username, "omer@sample.com");
		ElementUtil.sendKeys(driver, password, "test1234");
		ElementUtil.clickOn(driver, signInBtn);
		String text = ElementUtil.getElement(driver, errorMessage).getText();
		if (text.equals(message)) {
			System.out.println("Correct statement");
		} else {
			System.out.println("Incorrect statement");
		}
	}
}
