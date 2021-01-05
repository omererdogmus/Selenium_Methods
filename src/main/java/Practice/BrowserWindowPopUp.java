package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		// getWindowHandle() == get the current window handling
		// getWindowHandles() == get the window handles that opened
		// switchTo().window == switch to between windows
		
		driver.findElement(By.className("black")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		String parentWindowId = iterator.next();
		System.out.println("Parent Window : " + parentWindowId);
		
		String childWindowId = iterator.next();
		System.out.println("Child Window : " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("Child window title : " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title : " + driver.getTitle());
		
		driver.close();

	}

}
