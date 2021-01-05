package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_007_AlertHandling_2 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// Locator
		driver.findElement(By.name("proceed")).click();
		//getAlertText();
		
		if(ElementUtil.getAlertText(driver).equals("Please enter a valid user name")) {
			System.out.println("Correct text");
		} else {
			System.out.println("Incorrect text");
		}
		
		driver.quit();
		System.out.println("Alert is handled...");

	}

	// Generic method == common method
//	public static String getAlertText() {
//
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
//		return text;
//	}

}
