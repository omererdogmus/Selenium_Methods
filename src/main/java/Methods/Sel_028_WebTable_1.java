package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_028_WebTable_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]

		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpathCompany = "]/td[1]";

		for (int i = 2; i <= 7; i++) {
			String actualXpath = beforeXpath + i + afterXpathCompany;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if (element.getText().equals("Island Trading")) {
				System.out.println("Company Name : " + element.getText() + "is found at position " + (i - 1));
				break;
			}
		}
		System.out.println("==================");

		String afterXpathContact = "]/td[2]";
		for (int i = 2; i <= 7; i++) {
			String actualXpath = beforeXpath + i + afterXpathContact;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}

		System.out.println("==================");
		
		String afterXpathCountry = "]/td[3]";
		for (int i = 2; i <= 7; i++) {
			String actualXpath = beforeXpath + i + afterXpathCountry;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
	}
}
