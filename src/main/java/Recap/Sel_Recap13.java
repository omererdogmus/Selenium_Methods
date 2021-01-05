package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap13 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement element = driver.findElement(By.id("vfb-7-1"));
		
		element.click();
		
		System.out.println("Radio option1 is selected : " + element.isSelected());
		
		WebElement element2 = ElementUtil.getElement(driver, By.id("vfb-7-2"));
		
		element2.click();
		
		System.out.println("Radio option2 is selected : " + element2.isSelected());
		System.out.println("Radio option1 is selected : " + element.isSelected());
		
		
		WebElement element3 = ElementUtil.getElement(driver, By.id("vfb-6-0"));
		
		element3.click();
		
		if(element3.isSelected()) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is not selected");
		}
		
		driver.quit();

	}

}
