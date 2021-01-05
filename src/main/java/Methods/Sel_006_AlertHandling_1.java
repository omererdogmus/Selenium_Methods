package Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_006_AlertHandling_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Locator
		driver.findElement(By.name("proceed")).click();
		
		// Alert Handling
		Alert alert = driver.switchTo().alert(); // Calling alert interface
		
		String text = alert.getText();
		System.out.println("Alert message : " + text);
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct message " + text);
		} else {
			System.out.println("Incorrect message " + text);
		}
		
		alert.accept();
	}

}
