package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[2]/td[3]
		
		//*[@id="customers"]/tbody/tr[2]/td[1]

		String beforeXpath = "// *[@id=\'customers\']/tbody/tr[";
		String afterXpathCompany = "]/td[1]";
		String afterXpathContact = "]/td[2]";
		String afterXpathCountry = "]/td[3]";

		getColomnData(driver, beforeXpath, afterXpathCompany);
		getColomnData(driver, beforeXpath, afterXpathContact);
		getColomnData(driver, beforeXpath, afterXpathCountry);
		
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]

	}

	public static int getTableCount(WebDriver driver) {
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowCount = rowList.size();
		 //System.out.println(rowCount);
		return rowCount;
	}

	public static ArrayList<String> getColomnData(WebDriver driver, String beforeXpath, String afterXpath) {
		ArrayList<String> data = new ArrayList<String>();
		for (int rowNum = 2; rowNum <= getTableCount(driver); rowNum++) {
			String actualXpath = beforeXpath + rowNum + afterXpath;
			// System.out.println(actualXpath);
			String text = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(text);
			data.add(text);
		}
		return data;
	}

}
