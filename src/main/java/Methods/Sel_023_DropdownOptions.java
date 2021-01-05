package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_023_DropdownOptions {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(false);
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.facebook.com/r.php");

		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);

		// getOptions()
		// This method gets all options belonging to Select tag
		// This method returns List<WebElement>
		// It doesn't take parameter

		List<WebElement> dayOptions = select.getOptions();
		System.out.println("Option size is : " + dayOptions.size());

		// To print all options
		for (int i = 0; i < dayOptions.size(); i++) {
			// System.out.println(dayOptions.get(i).getText());
			String text = dayOptions.get(i).getText();
			System.out.print(text + " ");
		}
	}
}
