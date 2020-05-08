package Testcases;

import java.awt.AWTException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.JobworkShifts;
import webpages.LoginPage;

public class Workshift_Test extends BaseTest{
	
	public JobworkShifts workshift;
	public ReuseFunctions reusefunctions;
	public LoginPage loginpage;
	
	public Workshift_Test() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException{
		intialization();
		loginpage = new LoginPage();
		ReuseFunctions.takeScreenShot("workshift", driver);
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		ReuseFunctions.takeScreenShot("workshift", driver);
		workshift = new JobworkShifts();
		
		
	}
	@DataProvider()
	public Object[][] readexcel() throws InvalidFormatException {
		String SheetName="ShiftDeatais";
		Object data[] []=ReuseFunctions.getTestData(SheetName);
		return data;
		
	}
	@Test(dataProvider="readexcel")
	public void workshiftDetails(String name) throws InterruptedException  {
		ReuseFunctions.takeScreenShot("workshift", driver);
		workshift.workshiftDetails(name);
		ReuseFunctions.takeScreenShot("workshift", driver);
		
		
		
	}
	

	@AfterMethod
	public void quit() {
		driver.quit();
	}


}
