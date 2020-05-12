package Testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.LoginPage;
import webpages.OrganizationPage;

public class OrganizationPgae_Test extends BaseTest {
	public OrganizationPage organizationpgae;
	public ReuseFunctions reusefunctions;
	public LoginPage loginpage;
	
	public OrganizationPgae_Test() {
		super();
	}
	@BeforeTest
	public void setup() throws InterruptedException {
		intialization();
		loginpage=new LoginPage();
		ReuseFunctions.takeScreenShot("OrganizationPage", driver);
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		organizationpgae =new OrganizationPage();
		
	}
	@DataProvider()
	public Object[][] readexcel() throws InvalidFormatException {
		String SheetName="OrganizationPage";
		Object data[] []=ReuseFunctions.getTestData(SheetName);
		return data;
	}
	@Test(dataProvider="readexcel")
	public void OrganizationDetails(String oname,String tax,String registernum,String pnumber,String city,String state,String zipcode,String county) throws InterruptedException  {
		ReuseFunctions.takeScreenShot("OrganizationPage", driver);
		organizationpgae.OrganizationDetails(oname, tax, registernum, pnumber, city, state, zipcode, county);
		ReuseFunctions.takeScreenShot("OrganizationPage", driver);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
