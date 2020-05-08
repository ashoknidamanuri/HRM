package Testcases;

import java.awt.AWTException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.JobPage;
import webpages.LoginPage;

public class JobPage_Test extends BaseTest {
	public ReuseFunctions reusefunctions;
	public LoginPage loginpage;
	public JobPage jobpage;
	
	public JobPage_Test() {
		super();
	}
	@BeforeMethod
	 public void setup() throws InterruptedException {
		intialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		ReuseFunctions.takeScreenShot("ashok", driver);
		jobpage =new JobPage();
		
	}
	@DataProvider()
	public Object[][] readexcel() throws InvalidFormatException {
		String SheetName="Job";
		Object data[] []=ReuseFunctions.getTestData(SheetName);
		return data;
		
	}
	@Test(dataProvider="readexcel")
	public void JobPageDetails(String title, String jobdespription, String notepad) throws InterruptedException, AWTException {
		jobpage.JobPageDetails(title, jobdespription, notepad);
		ReuseFunctions.takeScreenShot("ashok", driver);
		
		
		
	}
	

	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
