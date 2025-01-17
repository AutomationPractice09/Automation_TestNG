package package11_POM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//here we Apply Encapsulation i.e Binding private Data + public Methods

public class A01_LoginPage 
{
	
	private WebDriver driver;
	
	//initialization of driver
	public A01_LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//private data
	private By un = By.name("username");
	private By pwd = By.name("password");
	private By login = By.xpath("//button[@type='submit']");
	
	
	//public methods
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public String getURL()
	{
		return driver.getCurrentUrl();
	}
	
	
	public void login()
	{
		driver.findElement(un).sendKeys("Admin");
		driver.findElement(pwd).sendKeys("admin123");
		driver.findElement(login).click();
	}
	

}
