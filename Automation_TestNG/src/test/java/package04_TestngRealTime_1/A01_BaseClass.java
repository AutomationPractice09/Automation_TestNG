package package04_TestngRealTime_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class A01_BaseClass 
{
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() 
	{
		driver = new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");	
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	
	@AfterMethod
	public void title()
	{
		System.out.println("Title of page is: "+driver.getTitle());
	}
	
}
