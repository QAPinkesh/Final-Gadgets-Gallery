package LoginModule;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import GadgetsIMP.browserlaunch;

public class LoginGadget extends browserlaunch {

	
	@Test
	public void loginwebsite() throws Exception
	{
		System.out.println("Loginweb : " + driver.getCurrentUrl());
		driver.navigate().to(URL);
		driver.findElement(By.linkText("log yourself in")).click();
		
		// Data fill on login page and click button
		driver.findElement(By.name("email_address")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
		
		System.out.println("End Login WEB" + driver.getCurrentUrl());
		
	}
	
	
}
