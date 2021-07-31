package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity3 {
	
	WebDriver driver;

@Test
	
	public void crtext() {
    
	driver = new FirefoxDriver();
	driver.navigate().to("https://alchemy.hguy.co/crm/");
	WebElement cpyrttext = driver.findElement(By.id("admin_options"));
	String copyrighttext = cpyrttext.getText();
	System.out.println("The copyright text is: "+copyrighttext);
	driver.close();
	
	}
}