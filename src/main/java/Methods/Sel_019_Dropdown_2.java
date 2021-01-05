package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_019_Dropdown_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/omererdogmus/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		selectDropdownValueByText(day, "15");
		selectDropdownValueByText(month, "Nov");
		selectDropdownValueByText(year, "1987");

		selectDropdownValueByIndex(day, 15);
		selectDropdownValueByIndex(month, 11);
		selectDropdownValueByIndex(year, 34);

	}

	/**
	 * 
	 * @param element
	 * @param value
	 */

	public static void selectDropdownValueByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * 
	 * @param element
	 * @param value
	 */

	public static void selectDropdownValueByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

}
