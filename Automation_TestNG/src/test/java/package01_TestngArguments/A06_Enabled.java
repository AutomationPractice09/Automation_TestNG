package package01_TestngArguments;

import org.testng.annotations.Test;

public class A06_Enabled 
{
	@Test(priority = 1, enabled=false)
	public void registrationTC() 
	{
		System.out.println("This is Registration TC");
	}

	@Test(priority = 2)
	public void logINTC() 
	{
		System.out.println("This is Log In TC");
	}
}
