package webpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import base.BaseTest;

public class AdminPage extends BaseTest {
	
	
	@FindBy(xpath="//b[text()='Admin']")
	WebElement admin;
	@FindBy(xpath="//a[@class='arrow']")
	WebElement management;
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement add;
	@FindBy(xpath="//select[@id='systemUser_userType']")
	WebElement userrole;
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	WebElement ename;
	@FindBy(xpath="//input[@id='systemUser_userName']")
	WebElement uname;
	@FindBy(xpath="//select[@id='systemUser_status']")
	WebElement status;
	@FindBy(xpath="//input[@id='systemUser_password']")
	WebElement pass;
	@FindBy(xpath="//input[@id='systemUser_confirmPassword']")
	WebElement cpass;
	@FindBy(xpath="//input[@class='addbutton']")
	WebElement save;
	

	public AdminPage() {
		PageFactory.initElements(driver, this);
	}
	public String VerifyHomePageTitle() {
		return driver.getTitle();
	}
	public void AdminDetails(String role,String employename,String username,
			String statusp, String password,String cpassword) throws InterruptedException {
		admin.click();
		Thread.sleep(3000);
		management.click();
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);
		Select s=new Select(userrole);
		s.selectByVisibleText(role);
		Thread.sleep(2000);
		ename.sendKeys(employename);
		ename.sendKeys(Keys.TAB);
		ename.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		uname.sendKeys(username);
		Thread.sleep(2000);
		Select m=new Select(status);
		m.selectByVisibleText(statusp);
		Thread.sleep(2000);
		pass.sendKeys(password);
		cpass.sendKeys(cpassword);
		save.click();
		
		
	}
	

	
		

	}


