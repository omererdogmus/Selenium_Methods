package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_014_CSS {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);

		// First usage
		WebElement userElement = driver.findElement(By.cssSelector("#username"));
		userElement.sendKeys("newyork@sample.com");
		WebElement passElement = driver.findElement(By.cssSelector("#password"));
		passElement.sendKeys("test1234");
		WebElement loginBtn = driver.findElement(By.cssSelector("#loginBtn"));
		loginBtn.click();

		// Second usage
		driver.findElement(By.cssSelector("#username")).sendKeys("newyork@sample.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("test123456");
		driver.findElement(By.cssSelector("#loginBtn")).click();

		// Third usage
		By username = By.cssSelector("#username");
		WebElement element = driver.findElement(username);
		element.sendKeys("omer@gmail.com");
		By password = By.cssSelector("#password");
		WebElement element2 = driver.findElement(password);
		element2.sendKeys("test1234");
		By loginBtn1 = By.cssSelector("loginBtn");
		WebElement element3 = driver.findElement(loginBtn1);
		element3.click();
	}

}
