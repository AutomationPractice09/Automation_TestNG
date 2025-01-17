package package04_TestngRealTime_1;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class A02_CRMTest extends A01_BaseClass        //here we used inheritance principle to keep before/after methods seperate from test methods
{
	@Test(priority = 1)
	public void signIN() 
	{
		driver.findElement(By.id("SignIn")).click();
	}

	@Test(priority = 2, dependsOnMethods = "signIN")
	public void logIN() 
	{
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-id")).click();
	}
}
