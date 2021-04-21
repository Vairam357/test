package pages.DEMO.internetBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class LoginPage extends wrappers.ProjectWrappers  {
	
	public static String SetPassword;
	
	public LoginPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
//		openQAApplication();
		openDemoIBApplication();
	}
	
	public LoginPage loginUsingSMS() throws InterruptedException {
		enterUserName()
		.enterPassword()
		.clickSignInBtn()
		.select2FAType("SMS OTP")
		.enterSMSOTP()
		.clickSubmitBtn2FAPage();
		return this;
	}
	
	public LoginPage loginUsingCreditCard() throws InterruptedException {
		enterUserName()
		.enterPassword()
		.clickSignInBtn()
		.select2FAType("Credit Card")
		.enterCreditCardNumber("9874563214789654")
		.enterCreditCardCVV()
		.selectCardExpiryDate("8","25")
		.selectDOB("21","02","1990")
		.enterCreditCardLimit("25000")
		.clickSubmitBtn2FAPage();
		return this;
	}
	
	public LoginPage verifyLoginToIBHeading()
	{
		System.out.println("Verify Login To IB Heading");
		verifyElementisPresentById("login_label_internetbanking", "Login to Internet Banking Heading");
		verifyTextById("login_label_internetbanking", "Login to Internet Banking");
		return this;
	}	

	public LoginPage verifyUsernameHeading()
	{
		System.out.println("Verify Username Heading");
		verifyElementisPresentById("login_label_username", "Username Heading");
		verifyTextById("login_label_username", "Username");
		return this;
	}	

	public LoginPage clickUserName() throws InterruptedException{
		System.out.println("Click the User Name");
		Thread.sleep(5000);
		clickById("login_input_username");
		return this;
	}
	
	public LoginPage enterUserName() throws InterruptedException{
		System.out.println("Enter the User Name");
		Thread.sleep(3000);
		enterByXpath("(//input[@placeholder='Enter'])[1]", "autouser1");
//		enterByXpath("(//input[@placeholder='Enter'])[1]", "debituser23");
		return this;
	}
	
	public LoginPage enterForgotPasswordUserName(String name){
		System.out.println("Enter Forgot Password User Name");
		enterById("forgotpassword_input_username", name);
		return this;
	}
	
	public LoginPage enterIncorrectUserName(){
		System.out.println("Enter the User Name");
//		enterByXpath("(//input[@placeholder='Enter'])[1]", userName);
		enterById("login_input_username", "abcdef");
		return this;
	}
	
	public LoginPage verifyUserNameMandatoryMsg() {
		System.out.println("Verify UserName Mandatory Msg");
		verifyTextById("login_error_username", "Username is mandatory");
		return this;
	}
	
	public LoginPage verifyPasswordHeading()
	{
		System.out.println("Verify Password Heading");
		verifyElementisPresentById("login_label_password", "Password Heading");
		verifyTextById("login_label_password", "Password");
		return this;
	}
	
	public LoginPage clickPassword(){
		System.out.println("Click the Password");
		clickById("login_input_password");
		return this;
	}
	
	public LoginPage enterPassword(){
		System.out.println("Enter the Password");
		enterByXpath("(//input[@placeholder='Enter'])[2]", "Password12");
//		enterByXpath("(//input[@placeholder='Enter'])[2]", "Qwerty789");
		return this;
	}
	
	public LoginPage verifyandClickPasswordEyeIcon() throws InterruptedException{
		System.out.println("Verify Password Eye Icon");
		Thread.sleep(2000);
		verifyElementisPresent("//span[@class='mxPassword pwdShow']", "Password Eye Icon");
		System.out.println("Click Password Eye Icon");
		clickByXpath("//span[@class='mxPassword pwdShow']");
		return this;
	}
	
	public LoginPage enterIncorrectPassword(){
		System.out.println("Enter the Password");
		enterById("login_input_password", "123456");
		return this;
	}
	
	public LoginPage enterPasswordForForgotPwd() throws InterruptedException{
		System.out.println("Enter the Password for Forgot Pwd");
		Thread.sleep(2000);
		SetPassword = enterByXpathWithRandomNumber("//input[@formcontrolname='psw']", "Password");
		objprop("SetForgotPassword", SetPassword);
		return this;
	}
	
	public LoginPage enterForgotPwdConfirmPassword(){
		System.out.println("Enter the Forgot Pwd Confirm Password");
		enterById("forgotpassword_input_confirmpassword", getobjprop("SetForgotPassword"));
		return this;
	}
	
	public LoginPage verifyPasswordChangedSuccessMessage() throws InterruptedException {
		System.out.println("Verify Password changed Success Message");
		waitForLoad();
		Thread.sleep(5000);
		String Message = getTextByXpath("//h3[contains(text(),'Password changed successfully.')]");
//		String Message = getTextById("registration_label_Success!_Registration_completed_successfully.");
		verifyTextByXpath("//h3[contains(text(),'Password changed successfully.')]", Message);
//		reportStep(Message, "PASS");
		return this;
	}
	
	public LoginPage verifyPasswordMandatoryMsg() {
		System.out.println("Verify Password Mandatory Msg");
		verifyTextById("login_error_password", "Password is mandatory");
		return this;
	}
	
	public LoginPage verifyTakeMeDirectlyToHeading()
	{
		System.out.println("Verify Take Me Directly To Heading");
		verifyElementisPresent("//mat-select[@formcontrolname='directTo']", "Take Me Directly To Heading");
//		verifyTextByXpath("//mat-select[@formcontrolname='directTo']", "Take Me Directly To");
		return this;
	}	
		
	public LoginPage takeMeDirectlyTo(String page)
	{
		System.out.println("Select any one take me directly option");
		clickByXpath("//mat-select[@formcontrolname='directTo']");
	    clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+page+"')]");
//	    clickById("login_select_Dashboard");
//	    clickById("login_select_Manage Cards");    
		return this;
	}
	
	public LoginPage clickForgotUsername() throws InterruptedException
	{
		System.out.println("Click Forgot Username");
		Thread.sleep(5000);
		clickById("login_link_forgotusername");
		return this;
	}
	
	public LoginPage verifyForgotPassword()
	{
		System.out.println("Verify Forgot Password");
		verifyElementisPresentById("login_link_forgotpassword", "Forgot Password");
		return this;
	}
	
	public LoginPage clickForgotPassword() throws InterruptedException
	{
		System.out.println("Click Forgot Password");
		Thread.sleep(5000);
		clickById("login_link_forgotpassword");
		return this;
	}
	
	public LoginPage clickForgotPasswordNextBtn()
	{
		System.out.println("Click Forgot Password Next button");
//		clickByXpath("//button/span[text()='Next']");
		clickById("forgotpassword_button_next");
		return this;
	}
	
	public LoginPage selectAuthTypeForgotPassword(String auth)
	{
		System.out.println("select Auth Type for Forgot Password");
		clickByXpath("//div[contains(text(),'"+auth+"')]");
//		clickById("login_select_'"+auth+"')]");
		return this;
	}
	
	public LoginPage selectForgotPasswordDOB(String Date, String Month, String Year)
	{
		System.out.println("Select Forgot Password DOB");
		clickById("shared_creditcard_input_daterange");
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
		
	public LoginPage verifySignInBtn()
	{
		System.out.println("Verify Sign In button");
		verifyElementisPresentById("login_button_login", "Sign In");
		return this;
	}
		
	public LoginPage clickSignInBtn()
	{
		System.out.println("Click Sign In button");
		clickByXpath("//button[@type='submit']");
		return this;
	}
	
	public LoginPage verifyInvalidUserIDorPasswordErrorMsg() {
		System.out.println("Verify Invalid UserID or Password Error Msg");
		verifyTextById("login_hint_username", "Invalid user ID or password. You are left with four more attempts.");
		return this;
	}
	
	public LoginPage verifyAccountLockedMsg() {
		System.out.println("Verify Account Locked Msg");
		verifyTextById("login_label_AccountLocked", "Your user account has been locked. Please contact bank administator.");
		return this;
	}
	
	public LoginPage verifyCoolingPeriodEnabledErrorMsg() {
		System.out.println("Verify Cooling Period Enabled Error Msg");
		verifyTextById("login_label_Cooling_Period_Enabled", "Cooling Period is not over. Please try to login after Cooling Period.");
		return this;
	}
		
	public LoginPage verifyOTACHeading()
	{
		System.out.println("Verify OTAC Heading");
//		verifyElementisPresent("//h3[contains(text(),'One Time Authentication Code')]", "One Time Authentication Code Heading");
		verifyElementisPresentById("FirstTimeLogin_label_One_Time_Authentication_Code", "One Time Authentication Code Heading");
//		verifyTextByXpath("//h3[contains(text(),'One Time Authentication Code')]", "One Time Authentication Code");
		verifyTextById("FirstTimeLogin_label_One_Time_Authentication_Code", "One Time Authentication Code");
		return this;
	}	
	
	public LoginPage verifyOTACSentToEmailMsg()
	{
		System.out.println("Verify OTAC sent to Email Msg");
		verifyElementisPresentById("FirstTimeLogin_label_For your security, we have sent a one time Activation code to your registered email id", "OTAC to email message");
		verifyTextById("FirstTimeLogin_label_For your security, we have sent a one time Activation code to your registered email id", "For your security, we have sent a one time Activation code to your registered email id");
		return this;
	}
	
	public LoginPage verifyEnterAuthCodeLabel()
	{
		System.out.println("Verify OTAC Auth Code Label");
		verifyElementisPresentById("FirstTimeLogin_label_Enter_Authentication_Code", "Auth Code Label");
		verifyTextById("FirstTimeLogin_label_Enter_Authentication_Code", "Enter Authentication Code");
		return this;
	}
	
	public LoginPage entertOTACAuthCode()
	{
		System.out.println("Verify Incorrect OTAC Auth Code");
		enterById("FirstTimeLogin_input_authCode", "123456");
		return this;
	}
	
	public LoginPage enterExpiredOTACAuthCode(String AuthCode)
	{
		System.out.println("Verify Expired OTAC Auth Code");
		enterById("FirstTimeLogin_input_Expired_authCode", AuthCode);
		return this;
	}
	
	public LoginPage enterIncorrectOTACAuthCode(String AuthCode)
	{
		System.out.println("Verify Incorrect OTAC Auth Code");
		enterById("FirstTimeLogin_input_Incorrect_authCode", AuthCode);
		return this;
	}
	
	public LoginPage clickNextBtn()
	{
		System.out.println("Click Next button");
		clickByXpath("//button/span[text()='Next']");
//		clickById("shared_creditcard_button_next");
//		clickById("shared_2fa_button_next");
		return this;
	}	
	
	public LoginPage verifyNextButton() 
	{
		
		verifyElementisPresentById("shared_creditcard_button_next", "Next button");
//		String DefaultColor = driver.findElement(By.id("shared_creditcard_button_next")).getCssValue("background-color");
//		String HightlightedColor = driver.findElement(By.id("shared_creditcard_button_next")).getCssValue("background-color");
//		System.out.println(DefaultColor);
//		System.out.println(HightlightedColor);
//		if(!DefaultColor.equals(HightlightedColor))
//		{
//			System.out.println("First Time Login NEXT button is enabled!");
//			reportStep("First Time Login NEXT button is enabled!", "PASS");
//		}
//		else
//		{
//			System.out.println("First Time Login NEXT button is disabled!");
//			reportStep("First Time Login NEXT button is disabled!", "FAIL");
//		}
		return this;
	}
	
	public LoginPage verifyExpiredOTACErrorMsg() {
		verifyTextById("FirstTimeLogin_label_Expired_OTAC", "Expired OTAC. OTAC has expired. Please contact bank adminstrator");
		return this;
	}
	
	public LoginPage verifyOTACUnsuccessfulAttemptsErrorMsg() {
		verifyTextById("FirstTimeLogin_label_OTAC_Unsuccessful_Attempts", "Incorrect OTAC. You have only 3 more attempts pending");
		return this;
	}

	public LoginPage clickHomeTab()
	{
		System.out.println("Click Home Tab");
		clickById("menu_label_rb_home");
		return this;
	}
	
	public LoginPage clickAboutUsTab()
	{
		System.out.println("Click About Us Tab");
		clickById("menu_label_about");
		return this;
	}
	
	public LoginPage clickLocateUsTab()
	{
		System.out.println("Click Locate Us Tab");
		clickById("menu_label_locate");
		return this;
	}
	
	public LoginPage clickContactUsTab()
	{
		System.out.println("Click Contact Us Tab");
		clickById("menu_label_contact");
		return this;
	}
	
	public LoginPage clickViewDemoTab()
	{
		System.out.println("Click View Demo Tab");
		clickById("menu_label_demo");
		return this;
	}
	
	public LoginPage clickFAQTab()
	{
		System.out.println("Click FAQ Tab");
		clickById("menu_label_faq");
		return this;
	}
	
	public LoginPage selectLanguage(String Lang)
	{
		System.out.println("Select Language in Login Page");
		clickByXpath("(//span[text()='English'])[2]");
	    clickByXpath("//span[@class='mat-option-text']//following-sibling::span[contains(text(),'"+Lang+"')]");
		return this;
	}
	
	public LoginPage clickFacebookIcon()
	{
		System.out.println("Click Facebook Icon");
		clickByXpath("//img[@alt='mxfacebook']");
		return this;
	}

	public LoginPage clickLinkedInIcon()
	{
		System.out.println("Click LinkedIn Icon");
		clickByXpath("//img[@alt='mxlinkedin']");
		return this;
	}
	
	public LoginPage clickTwitterIcon()
	{
		System.out.println("Click Twitter Icon");
		clickByXpath("//img[@alt='mxtwitter']");
		return this;
	}
		
	public LoginPage verifyAuthenticationHeading()
	{
		System.out.println("Verify Authentication Heading");
		verifyElementisPresent("shared_login_2fa_label_authentication", "Authentication Heading");
		verifyTextById("shared_login_2fa_label_authentication", "Authentication");
		return this;
	}
	
	public LoginPage select2FAType(String auth)
	{
		System.out.println("Select 2FA Type");
		clickByXpath("//div//span[text()='Select']");
	    clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+auth+"')]");
		return this;
	}
	
	public LoginPage enterSMSOTP() throws InterruptedException
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
	
	public LoginPage verifyFieldsInCCDetailsPage()
	{
		System.out.println("Verify the Fields in the Credit Card Details");
		verifyElementisPresentById("shared_creditcard_input_cardno", "Credit Card Number Input");
		verifyElementisPresent("(//input[@formcontrolname='input'])[1]", "CVV Input");
//		verifyElementisPresentById("registration_input_card_expiry", "Card Expiry Input");
		verifyElementisPresentById("shared_creditcard_input_daterange", "DOB Input");
//		verifyElementisPresentById("registration_input_card_limit", "Credit Card Limit Input");
		verifyElementisPresentById("shared_creditcard_button_next", "Next Button");		
		return this;
	}
	
	public LoginPage verifyLabelsInCCDetailsPage()
	{
		System.out.println("Verify the Labels in the Credit Card Details");
		verifyTextById("shared_login_2fa_label_cardnumber", "Card Number");
		verifyTextById("shared_creditcard_label_cvv", "CVV");
//		verifyTextById("registration_label_card_expiry", "Expiry Date");
		verifyTextById("shared_creditcard_label_date", "Date of Birth");
//		verifyTextById("registration_label_card_limit", "Card Limit");
		return this;
	}
	
	public LoginPage verifyEnterCCDetailsToAuthLabel() {
		System.out.println("Verify Enter CC Details To Auth Label");
		verifyElementisPresent("//h4[contains(text(),'Enter Your Credit Card Details to Authenticate')]", "Enter Your Credit Card Details label");
		verifyTextByXpath("//h4[contains(text(),'Enter Your Credit Card Details to Authenticate')]", "Enter Your Credit Card Details to Authenticate");
		return this;
	}
	
	public LoginPage clickCreditCardNumber()
	{
		System.out.println("Click Credit Card Number");
		clickById("shared_creditcard_input_cardno");
		return this;
	}
	
	public LoginPage enterCreditCardNumber()
	{
		System.out.println("Enter Credit Card Number");
		enterById("shared_creditcard_input_cardno", "9876543210123654");
		return this;
	}
	
	public LoginPage enterCreditCardNumber(String CCnum)
	{
		System.out.println("Enter Credit Card Number");
		enterById("shared_creditcard_input_cardno", CCnum);
		return this;
	}
	
	public LoginPage enterCreditCardCVV()
	{
		System.out.println("Enter Credit Card CVV");
		enterByXpath("(//input[@formcontrolname='input'])[1]", "1");
		enterByXpath("(//input[@formcontrolname='input'])[2]", "2");
		enterByXpath("(//input[@formcontrolname='input'])[3]", "3");
		return this;
	}
	
	public LoginPage enterIncorrectCreditCardCVV()
	{
		System.out.println("Enter Credit Card CVV");
		enterByXpath("(//input[@formcontrolname='input'])[1]", "3");
		enterByXpath("(//input[@formcontrolname='input'])[2]", "2");
		enterByXpath("(//input[@formcontrolname='input'])[3]", "1");
		return this;
	}
	
	public LoginPage verifyCreditCardCVVLimit()
	{
		System.out.println("Verify Credit Card CVV Limit");
		verifyElementisPresentById("(//input[@formcontrolname='input'])[1]", "CVV Input 1");
		verifyElementisPresentById("(//input[@formcontrolname='input'])[2]", "CVV Input 2");
		verifyElementisPresentById("(//input[@formcontrolname='input'])[3]", "CVV Input 3");
		return this;
	}
	
	public LoginPage blankCardExpiryDate()
	{
		System.out.println("Blank Credit Card Expiry Date");
//		clickByXpath("(//mat-icon[contains(text(),'date_range')])[1]");
		clickById("login_input_card_expiry");
		clickEscapeButton();
		return this;
	}
	
	public LoginPage selectCardExpiryDate(String Month, String Year)
	{
		System.out.println("Select Credit Card Expiry Date");
//		clickByXpath("(//mat-icon[contains(text(),'date_range')])[1]");
		clickById("login_input_card_expiry");
		clickByXpath("(//mat-select[@role='listbox'])[1]");
		clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+Month+"')]");
		clickByXpath("(//mat-select[@role='listbox'])[2]");
		clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+Year+"')]");

		return this;
	}
	
	public LoginPage verifyCardExpiryDate()
	{
		System.out.println("verify Card Expiry Date Format");
		verifyElementisPresentById("registration_input_card_expiry", "DOB Input");
		String ExpiryDate = getTextById("registration_input_card_expiry");
		verifyTextById("registration_input_card_expiry", ExpiryDate);		
		return this;
	}
	
	public LoginPage verifyDOBCalendarPopUp()
	{
		System.out.println("Verify DOB Calendar Pop Up");
		clickById("shared_creditcard_input_daterange");
		verifyElementisPresentById("shared_creditcard_input_daterange", "Calendar Pop Up");
		return this;
	}
	
	public LoginPage verifyDOBDatePicker()
	{
		System.out.println("verify DOB Date Picker");
		verifyElementisPresentById("shared_creditcard_input_daterange", "DOB Input");
		clickById("shared_creditcard_input_daterange");
		clickByXpath("(//mat-select[@role='listbox'])[2]");
		mouseOverByXpath("//mat-option//following::span[contains(text(),'2021')]");
		verifyElementisPresent("//mat-option//following::span[contains(text(),'2021')]", "DOB Year");
		mouseOverByXpath("//mat-select//following::span[contains(text(),'Mar')]");
		verifyElementisPresent("//mat-select//following::span[contains(text(),'Mar')]", "DOB Month");
		return this;
	}
	
	public LoginPage blankCardDOB()
	{
		System.out.println("Blank Card DOB");
//		clickByXpath("(//mat-icon[contains(text(),'date_range')])[1]");
		clickById("shared_creditcard_input_daterange");
		clickEscapeButton();
		return this;
	}
	
	public LoginPage selectDOB(String Date, String Month, String Year)
	{
		System.out.println("Select DOB");		
		clickById("shared_creditcard_input_daterange");
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
	
	public LoginPage verifyDOBDate()
	{
		System.out.println("verify DOB Date Format");
		verifyElementisPresentById("shared_creditcard_input_daterange", "DOB Input");
//		String DOB = getTextById("shared_creditcard_input_daterange");
//		verifyTextById("shared_creditcard_input_daterange", DOB);		
		return this;
	}
	
	public LoginPage enterCreditCardLimit(String limit)
	{
		System.out.println("Enter Credit Card Limit");
//		enterByXpath("(//input[@formcontrolname='input'])[1]", limit);
		enterById("login_input_card_limit", limit);
		return this;
	}
	
	public LoginPage verifyCreditCardEmptyErrorMsg() {
		verifyTextByXpath("//mat-error[contains(text(),'Credit card number is mandatory')]", "Credit card number is mandatory");
		return this;
	}
	
	public LoginPage verifyCreditCardLimitErrorMsg() {
		verifyTextByXpath("//mat-error[contains(text(),'Credit card number minimum length is 16')]", "Credit card number minimum length is 16");
		return this;
	}
	
	public LoginPage verifyCVVEmptyErrorMsg() {
//		verifyTextByXpath("//mat-error[contains(text(),'CVV is mandatory')]", "CVV is mandatory");
		verifyTextById("login_label_CVV_is_mandatory", "CVV is mandatory");
		return this;
	}
	
	public LoginPage verifyCreditCardInvalidErrorMsg() {
		System.out.println("Verify Credit Card Invalid Error Msg");
		verifyTextByXpath("//h2[contains(text(),'Invalid credit Card details')]", "Invalid credit Card details");
		clickOKbtn();
		return this;
	}
	
	public LoginPage verifyExpiryDateEmptyErrorMsg() {
//		verifyTextByXpath("//mat-error[contains(text(),'Expiry Date is mandatory')]", "Expiry Date is mandatory");
		verifyTextById("login_label_Expiry_Date_is_mandatory", "Expiry Date is mandatory");
		return this;
	}
	
	public LoginPage verifyDOBAgeErrorMsg() {
//		verifyTextByXpath("//mat-error[contains(text(),'Age must be 18 years to proceed with registration')]", "Age must be 18 years to proceed with registration");
		verifyTextById("login_label_Age_must_be_18_years_to_proceed_with_registration", "Age must be 18 years to proceed with registration");
		return this;
	}
	
	public LoginPage verifyDOBEmptyErrorMsg() {
//		verifyTextByXpath("//mat-error[contains(text(),'DOB is mandatory')]", "DOB is mandatory");
		verifyTextById("login_label_DOB_is_mandatory", "DOB is mandatory");
		return this;
	}
	
	public LoginPage verifyCreditLimitEmptyErrorMsg() {
//		verifyTextByXpath("//mat-error[contains(text(),'Credit Limit is mandatory')]", "Credit Limit is mandatory");
		verifyTextById("login_label_CreditLimit_is_mandatory", "Credit Limit is mandatory");
		return this;
	}
	
	public LoginPage clickResendCodeLink()
	{
		System.out.println("Click Resend Code Link");
		clickById("shared_login_2fa_label_resendcode");
		return this;
	}
	
	public LoginPage verifyResendCodeLink()
	{
		System.out.println("Verify Resend Code Link");
		verifyElementisPresentById("shared_login_2fa_label_resendcode", "Resend Code");
		verifyTextById("shared_login_2fa_label_resendcode", "Resend code");
		return this;
	}
		
	public LoginPage clickSubmitBtn2FAPage()
	{
		System.out.println("Click Submit button");
		clickByXpath("//button/span[contains(text(),'Submit')]");
//		clickById("shared_login_2fa_button_submitotp");
		return this;
	}
	
	public LoginPage verifyDashboardTitle() throws InterruptedException
	{
		System.out.println("Verify Dashboard title");
		Thread.sleep(4000);
		verifyElementisPresent("//span[contains(text(), 'Dashboard')]", "Dashboard");
		return this;
	}
	
	public LoginPage clickSubmitBtn()
	{
		System.out.println("Click Submit button");
		clickByXpath("//button/span[contains(text(),'Submit')]");
//		clickById("login_button_submit");
		return this;
	}
	
	public LoginPage clickCancelBtn()
	{
		System.out.println("Click Cancel button");
//		clickByXpath("//button/span[text()='Cancel']");
		clickById("shared_login_2fa_button_cancel");
		return this;
	}
	
	public LoginPage verifyNotesTextArea()
	{
		System.out.println("Verify Notes Text area");
//		verifyElementisPresent("//h2[contains(text(),'Notes')]", "Notes");
		verifyElementisPresentById("login_label_note", "Notes");
//		verifyTextByXpath("//h2[contains(text(),'Notes')]", "Notes");
		verifyTextById("login_label_note", "Notes");
		return this;
	}
	
	public LoginPage verifyCaneclPopUp()
	{
		System.out.println("Verify Canecl Pop Up");
		verifyElementisPresent("//p[contains(text(),'Are you sure you want to discard the changes?')]", "Cancel Pop Up");
		verifyTextByXpath("//p[contains(text(),'Are you sure you want to discard the changes?')]", "Are you sure you want to discard the changes?");
		return this;
	}
	
	public LoginPage clickYesbtn() {
		System.out.println("Click YES button");
		clickByXpath("//button/span[text()=' Yes ']");
		return this;
	}
	
	public LoginPage clickOKbtn() {
		System.out.println("Click OK button");
		clickByXpath("//button/span[contains(text(),'OK')]");
//		clickById("login_button_OK");
		return this;
	}
	
	public LoginPage clickEscapeButton()
	{
		System.out.println("Click Escape Button");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		return this;
	}
	
	public LoginPage userLogOut() throws InterruptedException {
		System.out.println("Logout the User");
		Thread.sleep(2000);
		clickByXpath("(//span[contains(text(), 'Logout')])[2]");
		return this;
	}
}
