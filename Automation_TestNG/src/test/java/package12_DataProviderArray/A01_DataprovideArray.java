package package12_DataProviderArray;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//when data is available inside same class


public class A01_DataprovideArray 
{
	@DataProvider(name="mydata")
	public Object[][] testData()
	{
		Object data[][] = {{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"},{"error_user","secret_sauce"}};
		return data;
	}
	

	
  @Test(dataProvider="mydata")
  public void doLogin(String un, String pwd) 
  {
	  System.out.println(un);
	  System.out.println(pwd);
	  System.out.println("");
  }
}
