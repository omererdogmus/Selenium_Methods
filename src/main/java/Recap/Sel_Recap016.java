package Recap;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap016 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window : " + parentWindow);

		driver.findElement(By.id("newWindowBtn")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> iterator = handles.iterator();

		String parent = iterator.next();
		System.out.println("Parent Window : " + parent);

		String child = iterator.next();
		System.out.println("Child Window : " + child);

		// Switching to child window
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		System.out.println("Child window title is : " + driver.getTitle());

		// driver.close();

		// Switch back to parent window
		driver.switchTo().window(parent);
		System.out.println("Parent window title : " + driver.getTitle());

		driver.quit();

	}

}
