package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenuWithoutSelect {

	public static void main(String[] args) {

		// Interview Question
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");

		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(dayList.size());
		for (int i = 0; i < dayList.size(); i++) {
			String days = dayList.get(i).getText();
			System.out.println(days);
			if (days.equals("15")) {
				dayList.get(i).click();
				break;
			}
		}

		List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(monthList.size());
		for (int i = 0; i < monthList.size(); i++) {
			String months = monthList.get(i).getText();
			System.out.println(months);
			if (months.equals("Nov")) {
				monthList.get(i).click();
				break;
			}
		}

		List<WebElement> yearList = driver.findElements(By.xpath("//select[@id='year']/option"));
		System.out.println(yearList.size());
		for (int i = 0; i < yearList.size(); i++) {
			String years = yearList.get(i).getText();
			System.out.println(years);
			if (years.equals("1987")) {
				yearList.get(i).click();
				break;
			}
		}

	}

}
