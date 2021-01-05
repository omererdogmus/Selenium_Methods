package Methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_037_WindowHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");

		driver.findElement(By.linkText("Good PopUp #3")).click();

		// to get all available windows
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		String parentWindowId = iterator.next();
		System.out.println("Parent Window Id : " + parentWindowId);

		String childWindowId = iterator.next();
		System.out.println("Child Window Id : " + childWindowId);

		driver.switchTo().window(childWindowId);
		System.out.println("Child Title : " + driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window Title : " + driver.getTitle());
		driver.close();

	}

}
