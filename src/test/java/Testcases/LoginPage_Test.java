package Testcases;

import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.log4testng.Logger;

import base.BaseTest;

import reusefunctions.ReuseFunctions;
import webpages.LoginPage;

public class LoginPage_Test extends BaseTest {
	public LoginPage loginpage;
	public ReuseFunctions reusefunctions;

	public LoginPage_Test() {
		super();

		intialization();
		loginpage = new LoginPage();

	}
@Test
	public void LoginTest() throws InterruptedException {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}


}
