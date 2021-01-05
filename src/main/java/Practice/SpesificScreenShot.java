package Practice;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpesificScreenShot {
	
	static WebDriver driver;
	static WebElement element;

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://learnsdet.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		element = driver.findElement(By.xpath("//img[@class='main-logo']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);
		
		File sscreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Point p = element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		
		Rectangle rectangle = new Rectangle(width + 600, height + 600);
		
		BufferedImage image = null;
		image = ImageIO.read(sscreenShot);
		
		BufferedImage dest = image.getSubimage(p.getX(), p.getY(), rectangle.width, rectangle.height);
		ImageIO.write(dest, "png", sscreenShot);
		
		FileUtils.copyFile(sscreenShot, new File("/Users/omererdogmus/Desktop/ScreenShot/tr.png"));
		
		driver.quit();
	}

}
