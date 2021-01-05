package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IdConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		// ID
		// First Usage
		WebElement userElement = driver.findElement(By.id("username"));
		userElement.sendKeys("omer@gmail.com");
		WebElement userPassword = driver.findElement(By.id("password"));
		userPassword.sendKeys("test123@");
		WebElement loginbtn = driver.findElement(By.id("loginBtn"));
		loginbtn.click();
		
		// Second Usage
		driver.findElement(By.id("username")).sendKeys("omer@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123@");
		driver.findElement(By.id("loginBtn")).click();
		
		// Third Usage
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		WebElement userelement = driver.findElement(username);
		userelement.sendKeys("omer@gmail.com");
		WebElement passelement = driver.findElement(password);
		passelement.sendKeys("test123@");
		WebElement loginelement = driver.findElement(loginBtn);
		loginelement.click();
		
		// Fourth Usage
		ElementUtil.getElement(driver, username).sendKeys("omer@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("test123@");
		ElementUtil.clickOn(driver, loginBtn);

	}

}
