package Recap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap19 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.chase.com/");

		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

		System.out.println(iframes.size());

		driver.switchTo().frame(0);

		driver.findElement(By.id("userId-text-input-field")).sendKeys("cemilkoc");
		driver.findElement(By.id("password-text-input-field")).sendKeys("password123");

		// driver.findElement(By.id("signin-button")).click();

		driver.switchTo().defaultContent();

		System.out.println(driver.findElement(By.linkText("Open an account")).getText());

	}

}
