package package12_DataProviderArray;

import org.testng.annotations.DataProvider;

public class A00_DataSet {

	@DataProvider(name="mydata")
	public Object[][] testData()
	{
		Object data[][] = {{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"},{"error_user","secret_sauce"}};
		return data;
	}
}