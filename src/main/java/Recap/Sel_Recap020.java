package Recap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Recap020 {
	
	@FindBy(name = "username")
	static WebElement username;
	
	@FindBy(name = "password")
	static WebElement password;
	
	@FindBy(xpath = "//input[@class='btn btn-small']")
	static WebElement loginButton;
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/a[1]/img[1]")
	static WebElement crmLogo;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		PageFactory.initElements(driver, Sel_Recap020.class);
		username.sendKeys("siliconelabs@sample.com");
		password.sendKeys("test1234");
		loginButton.click();
		System.out.println(crmLogo.isDisplayed());
		
	}

}
