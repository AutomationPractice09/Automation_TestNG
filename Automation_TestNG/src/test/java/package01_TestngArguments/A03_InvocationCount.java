package package01_TestngArguments;

import org.testng.annotations.Test;

public class A03_InvocationCount {
	@Test(priority = 1, invocationCount = 2)
	public void registrationTC() {
		System.out.println("This is Registration TC");
	}

	@Test(priority = 2, invocationCount = 3)
	public void logINTC() {
		System.out.println("This is Log In TC");
	}
}
