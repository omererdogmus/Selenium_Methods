package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_003_WebDriverManager {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

		String title = driver.getTitle();
		System.out.println("Page title : " + title);

		if (title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		driver.close();
		System.out.println("Test completed...");

	}

}
