package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap9 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://techcanvass.com/examples/webtable.html");
		
		//table[@id='t01']/tbody/tr[2]/td[1]
		
		String beforeXpath = "//table[@id='t01']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		System.out.println("Company names are : ");
		for (int i = 2; i <= 4; i++) {
			String xPath = beforeXpath + i + afterXpath;
			WebElement row = driver.findElement(By.xpath(xPath));
			//System.out.println(row.getText());
			if(row.getText().equals("Suzuki")) {
				System.out.println("Company name : " + row.getText() + " is found at position " + (i-1));
			}
		}	
		
		String afterXpathMake = "]/td[2]";
		System.out.println("\nMake :");
		for (int i = 2; i <= 4; i++) {
			String xPath = beforeXpath + i + afterXpathMake;
			WebElement row = driver.findElement(By.xpath(xPath));
			System.out.println(row.getText());
		}
	}

}
