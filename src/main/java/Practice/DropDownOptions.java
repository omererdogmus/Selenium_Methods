package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		// Select
		Select selectDay = new Select(day);

		// Writing all values
		List<WebElement> dayOptions = selectDay.getOptions();
		System.out.println(dayOptions.size());

		for (int i = 0; i < dayOptions.size(); i++) {
			System.out.println(dayOptions.get(i).getText());
		}

		// Select
		Select selectMonth = new Select(month);

		// Writing all values
		List<WebElement> monthOptions = selectMonth.getOptions();
		System.out.println(monthOptions.size());
		for (int i = 0; i < monthOptions.size(); i++) {
			System.out.println(monthOptions.get(i).getText());
		}

		// Select
		Select selectYear = new Select(year);

		// Writing all values
		List<WebElement> yearOptions = selectYear.getOptions();
		System.out.println(yearOptions.size());
		for (int i = 0; i < yearOptions.size(); i++) {
			System.out.println(yearOptions.get(i).getText());
		}

	}
}
