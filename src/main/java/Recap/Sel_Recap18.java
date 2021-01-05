package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap18 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement draggable = driver.findElement(By.id("fourth"));
		WebElement droppable = driver.findElement(By.id("amt7"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(draggable, droppable).perform();

	}

}
