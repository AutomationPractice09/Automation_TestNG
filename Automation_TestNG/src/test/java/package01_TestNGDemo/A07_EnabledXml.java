package package01_TestNGDemo;

import org.testng.annotations.Test;

public class A07_EnabledXml 
{
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
	public void addToCartTC() 
	{
		System.out.println("This is Add To Cart TC");
	}
}