package cent.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cent.qa.base.TestBase;

public class LandingPage extends TestBase {
	
	@FindBy(xpath="//a[@class='action skip contentarea']/following-sibling::ul/li/span[contains(text(),'Welcome')]")
	WebElement welcomeUser;
	
	@FindBy(xpath="//a[@class='logo']")
	WebElement appLogo;

	
	//Initializing the Page Objects:
	public LandingPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String getWelcomeText(){
		return welcomeUser.getText();
	}
	
	public LandingPage verifyUserName(String firstname,String lastname){
	
		String actualwelcomeText=getWelcomeText();
		String exepectedwelcomeText="Welcome "+firstname+" "+lastname+"!";
		Assert.assertEquals(actualwelcomeText, exepectedwelcomeText,"Username not matched");
		return new LandingPage();
	}
	
	

}
