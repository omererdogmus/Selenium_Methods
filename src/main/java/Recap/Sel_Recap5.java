package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap5 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/login");

		// CSS SELECTOR
		// #id
		// tagName.classValue

		// tagName[attribute='value']
		// tagName[attribute='value'][attribute='value']
		// input[id='username'][name='session_key']

		WebElement username = driver.findElement(By.cssSelector("input[id='username'][name='session_key']"));
		username.sendKeys("cemil@sample.com");

		WebElement pass = driver.findElement(By.cssSelector("#password"));
		pass.sendKeys("123@Test");

		// .btn__primary--large -- Using class value
		WebElement signBtn = driver.findElement(By.cssSelector(".btn__primary--large"));
		signBtn.click();

	}

}
