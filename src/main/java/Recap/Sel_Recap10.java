package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap10 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// table[@id='customers']/tbody/tr[1]/th[3]

		// Table headers

		String beforeXpath = "//table[@id='customers']/tbody/tr[1]/th[";
		String afterXpath = "]";

		System.out.println("Table headers : ");
		for (int i = 1; i <= 3; i++) {
			String xPath = beforeXpath + i + afterXpath;
			WebElement headers = driver.findElement(By.xpath(xPath));
			System.out.println(headers.getText());

		}

		String beforeXpath2 = "//table[@id='customers']/tbody/tr[";
		String afterXpathCompany = "]/td[1]";
		String afterXpathContact = "]/td[2]";
		String afterXpathCountry = "]/td[3]";
		
		System.out.println("\nCompany Names :");
		tableHandler(beforeXpath2, afterXpathCompany, 2, 7, driver);
		
		System.out.println("\nContact Names :");
		tableHandler(beforeXpath2, afterXpathContact, 2, 7, driver);
		
		System.out.println("\nCountry Names :");
		tableHandler(beforeXpath2, afterXpathCountry, 2, 7, driver);
	}

	public static void tableHandler(String before, String after, int start, int end, WebDriver driver) {
		for (int i = start; i <= end; i++) {
			String xPath = before + i + after;
			WebElement rowData = driver.findElement(By.xpath(xPath));
			System.out.println(rowData.getText());
		}
	}

}
