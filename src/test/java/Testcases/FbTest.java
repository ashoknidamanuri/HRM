package Testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.Fb;

public class FbTest extends BaseTest {
	
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		
	
	intialization();
	}
	
	@Test
	public void readDataTest() throws InterruptedException {
		//fb.Login(prop.getProperty("unname"), prop.getProperty("pass"));
		
		Fb ffb=PageFactory.initElements(driver, Fb.class);
		ffb.Login("gdsda", "adssads");
		ReuseFunctions.takeScreenShot("ssss", driver);
}
	@AfterMethod
	public void quit() {
		driver.quit();

	}
}


