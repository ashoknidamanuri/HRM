package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;

public class OrganizationPage extends BaseTest {
	@FindBy(xpath="//b[text()='Admin']")
	WebElement admin;
	@FindBy(xpath="//a[@id='menu_admin_Organization']")
	WebElement organization;
	@FindBy(xpath="//a[@id='menu_admin_viewOrganizationGeneralInformation']")
	WebElement general;
	@FindBy(xpath="//input[@id='btnSaveGenInfo']")
	WebElement edit;
	@FindBy(xpath="//input[@id='organization_name']")
	WebElement orgname ;
    @FindBy(xpath="//input[@id='organization_taxId']")
	WebElement taxid ;
	@FindBy(xpath="//input[@id='organization_registraionNumber']")
	WebElement rnumber;
	@FindBy(xpath="//input[@id='organization_phone']")
	WebElement phone;
	@FindBy(xpath="//input[@id='organization_city']")
	WebElement ocity;
	@FindBy(xpath="//input[@id='organization_province']")
	WebElement province;
	@FindBy(xpath="//input[@id='organization_zipCode']")
	WebElement zip;
	@FindBy(xpath="//select[@id='organization_country']")
	WebElement country;
	@FindBy(xpath="//input[@id='btnSaveGenInfo']")
	WebElement save;
	
	public OrganizationPage() {
		PageFactory.initElements(driver, this);
	}
	public void OrganizationDetails(String oname,String tax,String registernum,String pnumber,String city,String state,String zipcode,String county) throws InterruptedException {
		admin.click();
		organization.click();
		general.click();
		edit.click();
		orgname.clear();
		Thread.sleep(2000);
		orgname.sendKeys(oname);
		taxid.clear();
		Thread.sleep(2000);
		taxid.sendKeys(tax);
		rnumber.clear();
		Thread.sleep(2000);
		rnumber.sendKeys(registernum);
		phone.sendKeys(pnumber);
		ocity.clear();
		Thread.sleep(2000);
		ocity.sendKeys(city);
		province.clear();
		Thread.sleep(2000);
		province.sendKeys(state);
		zip.sendKeys(zipcode);
		//country.clear();
		Thread.sleep(2000);
		Select s=new Select(country);
		s.selectByVisibleText(county);
		Thread.sleep(2000);
		save.click();
	}

}
