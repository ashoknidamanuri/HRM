package Testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.AdminPage;
import webpages.LoginPage;

public class AdminPage_Test extends BaseTest {

	public ReuseFunctions reusefunctions;
	public AdminPage adminpage;
	public LoginPage loginpage;

	public AdminPage_Test() throws InterruptedException {
		super();
		
		
		

	}

	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		intialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		ReuseFunctions.takeScreenShot("ashok", driver);
		
		
	adminpage = new AdminPage();
	

	}
	public void verifyHomePageTitleTest() throws IOException{
		String homePageTitle = adminpage.VerifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "OrangeHRM","Home page title not matched");
		System.out.println(homePageTitle);
		
	}
	

	@DataProvider()
	public Object[][] readexcel() throws InvalidFormatException {
		String sheetName = "Sheet1";
		Object data[][] = ReuseFunctions.getTestData(sheetName);
		return data;

	}

	@Test(dataProvider = "readexcel")
	public void AdminDetails(String role,String employename,String username,
			String statusp, String password,String cpassword) throws InterruptedException, IOException {
		adminpage.AdminDetails(role, employename, username, statusp, password, cpassword);
		ReuseFunctions.takeScreenShot("ashok", driver);
	
	}
	

	

	@AfterMethod
	public void quit() {
		driver.quit();

	}

}
