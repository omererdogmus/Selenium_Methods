package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMenu6 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		// Select
		Select select1 = new Select(day);
		System.out.println(select1.isMultiple());
		select1.selectByIndex(15);
		Select select2 = new Select(month);
		System.out.println(select2.isMultiple());
		select2.selectByIndex(11);
		Select select3 = new Select(year);
		System.out.println(select3.isMultiple());
		select3.selectByIndex(34);


	}

}
