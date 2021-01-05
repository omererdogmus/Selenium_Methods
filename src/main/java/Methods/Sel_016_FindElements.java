package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_016_FindElements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); // no need local driver
		// System.setProperty(key, value) // local driver needed
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// Find Elements
		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		// Size
		System.out.println(linklist.size());

		// To Get Links
		for (int i = 0; i < linklist.size(); i++) {
			String text = linklist.get(i).getText();
			// System.out.println(text);

			if (!text.isEmpty()) {
				System.out.println(text);
			}

			if (text.equals("Forgot Password?")) {
				linklist.get(i).click();
				break;
			}
		}
	}
}
