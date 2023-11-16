package cent.qa.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cent.qa.base.TestBase;

import cent.qa.steps.CreateCustomerAccountSteps;


public class CustomerAccountTests extends TestBase {
	
	
	
	@BeforeMethod
	public void setUp() {
		initialization();

	}
	
	@Test(priority=1)
	public void createCustomerAccount(){
		
		CreateCustomerAccountSteps.CreateCustomerandLogin();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
