package Recap;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap7 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com");

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File file = new File("/Users/cemilkoc/eclipse-workspace/G4RecapLectures/screenshots/screenshot1.png");
		FileUtils.copyFile(source, file);

	}

	public static void takeScreenshot(WebDriver driver, String pathName) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(pathName);
		FileUtils.copyFile(source, destination);

	}

}
