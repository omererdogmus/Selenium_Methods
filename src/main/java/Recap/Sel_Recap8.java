package Recap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Methods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap8 {

	static WebDriver driver;

	public static void main(String[] args) {

		// findElement()
		// return single element
		// Throws NoSuchElementException if there is no match
		// findElements()
		// return a whole list of elements
		// It will return an empty list if there is no match

		WebDriverManager.chromedriver().setup();
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, "https://www.linkedin.com");
		List<WebElement> listElements = driver.findElements(By.tagName("a"));
		System.out.println(listElements.size());
		for (int i = 0; i < listElements.size(); i++) {
			String text = listElements.get(i).getText();
			// System.out.println(text);
			if (!text.isEmpty()) {
				System.out.println(text);
			}
			if (text.equals("Press")) {
				listElements.get(i).click();
				break;
			}
		}
	}
}
