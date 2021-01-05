package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap11 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing2");

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		By seconds = By.id("demo");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.textToBePresentInElementLocated(seconds, "6 seconds"));

		String text = driver.findElement(seconds).getText();

		System.out.println(text);
	}

}
