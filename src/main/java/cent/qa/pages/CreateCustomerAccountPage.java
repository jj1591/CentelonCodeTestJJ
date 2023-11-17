package cent.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cent.qa.base.TestBase;

public class CreateCustomerAccountPage extends TestBase{
	

	@FindBy(id="firstname")
	WebElement firstNameTxtbx;
	
	@FindBy(id="lastname")
	WebElement lastNameTxtbx;
	
	@FindBy(name="email")
	WebElement emailTxtbx;
	
	@FindBy(name="password")
	WebElement passwordTxtbx;
	
	@FindBy(name="password_confirmation")
	WebElement passwordConfirmationTxtbx;
	
	@FindBy(xpath="//button[@title='Create an Account']")
	WebElement createAccountBtn;
	
	//Initializing the Page Objects:
	public CreateCustomerAccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public LandingPage createCustomerAccount(String firstname,String lastname,String email, String password,String passwordconfirmation){
			firstNameTxtbx.sendKeys(firstname);
			lastNameTxtbx.sendKeys(lastname);
			emailTxtbx.sendKeys(email);
			passwordTxtbx.sendKeys(password);
			passwordConfirmationTxtbx.sendKeys(passwordconfirmation);
			createAccountBtn.click();
			return new LandingPage();
	}
	
	public void enterFirstname(String username){
		firstNameTxtbx.sendKeys(username);
	}
	

}
