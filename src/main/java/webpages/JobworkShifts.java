package webpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;

public class JobworkShifts extends BaseTest {
	@FindBy(xpath="//b[text()='Admin']")
	WebElement admin;
	@FindBy(xpath="//*[@id=\"menu_admin_Job\"]")
	WebElement job;
	@FindBy(xpath="//a[@id='menu_admin_workShift']")
	WebElement shift;
	@FindBy(xpath="//input[@value='Add']")
	WebElement add;
	@FindBy(xpath="//input[@id='workShift_name']")
	WebElement shiftname;
	@FindBy(xpath="//select[@name='workShift[workHours][from]']")
	WebElement from;
	@FindBy(xpath="//select[@name='workShift[workHours][to]']")
	WebElement to;
	@FindBy(xpath="//option[contains(text(),'Linda Anderson')]")
	WebElement anderson;
	@FindBy(xpath="//a[@id='btnAssignEmployee']")
	WebElement btnadd;
	@FindBy(xpath="//option[contains(text(),'Hannah Flores')]")
	WebElement Hannah;
	@FindBy(xpath="//a[@id='btnAssignEmployee']")
	WebElement button;
	@FindBy(xpath="//input[@value='Save']")
	WebElement save;
	
	public JobworkShifts() {
		PageFactory.initElements(driver, this);
	}
	public void workshiftDetails(String name) throws InterruptedException {
		admin.click();
		job.click();
		shift.click();
		add.click();
		shiftname.sendKeys(name);
		Thread.sleep(2000);
		/*shiftname.sendKeys(Keys.TAB);
		shiftname.sendKeys(Keys.TAB);*/
		//Select s=new Select(from);
		//s.selectByValue(fromdate);
		Thread.sleep(2000);
	//	Select m=new Select(to);
		//m.selectByValue(todate);
		btnadd.click();
		Thread.sleep(2000);
		button.click();
		Thread.sleep(2000);
		save.sendKeys(Keys.ENTER);
	}
	
	

}
