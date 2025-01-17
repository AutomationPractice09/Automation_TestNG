package package06_RealTimeDataPassing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_OrangeHRM 
{
  @Parameters({"un","pwd"})
  @Test
  public void hrmLogin(String un, String pwd) throws IOException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
  }
}
