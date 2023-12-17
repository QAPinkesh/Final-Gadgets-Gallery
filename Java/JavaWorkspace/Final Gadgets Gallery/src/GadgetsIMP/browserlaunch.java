package GadgetsIMP;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class browserlaunch {
	
	public String URL , browser , email , password ;
	protected WebDriver driver ;
	
	@BeforeTest
	public void configbrowserlaunch() throws Exception
	{
		System.out.println("BeforeSuite Method run first");
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("./src/Config.properties");
		prop.load(file);
		
		URL = prop.getProperty("URL");
		browser = prop.getProperty("browser");
		email = prop.getProperty("username");
		password = prop.getProperty("password");
		
		System.out.println(browser);
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//return driver;
	}
	
	@AfterTest
	public void closeall() throws Exception
	{
		Thread.sleep(8000);
		driver.close();
	}
}
