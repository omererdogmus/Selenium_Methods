package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(driver.findElement(By.name("main")));
		System.out.println(driver.getTitle());
		
		WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'Title bar')]"));
		System.out.println(title.getText());
		
		driver.switchTo().defaultContent(); // to go main page
		System.out.println(driver.getTitle());
		
	}

}
