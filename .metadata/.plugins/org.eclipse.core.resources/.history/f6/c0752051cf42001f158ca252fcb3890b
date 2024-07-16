package package16_Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class A02_MyListerns implements ITestListener
{
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Pass: "+result.getMethod().getMethodName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Fail: "+result.getMethod().getMethodName());
	}
}
