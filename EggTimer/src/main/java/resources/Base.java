package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver InitializeBrowser() throws IOException
	{
	
	prop=new Properties();//Using properties class to read the data from properties file
	FileInputStream fis=new FileInputStream("/Users/harshavardhanmukala/eclipse-workspace/EggTimer/src/main/java/resources/Details.properties");
	prop.load(fis);	
	String BrowserName=prop.getProperty("Browser");
	
	if(BrowserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "/Users/harshavardhanmukala/Documents/Work/chromedriver");//give the path of the driver which you are using while running it
		driver=new ChromeDriver();
	}
	else if(BrowserName.equals("FireFox"))
	{
		//set the property of firefox driver
	}
	
	else if(BrowserName.equals("IE"))
	{
		//set the property of IE driver
	}
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	return driver;
	
	}
}
