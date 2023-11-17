package cent.qa.steps;

import cent.qa.base.TestBase;
import cent.qa.pages.HomePage;
import cent.qa.util.DataGenerator;


public class CreateCustomerAccountSteps extends TestBase{
	
	public static void CreateCustomerandLogin() {
				
		String randNum = String.valueOf(DataGenerator.generateRandomNumber(999));
		String randNum1 = String.valueOf(DataGenerator.generateRandomNumber(999));
		String firstname = "Test"+randNum;
		String lastname = "Name"+randNum1;
		String email = "testname"+randNum+"@centelon.com";
		String password = "Centelon"+randNum+"@*";
		HomePage homepage= new HomePage();
		homepage.clickSignInLink()
		.navigateToCreateAccount()
		.createCustomerAccount(firstname,lastname, email, password, password)
		.verifyUserName(firstname, lastname);
		
	}
	


}
