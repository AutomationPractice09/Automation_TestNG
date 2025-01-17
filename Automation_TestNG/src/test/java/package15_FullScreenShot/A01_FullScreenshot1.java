package package15_FullScreenShot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class A01_FullScreenshot1 
{
  @Test
  public void takeScreenshot() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://amazon.com");
	  
	  Screenshot sr = new AShot()
	  .shootingStrategy(ShootingStrategies.viewportPasting(100))
	  .takeScreenshot(driver);
	  
	  File dest = new File(System.getProperty("user.dir")+"//Screenshots//fullpage.png");
	  
	  try {
		ImageIO.write(sr.getImage(), "PNG", dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  System.out.println("Full Screenshot successfully taken");
  }
}
