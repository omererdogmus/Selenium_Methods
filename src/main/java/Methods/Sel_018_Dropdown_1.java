package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_018_Dropdown_1 {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(false);
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.facebook.com/r.php");

		WebElement day = driver.findElement(By.id("day"));
		Select selectday = new Select(day);
		selectday.selectByIndex(15);

		WebElement month = driver.findElement(By.id("month"));
		Select selectmonth = new Select(month);
		selectmonth.selectByVisibleText("Nov");

		WebElement year = driver.findElement(By.id("year"));
		Select selectyear = new Select(year);
		selectyear.selectByValue("1987");

	}

}
