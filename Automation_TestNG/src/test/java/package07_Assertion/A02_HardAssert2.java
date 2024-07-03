package package07_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A02_HardAssert2 
{
  @Test
  public void hardAssert() 
  {
	  String exp = "This is required string";
	  String act = "This is not required string";
	  
	  Assert.assertEquals(act, exp,"Strings are not equal");      //it throws AssertionError
	  
	  System.out.println("Strings are equal");
  }
}
