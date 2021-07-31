package TestNGactivities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	
	@BeforeMethod
	public void befomethod() {
		  
		  System.out.println("before test");
	  }
  
	@Test
  public void first() {
	  
	  System.out.println("first test");
  }
  
	@Test
	public void second() {
		  
		  System.out.println("second");
	  }
	
	@AfterMethod
	public void afteremethod() {
		  
		  System.out.println("after test");
	  }
}