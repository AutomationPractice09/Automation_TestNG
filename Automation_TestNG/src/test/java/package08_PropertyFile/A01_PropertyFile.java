package package08_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class A01_PropertyFile 
{
  @Test
  public void readPropertyFile() throws IOException 
  {
	  File f1 = new File(System.getProperty("user.dir")+"//config.properties");
	  
	  FileInputStream fs = new FileInputStream(f1);
	  
	  Properties p1 = new Properties();
	  p1.load(fs);
	  
	  System.out.println("Browser name is: "+p1.getProperty("bname"));
	  System.out.println("Browser name is: "+p1.getProperty("version"));
  }
}
