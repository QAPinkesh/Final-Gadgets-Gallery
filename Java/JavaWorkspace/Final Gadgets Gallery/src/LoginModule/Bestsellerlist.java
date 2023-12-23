package LoginModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GadgetsIMP.browserlaunch;

public class Bestsellerlist extends browserlaunch {
	WebElement parentelement;
	List<WebElement> listelement;
	
	@Test
	public void bestseller() throws Exception
	{
		parentelement = driver.findElement(By.xpath("//*[@id=\"right_sidebar\"]/div[2]/div[2]"));	
		listelement = parentelement.findElements(By.tagName("a"));
		
		for(int count=0;count<listelement.size();count++)
		{
			System.out.println(listelement.get(count).getText());
			listelement.get(count).click();
			Thread.sleep(1500);
			driver.navigate().back();
			parentelement = driver.findElement(By.xpath("//*[@id=\"right_sidebar\"]/div[2]/div[2]"));	
			listelement = parentelement.findElements(By.tagName("a"));
			Thread.sleep(1500);
			
		}
	
	}
	

}
