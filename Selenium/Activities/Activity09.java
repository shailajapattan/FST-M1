package Activities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Activity9 {
	
	WebDriver driver;
	
	@Test
	public void Traversingtables_2() {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://alchemy.hguy.co/crm/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='username_password']"));
		WebElement login = driver.findElement(By.xpath("//input[@id='bigbutton']"));
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		login.click();
		WebElement sales = driver.findElement(By.linkText("SALES"));
		WebElement leads = driver.findElement(By.id("moduleTab_9_Leads"));
		
		sales.click();
		leads.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class = 'list view table-responsive']/tbody/tr/td[3]")));
	
		for(int i=1; i<=10; i++)
		{
		List<WebElement> namecolumn =  driver.findElements(By.xpath("//table[@class = 'list view table-responsive']/tbody/tr["+i+"]/td[3]"));
		List<WebElement> usercolumn =  driver.findElements(By.xpath("//table[@class = 'list view table-responsive']/tbody/tr["+i+"]/td[8]"));
			for(WebElement names: namecolumn) {
		System.out.println("The name value of row " + i  + " is " + names.getText());
			}
			
			for(WebElement users: usercolumn) {
				System.out.println("The user value of row " + i  + " is " + users.getText());
					}
			
			
		};
		
		driver.close();

	}
	}