package Methods;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_033_FluentWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click Me - Fluent Wait')]")).click();

		// Fluent Wait definition create fluent wait object

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				// set time how long it will wait
				.withTimeout(Duration.ofSeconds(20))
				// it will check every 2 seconds to find locator
				.pollingEvery(Duration.ofSeconds(1))
				// set exception if you could not find locator in specific time
				.ignoring(NoSuchMethodException.class);

		@SuppressWarnings("unused")
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.id("demo"));
				String getTextPage = element.getText();
				if (getTextPage.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println("text " + getTextPage);
					return element;
				} else {
					System.out.println("title is wrong");
					return null;
				}
			}
		});
	}
}
