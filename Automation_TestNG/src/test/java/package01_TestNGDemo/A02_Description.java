package package01_TestNGDemo;

import org.testng.annotations.Test;

public class A02_Description {
  @Test (priority=1,description="This is Test for Registration")
  public void registrationTC() 
  {
	  System.out.println("This is Registration TC");
  }
  
  @Test (priority=2,description="This is Test for Log IN")
  public void logINTC() 
  {
	  System.out.println("This is Log In TC");
  }
  
  @Test (priority=3,description="This is Test for Search TC")
  public void searchTC() 
  {
	  System.out.println("This is Search TC");
  }
  
  @Test (priority=4,description="This is Test for Add to Cart")
  public void addToCartTC() 
  {
	  System.out.println("This is Add To Cart TC");
  }
  
  @Test (priority=5,description="This is Test for ")
  public void logoutTC() 
  {
	  System.out.println("This is Logout TC");
  }
}
