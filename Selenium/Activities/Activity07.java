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

public class Activity7 {

	WebDriver driver;
	

	
	@Test
	public void Reading_additional_information() {
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
		
		//String searchText = "Home";
		/*List<WebElement> options = sales.findElements(By.tagName("li"));
		for (WebElement option : options)
		{
		    if (option.getText().equals(searchText))
		    {
		       option.click();
		        // click the desired option
		        break;
		    }
		}*/
		//WebElement adddetails = driver.findElement(By.xpath("//span[@title='Additional Details']"));
	
		//adddetails.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);

		
		WebElement adddetail = driver.findElement(By.xpath("(//span[@title='Additional Details'])[2]"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@title='Additional Details'])[2]")));
		
		
		adddetail.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='phone']")));
		
		WebElement mobile = driver.findElement(By.xpath("//span[@class='phone']"));
		
		System.out.println(mobile.getText());
		driver.close();
		
	
		
		
	}

}