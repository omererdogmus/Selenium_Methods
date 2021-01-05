package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NameLocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");

		Thread.sleep(3000);

		// Name
		// First Usage
		WebElement userelement = driver.findElement(By.name("username"));
		userelement.sendKeys("omer@gmail.com");
		WebElement passelement = driver.findElement(By.name("password"));
		passelement.sendKeys("test123@");
		WebElement login = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
		login.click();

		// Second Usage
		driver.findElement(By.name("username")).sendKeys("omererdogmus");
		driver.findElement(By.name("password")).sendKeys("test123@");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

		// Third Usage
		By username = By.name("username");
		By password = By.name("password");
		By loginBtn = By.xpath("//i[@class='fa fa-2x fa-sign-in']");

		WebElement userelement1 = driver.findElement(username);
		userelement1.sendKeys("omererdogmus");
		WebElement passwordelement = driver.findElement(password);
		passwordelement.sendKeys("test123@");
		WebElement loginBtn1 = driver.findElement(loginBtn);
		loginBtn1.click();

		// Fourth Usage
		ElementUtil.getElement(driver, username).sendKeys("omer@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("test123@");
		ElementUtil.clickOn(driver, loginBtn);

	}

}
