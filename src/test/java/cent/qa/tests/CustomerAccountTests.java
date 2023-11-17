package cent.qa.tests;

import org.testng.annotations.Test;
import cent.qa.base.TestBase;
import cent.qa.steps.CreateCustomerAccountSteps;

public class CustomerAccountTests extends TestBase {
	
	
	@Test(priority=1)
	public void createCustomerAccount(){
		
		CreateCustomerAccountSteps.CreateCustomerandLogin();
	}	

}
