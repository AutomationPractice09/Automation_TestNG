package package07_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A03_SoftAssert1 
{
  @Test
  public void softAssert() 
  {
	  int a = 55, b = 67;
	  
	  SoftAssert sf = new SoftAssert();
	  sf.assertEquals(a, b,"Integers are not equal");
	  
	  System.out.println("Integeres are equal");
	  
	  sf.assertAll();
  }
}
