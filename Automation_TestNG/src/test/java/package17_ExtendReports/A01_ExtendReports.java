package package17_ExtendReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class A01_ExtendReports {
  @Test
  public void testReport() 
  {
	  //create instance of object
	  ExtentReports extent = new ExtentReports();
	  
	  //path of report
	  ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//Automation.html");
	  
	  //report configuration
	  spark.config().setDocumentTitle("Automation Report");
	  spark.config().setReportName("Sprint UG_0.36");
	  spark.config().setReportName("Digvijay Patil");
	  spark.config().setTheme(Theme.STANDARD);
	
	  //attachment
	  extent.attachReporter(spark);
	  
	  //create test
	  ExtentTest test = extent.createTest("AutomationTestScript");
	  
	  //logs
	  test.log(Status.PASS,"Test 1 is Pass");
	  test.log(Status.FAIL,"Test 2 is Fail");
	  test.log(Status.SKIP,"Test 3 is Skipped");
	  test.log(Status.INFO,"Test 4 is Information");
	  
	  //flush
	  extent.flush();
  }
}
