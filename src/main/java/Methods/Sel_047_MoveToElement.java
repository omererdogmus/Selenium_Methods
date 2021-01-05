package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_047_MoveToElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://verizon.com");
		WebElement shop = driver.findElement(By.id("gnav20-Shop-L1"));
		Actions actions = new Actions(driver);
		actions.moveToElement(shop).build().perform();
		driver.findElement(By.id("gnav20-Shop-L3-1")).click();

	}
}
