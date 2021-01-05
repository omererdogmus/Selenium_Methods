package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap14 {
	
	// File Uploading

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/upload/");

		WebElement fileUpload = ElementUtil.getElement(driver, By.id("uploadfile_0"));

		String path = "/Users/omererdogmus/Desktop/SiliconeLabs/HTML/Images/Untitled.png";

		fileUpload.sendKeys(path);

		driver.findElement(By.id("submitbutton")).click();
	}

}
