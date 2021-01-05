package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_011_Name {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		
		//1st
		WebElement userelement = driver.findElement(By.name("username"));
		userelement.sendKeys("texas@gmail.com");
		
		//2nd
		driver.findElement(By.name("username")).sendKeys("ohio@gmail.com");
		
		//3rd
		By username = By.name("username");
		WebElement element = driver.findElement(username);
		element.sendKeys("ahmet@gmail.com");
		
		//4th
		ElementUtil.getElement(driver, username).sendKeys("last@gmail.com");
		
	}

}
