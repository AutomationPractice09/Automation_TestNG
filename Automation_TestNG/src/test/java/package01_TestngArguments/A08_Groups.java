package package01_TestngArguments;

import org.testng.annotations.Test;

public class A08_Groups 
{
	@Test (priority=1,groups="Smoke")
	  public void registrationTC() 
	  {
		  System.out.println("This is Registration TC");
	  }
	  
	  @Test (priority=2,groups="Functional")
	  public void logINTC() 
	  {
		  System.out.println("This is Log In TC");
	  }
	  
	  @Test (priority=3,groups="Functional")
	  public void logoutTC() 
	  {
		  System.out.println("This is Logout TC");
	  }
	  
	  @Test (priority=4,groups="Functional")
	  public void search() 
	  {
		  System.out.println("This is Registration TC");
	  }
	  
	  @Test (priority=5,groups="Smoke")
	  public void explore() 
	  {
		  System.out.println("This is Log In TC");
	  }
	  
	  @Test (priority=6,groups="Functional")
	  public void ibmme() 
	  {
		  System.out.println("This is Logout TC");
	  }
}
