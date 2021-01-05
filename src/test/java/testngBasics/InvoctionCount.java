package testngBasics;

import org.testng.annotations.Test;

public class InvoctionCount {
	
	@Test(invocationCount = 5)
	public void createUser() {
		System.out.println("creating user ...");
	}
	
	@Test(invocationCount = 10)
	public void createAdmin() {
		System.out.println("creating admin ...");
	}

}
