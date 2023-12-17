package LoginModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import GadgetsIMP.browserlaunch;

public class findproduct extends browserlaunch{

	
	@BeforeTest
	public void checkexecutionstatus()
	{
		System.out.println("BeforeTest method runs second");
	}
	@Test
	public void productfind() throws Exception
	{
		System.out.println("Test method runs third one");
		Thread.sleep(5000);
		driver.findElement(By.name("keywords")).sendKeys("JBL");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"left_sidebar\"]/div[3]/div[2]/form/input[4]")).click();
	}
}
