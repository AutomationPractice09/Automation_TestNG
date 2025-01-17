package package10_parrExeDataProv;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A01_ParrExeDataProv 
{
	
	WebDriver driver;
	
	@Parameters({"bname"})
  @Test
  public void broserSelect(String bname) 
  {
	  if(bname.equalsIgnoreCase("chrome"))
	  {
		  driver = new ChromeDriver();
	  }  
	  else if (bname.equalsIgnoreCase("firefox"))
	  {
		  driver = new FirefoxDriver();
	  }
	  else if (bname.equalsIgnoreCase("edge"))
	  {
		  driver = new EdgeDriver();
	  }
	  
	  driver.get("https://google.com");
	  System.out.println(driver.getTitle());
  }
}
