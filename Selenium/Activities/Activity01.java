package Activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver;

	@Test
	public void navigatewebsite() {
		
		
		driver = new FirefoxDriver();
		driver.navigate().to("https://alchemy.hguy.co/crm/");
		String title = driver.getTitle();
		System.out.println("The website title is: " +title);
		
		Assert.assertEquals(title,"SuiteCRM");
		driver.close();
	}
	
	
	
	}
	
