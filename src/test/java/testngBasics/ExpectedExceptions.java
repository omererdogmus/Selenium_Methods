package testngBasics;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void test1() {
		System.out.println("Executing test 1");
	}
	
	@Test(expectedExceptions = IOException.class)
	public void test2() throws Exception {
		throw new IOException();
	}

}
