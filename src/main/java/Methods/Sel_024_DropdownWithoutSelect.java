package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_024_DropdownWithoutSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/omererdogmus/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");

		// First step : select all options
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(dayList.size());

		// Second step : print all the values on the console
		for (int i = 1; i < dayList.size(); i++) {
			String text = dayList.get(i).getText();
			System.out.println(text);

			// Third step : select and click option
			if (text.equals("9")) {
				dayList.get(i).click();
				break;
				
			}
		}
	}
}
