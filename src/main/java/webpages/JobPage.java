package webpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class JobPage extends BaseTest {
	@FindBy(xpath="//b[text()='Admin']")
	WebElement admin;
	@FindBy(xpath="//*[@id=\"menu_admin_Job\"]")
	WebElement job;
	@FindBy(xpath="//a[@id='menu_admin_viewJobTitleList']")
	WebElement jtitle;
	@FindBy(xpath="//input[@value='Add']")
	WebElement add;
	@FindBy(xpath="//input[@name='jobTitle[jobTitle]']")
	WebElement jobtitle;
	@FindBy(xpath="//textarea[@name='jobTitle[jobDescription]']")
	WebElement description;
	@FindBy(xpath="//input[@id='jobTitle_jobSpec']")
	WebElement file;
	@FindBy(xpath="//textarea[@name='jobTitle[note]']")
	WebElement note;
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement save;
	
	public JobPage() {
		PageFactory.initElements(driver, this);
	}
	public void JobPageDetails(String title, String jobdespription, String notepad) throws InterruptedException, AWTException {
		admin.click();
		Thread.sleep(2000);
		job.click();
		Thread.sleep(2000);
		jtitle.click();
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);
		jobtitle.sendKeys(title);
		Thread.sleep(2000);
		description.sendKeys(jobdespription);
		Thread.sleep(2000);
		/*file.click();
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		StringSelection str=new StringSelection("C:\\Users\\Ashok Nidamanuri\\Documents\\2.7 years Exp_Manual.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		Thread.sleep(5000);
		note.sendKeys(notepad);
		Thread.sleep(2000);
		save.sendKeys(Keys.ENTER);
		
		
		
	}

}
