package package15_FullScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import package00_Utility.A04_FullScreenshot;

public class A02_FullScreenShot2 {
  @Test
  public void screenShot() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://facebook.com");
	  
	  A04_FullScreenshot sr = new A04_FullScreenshot();
	  sr.fullScreenshot(driver);
  }
}
