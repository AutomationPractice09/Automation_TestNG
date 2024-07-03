package package09_ParallelExecution;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A03_FirefoxTest {
	@Test
	public void firefoxTest() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	}
}
