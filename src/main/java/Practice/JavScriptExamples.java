package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavScriptExamples {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.darksky.net/");
		driver.manage().window().maximize();

		String title = ScriptUtil.getTitleByJS(driver);
		System.out.println(title);

		ScriptUtil.scrollPageDown(driver);
		
		ScriptUtil.specificScrollPageDown(driver);
		
		System.out.println(ScriptUtil.getPageInnerText(driver));
		
		ScriptUtil.refreshBrowserByJS(driver);
	}

}
