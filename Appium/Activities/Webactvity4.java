package ProjectActivity;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Webactvity4 {

	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;
	
	@BeforeClass
		
		public void Setup() throws MalformedURLException {
			
			DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "Pixel4Emulator");
	    caps.setCapability("platformName", "Android");
	    caps.setCapability("appPackage", "com.android.chrome");
	    caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	    caps.setCapability("automationName", "UiAutomator2");
	    caps.setCapability("noReset", true);
		
	    URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	    driver = new AndroidDriver<MobileElement>(appServer, caps);
	    
	    wait = new WebDriverWait(driver, 15);
	    driver.get("https://www.training-support.net/selenium");
	    
		}
		
	

	@Test 
public void testtodolist() throws InterruptedException {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Selenium\")")));
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(5)"));
		MobileElement todolist = driver.findElement(MobileBy.xpath("//android.view.View[contains(@text, 'To-Do List')]"));
		todolist.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("taskInput"))).click();	
		
		MobileElement entertask = driver.findElementById("taskInput");
		entertask.setValue("Add tasks to list");
		//entertask.sendKeys("Add tasks to list");
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Add Task\")")).click();
		entertask.sendKeys("Get number of tasks");
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Add Task\")")).click();
		entertask.sendKeys("Clear the list");
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Add Task\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Add tasks to list\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Get number of tasks\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Clear the list\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Clear List\")")).click();
		
		}
	
	@AfterClass
	public void afterClass() {
	    driver.quit();

	}
}