package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_008_AlertHandling_3 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String url = "https://mail.rediff.com/cgi-bin/login.cgi";

		By goBtn = By.name("proceed");

		// Launch Browser
		driver = ElementUtil.launchBrowser(driver, "chrome");

		// Launch URL
		ElementUtil.launchURL(driver, url);

		// Get Title
		System.out.println(ElementUtil.getPageTitle(driver));

		// Click on
		ElementUtil.clickOn(driver, goBtn);
		
		Thread.sleep(3000);
		
		// Alert text
		String text = ElementUtil.getAlertText(driver);
		
		// Verification
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct text");
		} else {
			System.out.println("Incorrect text");
		}
		
		// Quit
		ElementUtil.quitBrowser(driver);
		
		System.out.println("Test is passed...!");
	}

}
