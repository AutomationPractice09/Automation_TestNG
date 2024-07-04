package package11_POM1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class A00_BaseClass 
{
	
	public WebDriver driver;
	public A01_LoginPage lp;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp = new A01_LoginPage(driver);
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();	
	}
	
}
