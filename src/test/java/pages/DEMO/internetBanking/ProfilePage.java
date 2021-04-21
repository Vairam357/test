package pages.DEMO.internetBanking;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class ProfilePage extends wrappers.ProjectWrappers  {
		
	public ProfilePage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
		openDemoIBApplication();
	}
	
	public ProfilePage loginUsingSMS() throws InterruptedException {
		enterUserName()
	  	.enterPassword()
	  	.takeMeDirectlyTo("Dashboard")
	  	.clickSignInBtn()
	  	.select2FAType("SMS OTP")
	  	.enterSMSOTP()
	  	.clickSubmitBtn2FAPage();
		return this;
	}
		
	public ProfilePage clickUserName() throws InterruptedException{
		System.out.println("Click the User Name");
		Thread.sleep(3000);
		clickById("login_input_username");
		return this;
	}
	
	public ProfilePage enterUserName() throws InterruptedException{
		System.out.println("Enter the User Name");
		Thread.sleep(3000);
		enterByXpath("(//input[@placeholder='Enter'])[1]", "vikram444");
		return this;
	}
	
	public ProfilePage clickPassword(){
		System.out.println("Click the Password");
		clickById("login_input_password");
		return this;
	}
	
	public ProfilePage enterPassword(){
		System.out.println("Enter the Password");
		enterByXpath("(//input[@placeholder='Enter'])[2]", "Password12");
		return this;
	}
	
	public ProfilePage takeMeDirectlyTo(String page)
	{
		System.out.println("Select any one take me directly option");
		clickByXpath("//mat-select[@formcontrolname='directTo']");
	    clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+page+"')]");
		return this;
	}

	public ProfilePage clickSignInBtn()
	{
		System.out.println("Click Sign In button");
		clickByXpath("//button[@type='submit']");
		return this;
	}
		
	public ProfilePage clickNextBtn()
	{
		System.out.println("Click Next button");
		clickByXpath("//button/span[text()='Next']");
		return this;
	}	
	
	public ProfilePage select2FAType(String auth)
	{
		System.out.println("Select 2FA Type");
		clickByXpath("//div//span[text()='Select']");
	    clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+auth+"')]");
		return this;
	}
	
	public ProfilePage enterSMSOTP() throws InterruptedException
	{
		System.out.println("Entered the OTP");
		Thread.sleep(3000);
		enterByXpath("(//input[@formcontrolname='input'])[1]","1");
		enterByXpath("(//input[@formcontrolname='input'])[2]","2");
		enterByXpath("(//input[@formcontrolname='input'])[3]","3");
		enterByXpath("(//input[@formcontrolname='input'])[4]","4");
		enterByXpath("(//input[@formcontrolname='input'])[5]","5");
		enterByXpath("(//input[@formcontrolname='input'])[6]","6");
		return this;
	}

	public ProfilePage clickResendCodeLink()
	{
		System.out.println("Click Resend Code Link");
		clickByXpath("//span[contains(text(),'Resend code')]");
		return this;
	}
	
	public ProfilePage clickSubmitBtn2FAPage()
	{
		System.out.println("Click Submit button");
		clickByXpath("//button/span[contains(text(),'Submit')]");
		return this;
	}
	
	public ProfilePage verifyDashboardTitle() throws InterruptedException
	{
		System.out.println("Verify Dashboard title");
		Thread.sleep(4000);
		verifyElementisPresent("//span[contains(text(), 'Dashboard')]", "Dashboard");
		return this;
	}
	
	public ProfilePage clickConfirmBtn()
	{
		System.out.println("Click Confirm button");
		clickByXpath("//button/span[text()='Confirm & Transfer']");
		return this;
	}	

	public ProfilePage clickSubmitBtn()
	{
		System.out.println("Click Submit button");
		clickByXpath("//button/span[contains(text(),'Submit')]");
		return this;
	}
	
	public ProfilePage clickCancelBtn()
	{
		System.out.println("Click Cancel button");
		clickByXpath("//button/span[text()='Cancel']");
		return this;
	}
	
	// Profile Page Flows
	
	public ProfilePage clickProfileArrow() throws InterruptedException
	{
		System.out.println("Click Profile Arrow");
		Thread.sleep(2000);
		clickByXpath("//span[contains(@class,'mat-menu-trigger mx-rb-down-arrow mx-rb-down-arrow-class mx-rb-cur-pointer')]");
		return this;
	}
	
	public ProfilePage clickProfile() throws InterruptedException
	{
		System.out.println("Click Profile Option");
		Thread.sleep(2000);
		clickByXpath("//button[contains(text(),'Profile')]");
		return this;
	}
	
	public ProfilePage clickUpdateEmailLink()
	{
		System.out.println("Click Update Email Link");
		clickByXpath("//span[contains(text(),'Update')]");
		return this;
	}
	
	public ProfilePage clickUpdateMailingAddressButton()
	{
		System.out.println("Click Update Mailing Address button");
		clickByXpath("//*[contains(text(),'Update Mailing address')]");
		return this;
	}
	
	public ProfilePage enterEmail() throws InterruptedException{
		System.out.println("Enter the New Email");
		Thread.sleep(3000);
		enterByXpath("//input[@type='email' and @formcontrolname='em']", "dj123@gmail.com");
		return this;
	}
	
	public ProfilePage verifyEmailUpdatedSuccessMessage()
	{
		System.out.println("Verify Email Updated Success Message");
		verifyElementisPresent("//*[contains(text(),'Success ! Email ID has been updated successfully.')]", "Success ! Email ID has been updated successfully.");
		return this;
	}
	
	public ProfilePage clickProfileIcon()
	{
		System.out.println("Click Profile Icon");
		clickByXpath("//*[@class='edit_icon_img_cls']");
		return this;
	}
	
	public ProfilePage enterAddressLine1() throws InterruptedException{
		System.out.println("Enter the Address Line1");
		Thread.sleep(2000);
		enterByXpath("//input[@formcontrolname='addressline1']", "djstreet ");
		return this;
	}
	
	public ProfilePage enterAddressLine2() throws InterruptedException{
		System.out.println("Enter the Address Line2");
		Thread.sleep(2000);
		enterByXpath("//input[@formcontrolname='addressline2']", "urapakkam main road");
		return this;
	}
	
	public ProfilePage enterAddressLine3() throws InterruptedException{
		System.out.println("Enter the Address Line 3");
		Thread.sleep(2000);
		enterByXpath("//input[@formcontrolname='addressline3']", "chennai");
		return this;
	}
	
	public ProfilePage selectCountry()
	{
		System.out.println("Select Country");
		clickByXpath("//*[@formcontrolname='country']");
		clickByXpath("//span[contains(text(),'India')]");
		return this;
	}
	
	public ProfilePage selectState()
	{
		System.out.println("Select State");
		clickByXpath("//*[@formcontrolname='state']");
		clickByXpath("//span[contains(text(),'Tamilnadu')]");
		return this;
	}
	
	public ProfilePage enterPostalCode() throws InterruptedException{
		System.out.println("Enter Postal Code");
		Thread.sleep(2000);
		enterByXpath("//*[@formcontrolname='postalCode']", "670301");
		return this;
	}
	
	public ProfilePage verifyMailingAddressUpdateMessage()
	{
		System.out.println("Verify Mailing Address Update Message");
		verifyElementisPresent("//*[contains(text(),'Success ! Mailing address has been updated successfully.')]", "Success ! Mailing address has been updated successfully.");
		return this;
	}
	
	public ProfilePage verifyAddressLineLabel()
	{
		System.out.println("Verify Address Line Label");
		verifyElementisPresent("//span[contains(text(),'Address Line 1')]", "Address Line 1");
		return this;
	}
	
	public ProfilePage fileUpload() throws InterruptedException, AWTException
	{
		driver.findElementByXPath("//label[contains(text(),'Upload Picture')]").click();
		String fileAbsolutePath = "D:\\work\\Automation_Cards\\MCards\\data\\images\\Dummy_Image.jpg";
		StringSelection clipBoardPath = new StringSelection(fileAbsolutePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipBoardPath, null);
		
		
		Thread.sleep(4000);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		return this;
	}	
	
	// Labels
	
	public ProfilePage verifyCurrentEmailID()
	{
		System.out.println("Verify Current Email ID");
		verifyElementisPresent("//span[contains(text(),'Current Email ID')]", "Current Email ID");
		return this;
	}
	
	public ProfilePage verifyEmailID()
	{
		System.out.println("Verify Email ID");
		verifyElementisPresent("//span[contains(text(),'Email ID')]", "Email ID");
		return this;
	}
	
	public ProfilePage verifyName()
	{
		System.out.println("Verify Name");
		verifyElementisPresent("//div[contains(text(),'Name')]", "Name");
		return this;
	}
	
	public ProfilePage verifyCustomerID()
	{
		System.out.println("Verify Customer ID");
		verifyElementisPresent("//div[contains(text(),'Customer ID')]", "Customer ID");
		return this;
	}
	
	public ProfilePage verifyMobileNumber()
	{
		System.out.println("Verify Mobile Number");
		verifyElementisPresent("//div[contains(text(),'Mobile Number')]", "Mobile Number");
		return this;
	}
	
	public ProfilePage verifyProfileEmailID()
	{
		System.out.println("Verify Email ID");
		verifyElementisPresent("//div[contains(text(),'Email ID')]", "Email ID");
		return this;
	}
	
	public ProfilePage verifyMailingAddress()
	{
		System.out.println("Verify Mailing Address");
		verifyElementisPresent("//div[contains(text(),'Mailing Address')]", "Mailing Address");
		return this;
	}
	
	public ProfilePage verifyDateofBirth()
	{
		System.out.println("Verify Date of Birth");
		verifyElementisPresent("//div[contains(text(),'Date of Birth')]", "Date of Birth");
		return this;
	}
	
	public ProfilePage verifyMaritalStatus()
	{
		System.out.println("Verify Marital Status");
		verifyElementisPresent("//div[contains(text(),'Marital Status')]", "Marital Status");
		return this;
	}
	
	public ProfilePage verifyTFNNumber()
	{
		System.out.println("Verify TFN Number");
		verifyElementisPresent("//div[contains(text(),'TFN Number')]", "TFN Number");
		return this;
	}
	
		
	
		
	public ProfilePage userLogOut() throws InterruptedException {
		System.out.println("Logout the User");
		Thread.sleep(2000);
		clickByXpath("(//span[contains(text(), 'Logout')])[2]");
		return this;
	}
}
