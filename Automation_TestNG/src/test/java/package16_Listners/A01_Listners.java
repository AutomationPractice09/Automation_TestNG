package package16_Listners;

import org.testng.Assert;
import org.testng.annotations.*;

public class A01_Listners {
  @Test(priority=1)
  public void registrationTest() 
  {
	  System.out.println("This is Registration Test");
  }
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("This is Login Test");
	  Assert.assertEquals(true, false);
  }
}