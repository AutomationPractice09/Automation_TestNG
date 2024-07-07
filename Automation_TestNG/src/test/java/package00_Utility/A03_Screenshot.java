package package00_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class A03_Screenshot 
{
	
	public void screenshot(WebDriver driver, String filename, String project)
	{
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  
		  File temp = ts.getScreenshotAs(OutputType.FILE);
		  File dest = new File(System.getProperty("user.dir")+"//"+filename+"//"+project+System.currentTimeMillis()+".png");
		  
		  try {
			FileHandler.copy(temp, dest);
		  } catch (IOException e) 
		  {
			e.printStackTrace();
		  }
	}

}
