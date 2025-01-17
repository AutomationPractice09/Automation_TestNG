package package12_DataProviderArray;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A03_DataproviderReal 
{  
	@Test (dataProvider="mydata", dataProviderClass=A00_DataSet.class)
  public void doLogin(String un, String pwd) 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.id("user-name")).sendKeys(un);
	  driver.findElement(By.id("password")).sendKeys(pwd);
	  driver.findElement(By.id("login-button")).click();
	  String url = driver.getCurrentUrl();
	  Assert.assertTrue(url.contains("inventory"),"TC is Failed");
	  System.out.println("TC is Passed");
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  driver.quit();
  }
}
