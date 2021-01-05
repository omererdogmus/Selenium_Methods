package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().fullscreen();
//		WebElement username = driver.findElement(By.name("session_key"));
//		WebElement password = driver.findElement(By.name("session_password"));
//		username.sendKeys("omer@yahoo.com");
//		password.sendKeys("test123");

		// 2

		// driver.findElement(By.name("session_key")).sendKeys("ahmet@siliconelabs.com");

		// 3
		By username = By.name("session_key");
//		
//		WebElement userNameElement = driver.findElement(username);
//		userNameElement.sendKeys("ahmet@siliconelabs.com");

		// 4
		ElementUtil.getElement(driver, username);
		Thread.sleep(2000);
		driver.close();
	}

}
