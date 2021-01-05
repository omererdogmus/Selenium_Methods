package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		
		// Xpath is used to find location of element on the web page using HTML structure (XML)
		// Absolute (/) , Relative (//)
		
		// //tagName[@attributeName='value']
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		// First Usage
		WebElement userelement = driver.findElement(By.xpath("//input[@id='username']"));
		userelement.sendKeys("omer@gmail.com");
		WebElement passelement = driver.findElement(By.xpath("//input[@id='password']"));
		passelement.sendKeys("test123@");
		
		// Second Usage
		
		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		ElementUtil.getElement(driver, username).sendKeys("omer@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("123test@");
		
	}

}
