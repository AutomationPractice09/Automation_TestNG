package package14_Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import package00_Utility.A03_Screenshot;

public class A02_ScreenshotUtility {
  @Test
  public void screenShot() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://facebook.com");
	  
	  A03_Screenshot sr = new A03_Screenshot();
	  sr.screenshot(driver,"Screenshots","facebook");
	  
	  System.out.println("Screenshot done");
  }
}