package LoginModule;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import GadgetsIMP.browserlaunch;

public class RegisteraccountGadget extends browserlaunch {
	
	@Test
	public void registeraccount() throws Exception
	{
		//URL="http://122.170.14.195:8080/uth/gadgetsgallery/catalog/index.php";
		System.out.println(driver.getCurrentUrl());
		//driver.get(URL);
//		driver.navigate().to(URL);
		
		//Thread.sleep(5000);
		driver.findElement(By.linkText("create an account")).click();
		
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("firstname")).sendKeys("Khushi");
		driver.findElement(By.name("lastname")).sendKeys("Parekh");
		driver.findElement(By.name("dob")).sendKeys("12/26/2015");
		driver.findElement(By.name("email_address")).sendKeys("Khushi.parekh@pinkesh.com");
		driver.findElement(By.name("company")).sendKeys("Tech Mahindara Ahmedabad");
		driver.findElement(By.name("street_address")).sendKeys("Mahadevnagar Tekra");
		driver.findElement(By.name("suburb")).sendKeys("Vastral road. Nr. Kameshwar park");
		driver.findElement(By.name("postcode")).sendKeys("382404");
		driver.findElement(By.name("city")).sendKeys("Ahmedabad");
		driver.findElement(By.name("state")).sendKeys("Gujarat");
		driver.findElement(By.name("telephone")).sendKeys("+919225478458");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/div/div[5]/table/tbody/tr[2]/td[2]/input")).sendKeys("123789");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("password")).sendKeys("n0t3st");
		driver.findElement(By.name("confirmation")).sendKeys("n0t3st");
		
		
		System.out.println(driver.getCurrentUrl());
		
	}
}
