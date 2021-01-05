package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_046_MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement content = driver.findElement(By.className("menulink"));
		Actions actions = new Actions(driver);
		actions.moveToElement(content).build().perform();
		WebElement courseLink = driver.findElement(By.linkText("COURSES"));
		Thread.sleep(2000);
		courseLink.click();
	}
}
