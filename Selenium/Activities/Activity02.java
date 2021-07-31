package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity2 {

	WebDriver driver;
	
	@Test
	public void geturl() {
		driver = new FirefoxDriver();
		driver.navigate().to("https://alchemy.hguy.co/crm/");
		WebElement image = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
		String url = image.getAttribute("src");
		System.out.println("The url is: " +url);
		driver.close();
	}
}