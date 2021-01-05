package testngBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	// dependsOnMethods
	
	@Test(priority = 1)
	public void loginTest() {
		System.out.println("login test");
		Assert.assertEquals("c", "s");
	}
	
	@Test(priority = 2, dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("home page");
		Assert.assertEquals("c", "s");
	}
	
	@Test(priority = 3, dependsOnMethods = "homePageTest")
	public void contactPage() {
		System.out.println("contact page");
	}
}
