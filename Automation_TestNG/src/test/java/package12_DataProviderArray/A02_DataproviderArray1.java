package package12_DataProviderArray;

import org.testng.annotations.Test;

public class A02_DataproviderArray1 {
  
	 @Test(dataProvider = "mydata", dataProviderClass = A00_DataSet.class)
	  public void doLogin(String un, String pwd) 
	  {
		  System.out.println(un);
		  System.out.println(pwd);
		  System.out.println("");
	  }
	
}
