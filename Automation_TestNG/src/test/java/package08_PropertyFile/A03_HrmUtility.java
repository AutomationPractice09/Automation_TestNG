package package08_PropertyFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import package00_Utility.A01_FileRead;


public class A03_HrmUtility 
{
  @Test
  public void hrmTest() 
  {
	  A01_FileRead p1 = new A01_FileRead("config");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get(p1.getData("url"));
	  
	  driver.findElement(By.name("username")).sendKeys(p1.getData("un"));
	  driver.findElement(By.name("password")).sendKeys(p1.getData("pwd"));
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
}
