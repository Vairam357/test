package pages.DEMO.internetBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class SettingsPage extends wrappers.ProjectWrappers  {
		
	public SettingsPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
		openDemoIBApplication();
	}
	
	public SettingsPage loginUsingSMS() throws InterruptedException {
		enterUserName()
	  	.enterPassword()
	  	.takeMeDirectlyTo("Dashboard")
	  	.clickSignInBtn()
	  	.select2FAType("SMS OTP")
	  	.enterSMSOTP()
	  	.clickSubmitBtn2FAPage();
		return this;
	}
		
	public SettingsPage clickUserName() throws InterruptedException{
		System.out.println("Click the User Name");
		Thread.sleep(3000);
		clickById("login_input_username");
		return this;
	}
	
	public SettingsPage enterUserName() throws InterruptedException{
		System.out.println("Enter the User Name");
		Thread.sleep(3000);
		enterByXpath("(//input[@placeholder='Enter'])[1]", "vikram444");
		return this;
	}
	
	public SettingsPage clickPassword(){
		System.out.println("Click the Password");
		clickById("login_input_password");
		return this;
	}
	
	public SettingsPage enterPassword(){
		System.out.println("Enter the Password");
		enterByXpath("(//input[@placeholder='Enter'])[2]", "Password12");
		return this;
	}
	
	public SettingsPage takeMeDirectlyTo(String page)
	{
		System.out.println("Select any one take me directly option");
		clickByXpath("//mat-select[@formcontrolname='directTo']");
	    clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+page+"')]");
		return this;
	}

	public SettingsPage clickSignInBtn()
	{
		System.out.println("Click Sign In button");
		clickByXpath("//button[@type='submit']");
		return this;
	}
		
	public SettingsPage clickNextBtn()
	{
		System.out.println("Click Next button");
		clickByXpath("//button/span[text()='Next']");
		return this;
	}	
	
	public SettingsPage select2FAType(String auth)
	{
		System.out.println("Select 2FA Type");
		clickByXpath("//div//span[text()='Select']");
	    clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+auth+"')]");
		return this;
	}
	
	public SettingsPage enterSMSOTP() throws InterruptedException
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

	public SettingsPage clickResendCodeLink()
	{
		System.out.println("Click Resend Code Link");
		clickByXpath("//span[contains(text(),'Resend code')]");
		return this;
	}
	
	public SettingsPage clickSubmitBtn2FAPage()
	{
		System.out.println("Click Submit button");
		clickByXpath("//button/span[contains(text(),'Submit')]");
		return this;
	}
	
	public SettingsPage verifyDashboardTitle() throws InterruptedException
	{
		System.out.println("Verify Dashboard title");
		Thread.sleep(4000);
		verifyElementisPresent("//span[contains(text(), 'Dashboard')]", "Dashboard");
		return this;
	}
	
	public SettingsPage clickTransfersTab() throws InterruptedException
	{
		System.out.println("Click Transfers Tab");
		clickByXpath("//span[contains(text(),'Transfers')]");
		Thread.sleep(4000);
		return this;
	}
	
	public SettingsPage clickSettingsArrow() throws InterruptedException
	{
		System.out.println("Click Settings Arrow");
		clickByXpath("(//span[contains(text(),'Settings')]/parent::a/span)[2]");
		Thread.sleep(4000);
		return this;
	}
	
	public SettingsPage clickAddLinkAccounts()
	{
		System.out.println("Click Add Link Accounts");
		clickByXpath("//span[contains(text(),'Add/Link Accounts')]");
		return this;
	}
	
	public SettingsPage clickManageDevice()
	{
		System.out.println("Click Manage Device");
		clickByXpath("//span[contains(text(),'Manage Device')]");
		return this;
	}
	
	public SettingsPage clickManageTransactionLimit()
	{
		System.out.println("Click Manage Transaction Limit");
		clickByXpath("//span[contains(text(),'Manage Transaction Limit')]");
		return this;
	}
	
	public SettingsPage clickPreLoginBalance()
	{
		System.out.println("Click Pre Login Balance");
		clickByXpath("//span[contains(text(),'Pre-login Balance')]");
		return this;
	}
	
	public SettingsPage clickChangePassword()
	{
		System.out.println("Click Change Password");
		clickByXpath("//span[contains(text(),'Change Password')]");
		return this;
	}
	
	
	// CHeckbox
	public SettingsPage selectDeviceCheckbox()
	{
		System.out.println(" select Device Checkbox");
		clickByXpath("//input[@id='mat-checkbox-2-input']");
		return this;
	}
	
	public SettingsPage clickDeregisterButton()
	{
		System.out.println("Click De Register Button");
		clickByXpath("//span[contains(text(),'De-register Device')]");
		return this;
	}
	
	public SettingsPage clickBackHomeButton()
	{
		System.out.println("Click Back Home Button");
		clickByXpath("//*[contains(text(),'Back Home')]");
		return this;
	}
	
	public SettingsPage clickConfirmButton()
	{
		System.out.println("Click Confirm Button");
		clickByXpath("//span[text()='Confirm']");
		return this;
	}
	
	public SettingsPage verifyDeRegisterSuccessMessage()  {
		System.out.println("Verify De Register Success Message");
		verifyElementisPresent("//*[contains(text(),'Success ! Device has been de-registered successfully.')]", "Success ! Device has been de-registered successfully.");
		return this;
	}
	
	public SettingsPage verifyDeviceModelLabel()  {
		System.out.println("Verify Device Model Label");
		verifyElementisPresent("//*[contains(text(),'Device model')]", "Device model");
		return this;
	}
	
	
	public SettingsPage verifyLastUsedLabel()  {
		System.out.println("Verify Last Used Label");
		verifyElementisPresent("//*[contains(text(),'Last Used')]", "Last Used");
		return this;
	}
	
	
	// Prelogin Flow
	
	public SettingsPage verifyPreloginDiscableSuccessMessage()  {
		System.out.println("Verify Prelogin Disable Success Message ");
		verifyElementisPresent("//*[contains(text(),'Success ! Pre-login balance disabled.')]", "Success ! Pre-login balance disabled.");
		return this;
	}
	
	// Toggle Button
	public SettingsPage clickOnButton()
	{
		System.out.println("Click ON Button");
		clickByXpath("//button/div[contains(text(),'ON')]");
		return this;
	}
	
	public SettingsPage clickOffButton()
	{
		System.out.println("Click OFF Button");
		clickByXpath("//button/div[contains(text(),'OFF')]");
		return this;
	}
	
	// Select Account Number
	public SettingsPage selectAccountNumber()
	{
		System.out.println("Select Account Number");
		clickByXpath("//*[@aria-label='Select']");
		clickByXpath("//*[@role='option'][1]");
		return this;
	}
	
	public SettingsPage verifyPreloginBalanceAccountLabel()  {
		System.out.println("Verify PreLogin Balance Account Label");
		verifyElementisPresent("//span[contains(text(),'Pre-login Balance Account')]", "Pre-login Balance Account");
		return this;
	}
	
	public SettingsPage verifyPreloginBalanceUpdateMessage()  {
		System.out.println("Verify PreLogin Balance Updated Message");
		verifyElementisPresent("//*[contains(text(),'Success ! Pre-login balance account has been updated successfully.')]", "Success ! Pre-login balance account has been updated successfully.");
		return this;
	}
	
	public SettingsPage clickOkButton()
	{
		System.out.println("Click Ok Button");
		clickByXpath("//*[contains(text(),'Ok')]");
		return this;
	}
	
	// Change Password
	
	public SettingsPage enterCurrentPassword() throws InterruptedException{
		System.out.println("Enter Current Password");
		Thread.sleep(3000);
		enterByXpath("//input[@formcontrolname='currentOrOldPsw']", "Password12");
		return this;
	}
	
	public SettingsPage enterNewPassword() throws InterruptedException{
		System.out.println("Enter New Password");
		Thread.sleep(3000);
		enterByXpath("//input[@formcontrolname='newPsw']", "Password13");
		return this;
	}
	
	public SettingsPage enterConfirmPassword() throws InterruptedException{
		System.out.println("Enter Confirm Password");
		Thread.sleep(3000);
		enterByXpath("//input[@formcontrolname='confirmPsw']", "Password13");
		return this;
	}
	
	public SettingsPage clickResetButton()
	{
		System.out.println("Click Reset Button");
		clickByXpath("//span[text()='Reset']");
		return this;
	}
	
	// ADD /LINK ACCOUNTS
	
	
	public SettingsPage selectRegisterType(String type)
	{
		System.out.println("Select Register Type");
		if(type.equalsIgnoreCase("1")) {
			clickByXpath("//div[contains(text(),'With account details')]");
		}
		else if(type.equalsIgnoreCase("2")) {
			clickByXpath("//div[contains(text(),'With credit card details')]");
		}
		else {
			clickByXpath("//div[contains(text(),'With debit card details')]");
		}
		return this;
	}
	
	public SettingsPage selectAccountType(String type) throws InterruptedException
	{
		System.out.println("Select Account Type");
		clickByXpath("//div//span[text()='Select']");
		if(type.equalsIgnoreCase("casa")) {
			clickByXpath("//span[@class='mat-option-text'][contains(text(),'Current or Savings')]");
			Thread.sleep(2000);
		}
		else if(type.equalsIgnoreCase("deposit")) {
			clickByXpath("//span[@class='mat-option-text'][contains(text(),'Deposit')]");
			Thread.sleep(2000);
		}
		else if(type.equalsIgnoreCase("loan")) {
			clickByXpath("//span[@class='mat-option-text'][contains(text(),'Loan')]");
			Thread.sleep(2000);
		}
		return this;
	}
	
			
	public SettingsPage verifyEnterCCDetailsText()
	{
		System.out.println("Verify Enter Your Credit Card Details to Register Heading");
		verifyElementisPresentById("shared_creditcard_title_carddetail", "Enter Your Credit Card Details Title");
//		verifyTextById("shared_creditcard_title_carddetail", "Enter Your Credit Card Details to Register");
		return this;
	}
	
	public SettingsPage selectDOB(String Date, String Month, String Year)
	{
		System.out.println("Select DOB");
		clickByXpath("//mat-icon[contains(text(),'date_range')]");
		verifyElementisPresent("//div[@class='calendar-table']", "Calendar Pop Up");
		clickByXpath("//div[@class='dropdowns ng-star-inserted'][2]");
		clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+Year+"')]");
		clickByXpath("//div[@class='dropdowns ng-star-inserted'][1]");
		clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+Month+"')]");
		verifyElementisPresent("//*[@class='drp-animate ng-star-inserted']", "Week Days Body in Calendar");
		Actions DOB = new Actions(driver);
		DOB.moveToElement(driver.findElement(By.xpath("//tbody/tr//td//span[contains(text(),'"+Date+"')]"))).click().perform();
//		clickByXpath("//td[@class='active available end-date start-date today ng-star-inserted']");
		return this;
	}
	
	public SettingsPage verifyAccountLinkingSuccessMessage()  {
		System.out.println("Verify Account Linking Success Message");
		verifyElementisPresent("//*[contains(text(),'Success ! Account linking request has been sent to bank for processing.')]", "Success ! Account linking request has been sent to bank for processing.");
		return this;
	}
	
	public SettingsPage verifyAccountTypeLabel()  {
		System.out.println("Verify Account Type Label");
		verifyElementisPresent("//span[contains(text(),'Account Type')]", "Account Type");
		return this;
	}
	
	public SettingsPage verifyAccountNumberLabel()  {
		System.out.println("Verify Account Number Label");
		verifyElementisPresent("//span[contains(text(),'Account Number')]", "Account Number");
		return this;
	}
	
	public SettingsPage verifyDateofBirthLabel()  {
		System.out.println("Verify DOB Label");
		verifyElementisPresent("//span[contains(text(),'Date Of Birth')]", "Date of Birth");
		return this;
	}
	
	public SettingsPage verifyCustomerIdLabel()  {
		System.out.println("Verify Customer ID Label");
		verifyElementisPresent("//span[contains(text(),'Customer Id')]", "Customer Id");
		return this;
	}
	
	public SettingsPage verifyHoldingTypeLabel()  {
		System.out.println("Verify Holding Type Label");
		verifyElementisPresent("//span[contains(text(),'Holding Type')]", "Holding Type");
		return this;
	}			
			
	
			
			
			
			
			
			
	public SettingsPage userLogOut() throws InterruptedException {
		System.out.println("Logout the User");
		Thread.sleep(2000);
		clickByXpath("(//span[contains(text(), 'Logout')])[2]");
		return this;
	}
}
