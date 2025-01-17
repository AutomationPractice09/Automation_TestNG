package package03_TestngRealTime;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class A01_CRM 
{
	
	public WebDriver driver;

	@Test (priority = 1)
	public void signIN() 
	{
		driver.findElement(By.id("SignIn")).click();
	}
	
	@Test (priority = 2, dependsOnMethods = "signIN")
	public void logIN() 
	{
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-id")).click();
	}
	

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
