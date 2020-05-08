package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class LoginPage extends BaseTest{
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement user;
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement pass;
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void login(String uname, String password) throws InterruptedException {
		user.sendKeys(uname);
		Thread.sleep(2000);
		pass.sendKeys(password);
		Thread.sleep(2000);
		login.click();
		
	}
	public void Homepagetitle() {
		
	}

}
