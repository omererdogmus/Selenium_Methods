package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_048_RightClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions actions = new Actions(driver);
		WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(), 'right click me')]"));
		// Context Click
		actions.contextClick(rightClick).build().perform();
		WebElement copyElement = driver.findElement(By.className("context-menu-icon-copy"));
		String text = copyElement.getText();
		System.out.println(text);
		

	}

}
