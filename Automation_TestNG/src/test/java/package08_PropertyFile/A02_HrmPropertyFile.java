package package08_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A02_HrmPropertyFile 
{
  @Test
  public void hrmLogin() throws IOException 
  {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	  File f1 = new File(System.getProperty("user.dir")+"//config.properties");
	  FileInputStream fs = new FileInputStream(f1);
	  Properties p1 = new Properties();
	  p1.load(fs);	  
	  
	  driver.get(p1.getProperty("url"));
	  
	  driver.findElement(By.name("username")).sendKeys(p1.getProperty("un"));
	  driver.findElement(By.name("password")).sendKeys(p1.getProperty("pwd"));
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
}
