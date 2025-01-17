package package01_TestngArguments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A01_Priority {
	
	WebDriver driver;
	
	@Test (priority=1)
	public void signIN() 
	{
		driver = new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		driver.findElement(By.id("SignIn")).click();
		System.out.println("Sign IN TC runs successfully");
	}

	
	@Test (priority=2)
	public void loginIN() 
	{
		driver.findElement(By.id("email-id")).sendKeys("test123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("submit-id")).click();
		System.out.println("Login IN TC runs successfully");
	}
}
