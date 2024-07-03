package package01_TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A04_DependsOn 
{
	@Test (priority=1)
	  public void registrationTC() 
	  {
		  System.out.println("This is Registration TC");
	  }
	  
	  @Test (priority=2,dependsOnMethods="registrationTC")
	  public void logINTC() 
	  {
		  System.out.println("This is Log In TC");
		  Assert.assertTrue(false);
	  }
	  
	  @Test (priority=3,dependsOnMethods="logINTC")
	  public void logoutTC() 
	  {
		  System.out.println("This is Logout TC");
	  }
}
