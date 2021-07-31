package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity6 {

	WebDriver driver;
	
	@Test
	
	public void menuchecking() {
		driver = new FirefoxDriver();
		driver.navigate().to("https://alchemy.hguy.co/crm/");
		WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='username_password']"));
		WebElement login = driver.findElement(By.xpath("//input[@id='bigbutton']"));
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		login.click();
		WebElement activities = driver.findElement(By.linkText("ACTIVITIES"));
		System.out.println(activities.isDisplayed());
		System.out.println(activities.isEnabled());
		driver.close();
		
	}
}