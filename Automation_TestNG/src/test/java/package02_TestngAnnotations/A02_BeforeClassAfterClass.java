package package02_TestngAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class A02_BeforeClassAfterClass {

	@Test(priority = 1)
	public void registrationTC() 
	{
		System.out.println("This is Registration TC");
	}

	@Test(priority = 2)
	public void logINTC() 
	{
		System.out.println("This is Log In TC");
	}

	@Test(priority = 3)
	public void searchTC() 
	{
		System.out.println("This is Search TC");
	}
	

	@BeforeClass
	public void bClass() 
	{
		System.out.println("This is Before Class TC");
	}

	@AfterClass
	public void aClass() 
	{
		System.out.println("This is After Class TC");
	}
}