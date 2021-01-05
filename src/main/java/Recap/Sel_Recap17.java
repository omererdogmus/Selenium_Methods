package Recap;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap17 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		By tabBtn = By.id("newTabBtn");

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		ElementUtil.clickOn(driver, tabBtn);

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		Thread.sleep(2000);

		// Switch to new opened tab
		driver.switchTo().window(tabs.get(1));

		driver.findElement(By.id("firstName")).sendKeys("Cemil");
		driver.findElement(By.id("lastName")).sendKeys("Koc");

		System.out.println("Tab's title : " + driver.getTitle());

		driver.close();

		// Switch to parent window
		driver.switchTo().window(tabs.get(0));

		System.out.println("Parent window's Title : " + driver.getTitle());

		driver.quit();

	}

}
