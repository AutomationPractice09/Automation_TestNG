package package07_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A01_HardAssert1 
{
  @Test
  public void hardAssert() 
  {
	  String exp = "This is required string";
	  String act = "This is required string";
	  
	  Assert.assertEquals(act, exp, "String are not equal");
	  
	  System.out.println("String are equal");
  }
}
