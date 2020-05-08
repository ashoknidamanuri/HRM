package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class Fb extends BaseTest {
	
	public WebDriver driver;
	@FindBy(how = How.XPATH, using = "//input[@name=\"email\"]")
	
	WebElement uname;
	@FindBy(how = How.XPATH, using = "//input[@name=\"pass\"]")
	WebElement psd;
	@FindBy(how = How.XPATH, using = "//input[@id=\"u_0_b\"]")
	WebElement lclk;
	
	public Fb(WebDriver driver) {
		this.driver=driver;
	}
	public  void Login(String unname,String pass) throws InterruptedException   {
		Thread.sleep(5000);
		uname.sendKeys(unname);
		psd.sendKeys(pass);
	
		lclk.click();
	}


}
