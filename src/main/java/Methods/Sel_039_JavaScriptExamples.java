package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_039_JavaScriptExamples {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		//driver.manage().window().maximize();

		Thread.sleep(5000);

		String title = JavaScriptUtil.getTitleByJS(driver); // JavaScriptExecuter
		System.out.println(title);

		// System.out.println(driver.getTitle()); // WebDriver

		// Click method in JS
		// WebElement signupLink = driver.findElement(By.linkText("Sign up"));
		// JavaScriptUtil.clickElementByJS(signupLink, driver);

		// Refresh browser
		// JavaScriptUtil.refreshBrowserByJS(driver);

		// Generate alert
		// Reminder for the tester or sometimes give info for the client
		// JavaScriptUtil.generateAlert(driver, "Acceptance Test");

		// Draw border
		// JavaScriptUtil.drawBorder(signupLink, driver);

		// Send keys with JS
//		WebElement username = driver.findElement(By.id("username"));
//		JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "omer@sample.com");
//		JavaScriptUtil.drawBorder(username, driver);

		// Flash method with JS
		WebElement username = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		
//		JavaScriptUtil.flash(username, driver);
//		username.sendKeys("omer@gmail.com");
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("test12345");
//		JavaScriptUtil.flash(loginBtn, driver);
//		loginBtn.click();

		// Page inner
		// System.out.println(JavaScriptUtil.getPageInnerText(driver));

		// Get browser info
		// System.out.println(JavaScriptUtil.getBrowserInfo(driver));

		// Scroll down
		// JavaScriptUtil.scrollPageDown(driver);

		// Specific scroll
		// JavaScriptUtil.specificScrollPageDown(driver);
		
//		WebElement element = driver.findElement(By.xpath("//i18n-string[contains(text(), 'Privacy Policy')]"));
//		WebElement element2 = driver.findElement(By.linkText("Privacy Policy"));
		JavaScriptUtil.scrollIntoView(username, driver);

	}

}
