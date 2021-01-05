package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_009_IDConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);

		// ID
		// First usage

		WebElement userelement1 = driver.findElement(By.id("username"));
		userelement1.sendKeys("newyork@sample.com");
		WebElement passelement1 = driver.findElement(By.id("password"));
		passelement1.sendKeys("test123456");
		WebElement loginBtn1 = driver.findElement(By.id("loginBtn"));
		loginBtn1.click();

		// Second usage
		driver.findElement(By.id("username")).sendKeys("newyork@sample.com");
		driver.findElement(By.id("password")).sendKeys("test123456");
		driver.findElement(By.id("loginBtn")).click();

		// Third usage
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");

		WebElement userelement = driver.findElement(username);
		userelement.sendKeys("omer@gmail.com");
		WebElement passelement = driver.findElement(password);
		passelement.sendKeys("test123@");
		WebElement loginelement = driver.findElement(loginBtn);
		loginelement.click();

		// Fourth usage
		ElementUtil.getElement(driver, username).sendKeys("omer@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("test123@");
		ElementUtil.clickOn(driver, loginBtn);

	}

}
