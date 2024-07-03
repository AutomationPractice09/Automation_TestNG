package package02_TestngAnnotations;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class A01_BeforeMethodAfterMethod {
	@Test (priority=1)
	  public void registrationTC() 
	  {
		  System.out.println("This is Registration TC");
	  }
	  
	  @Test (priority=2)
	  public void logINTC() 
	  {
		  System.out.println("This is Log In TC");
	  }
	  
	  @Test (priority=3)
	  public void searchTC() 
	  {
		  System.out.println("This is Search TC");
	  }
	  
	  
	  @BeforeMethod
	  public void bmethod() 
	  {
		  System.out.println("This is Before Method TC");
	  }
	  
	  @AfterMethod
	  public void amethod() 
	  {
		  System.out.println("This is After Method TC");
	  }	  
}