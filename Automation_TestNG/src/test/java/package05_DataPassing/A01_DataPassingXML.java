package package05_DataPassing;

import org.testng.annotations.*;

public class A01_DataPassingXML 
{
  @Parameters ({"un","pwd"})
  @Test
  public void loginTest(String un, String pwd) 
  {
	  System.out.println("Username is: "+un);
	  System.out.println("Password is: "+pwd);
  }
}
