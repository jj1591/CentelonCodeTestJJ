package cent.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cent.qa.base.TestBase;
import cent.qa.pages.HomePage;
import cent.qa.pages.LoginPage;
import cent.qa.util.TestUtil;

public class HomePageTests extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;


	public HomePageTests() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.validateHomePageTitle();
		Assert.assertEquals(homePageTitle, "Home Page","Home page title not matched");
	}
	

	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}

