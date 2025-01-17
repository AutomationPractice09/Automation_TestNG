package package00_Utility;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class A04_FullScreenshot 
{
	
	public void fullScreenshot(WebDriver driver)
	{
		Screenshot sr = new AShot()
		  .shootingStrategy(ShootingStrategies.viewportPasting(100))
		  .takeScreenshot(driver);
		
		File dest = new File(System.getProperty("user.dir")+"//Screenshots//full"+System.currentTimeMillis()+".png");
		
		try {
			ImageIO.write(sr.getImage(),"PNG", dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
