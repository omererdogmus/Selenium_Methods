package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_013_XPath {

	public static void main(String[] args) throws InterruptedException {

		// XPath is used to find location of element on the web page using HTML structure (XML)
		
		// Absolute XPath : it starts with single slash (/).
		// /html/body/div/div/div[2]/form/div[3]/div/div/div[2]/input
		
		// Relative XPath : it starts with double slash (//).
		// //*[@id="username"]

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);

		// First Usage
		WebElement userElement = driver.findElement(By.xpath("//input[@id='username']"));
		userElement.sendKeys("newyork@sample.com");
		WebElement userPassword = driver.findElement(By.xpath("//input[@id='password']"));
		userPassword.sendKeys("test123@");
		WebElement loginBtn = driver.findElement(By.xpath("//button[@id=\"loginBtn\"]"));
		loginBtn.click();

		// Second Usage
		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By loginButton = By.xpath("//button[@id=\\\"loginBtn\\\"]");
		
		ElementUtil.getElement(driver, username).sendKeys("omer@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("123test@");
		ElementUtil.getElement(driver, loginButton);
	}

}
