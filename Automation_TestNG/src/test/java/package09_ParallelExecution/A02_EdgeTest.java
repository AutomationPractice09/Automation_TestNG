package package09_ParallelExecution;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_EdgeTest 
{
  @Test
  public void edgeTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
}
