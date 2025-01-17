package package11_POM1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A03_LoginTest extends A00_BaseClass
{
	
  @Test(priority=1)
  public void verifyURL() 
  {
	  // A01_LoginPage lp = new A01_LoginPage();   ---> we can create object in Base class
	  String url = lp.getURL();
	  Assert.assertTrue(url.contains("hrm"),"Test is Failed and URL is not Match");
	  System.out.println("Test is Passed and URL is matched");
  }
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String title = lp.getTitle();
	  Assert.assertTrue(title.contains("HRM"),"Test is Failed and URL is not Match");
	  System.out.println("Test is Passed and Title is matched");
  }
  
  @Test(priority=3)
  public void login() 
  {
	  lp.login();
	  String url = driver.getCurrentUrl();
	  Assert.assertTrue(url.contains("dashboard"),"Test is Failed and URL is not Match");
	  System.out.println("Test is Passed and Login is done");
  }
  
}
