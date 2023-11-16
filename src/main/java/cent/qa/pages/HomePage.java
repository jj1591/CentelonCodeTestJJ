package cent.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import cent.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//Page Factory - OR:

	
	@FindBy(xpath="//header/div[1]/div/ul/li[2]/a[contains(text(),'Sign In')]")
	WebElement signInLink;
	
	@FindBy(xpath="//a[@class='logo']")
	WebElement appLogo;

	
	//Initializing the Page Objects:
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateappLogo(){
		return appLogo.isDisplayed();
	}
	
	public LoginPage clickSignInLink(){
		signInLink.click();		    	
		return new LoginPage();
	}
	
}

