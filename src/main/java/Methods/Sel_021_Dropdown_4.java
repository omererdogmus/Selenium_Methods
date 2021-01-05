package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_021_Dropdown_4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		selectDropdownValueByIndex(driver, day, 15);
		selectDropdownValueByIndex(driver, month, 11);
		selectDropdownValueByIndex(driver, year, 34);
	}

	public static void selectDropdownValueByIndex(WebDriver driver, By locator, int index) {
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
}
