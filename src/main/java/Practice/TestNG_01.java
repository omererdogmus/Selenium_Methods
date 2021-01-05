package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_01 {

	public static WebDriver driver;

	By javaScriptAlertBtn = By.xpath("//a[contains(text(),'Javascript Alerts')]");
	By exampleBtn = By.xpath("//a[@class='practice-header-icons text-success']");
	By alertButton = By.xpath("//button[@class='btn btn-default']");

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bobit.us/practice");
	}

	@Test()
	public void navigateAlertPage() {
		driver.findElement(exampleBtn).click();
		driver.findElement(javaScriptAlertBtn).click();
		driver.findElement(alertButton).click();
	}

	@Test()
	public void alertBoxTitle() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Assert.assertEquals(text, "I am an alert box!");
		alert.accept();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
