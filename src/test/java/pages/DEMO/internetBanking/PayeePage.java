package pages.DEMO.internetBanking;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class PayeePage extends wrappers.ProjectWrappers  {
		
	public PayeePage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
		openDemoIBApplication();
	}
	
	public PayeePage loginUsingSMS() throws InterruptedException {
		enterUserName()
	  	.enterPassword()
	  	.takeMeDirectlyTo("Dashboard")
	  	.clickSignInBtn()
	  	.select2FAType("SMS OTP")
	  	.enterSMSOTP()
	  	.clickSubmitBtn2FAPage();
		return this;
	}
		
	public PayeePage clickUserName() throws InterruptedException{
		System.out.println("Click the User Name");
		Thread.sleep(3000);
		clickById("login_input_username");
		return this;
	}
	
	public PayeePage enterUserName() throws InterruptedException{
		System.out.println("Enter the User Name");
		Thread.sleep(3000);
		enterByXpath("(//input[@placeholder='Enter'])[1]", "vikram444");
		return this;
	}
	
	public PayeePage clickPassword(){
		System.out.println("Click the Password");
		clickById("login_input_password");
		return this;
	}
	
	public PayeePage enterPassword(){
		System.out.println("Enter the Password");
		enterByXpath("(//input[@placeholder='Enter'])[2]", "Password12");
		return this;
	}
	
	public PayeePage takeMeDirectlyTo(String page)
	{
		System.out.println("Select any one take me directly option");
		clickByXpath("//mat-select[@formcontrolname='directTo']");
	    clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+page+"')]");
		return this;
	}

	public PayeePage clickSignInBtn()
	{
		System.out.println("Click Sign In button");
		clickByXpath("//button[@type='submit']");
		return this;
	}
		
	public PayeePage clickNextBtn()
	{
		System.out.println("Click Next button");
		clickByXpath("//button/span[text()='Next']");
		return this;
	}	
	
	public PayeePage select2FAType(String auth)
	{
		System.out.println("Select 2FA Type");
		clickByXpath("//div//span[text()='Select']");
	    clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+auth+"')]");
		return this;
	}
	
	public PayeePage enterSMSOTP() throws InterruptedException
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

	public PayeePage clickResendCodeLink()
	{
		System.out.println("Click Resend Code Link");
		clickByXpath("//span[contains(text(),'Resend code')]");
		return this;
	}
	
	public PayeePage clickSubmitBtn2FAPage()
	{
		System.out.println("Click Submit button");
		clickByXpath("//button/span[contains(text(),'Submit')]");
		return this;
	}
	
	public PayeePage verifyDashboardTitle() throws InterruptedException
	{
		System.out.println("Verify Dashboard title");
		Thread.sleep(4000);
		verifyElementisPresent("//span[contains(text(), 'Dashboard')]", "Dashboard");
		return this;
	}
	
	public PayeePage clickTransfersTab() throws InterruptedException
	{
		System.out.println("Click Transfers Tab");
		clickByXpath("//span[contains(text(),'Transfers')]");
		Thread.sleep(4000);
		return this;
	}
	
	public PayeePage clickTransfersArrow() throws InterruptedException
	{
		System.out.println("Click Transfers Arrow");
		clickByXpath("//span[contains(text(),'Transfers')]/parent::a/child::span/span");
		Thread.sleep(4000);
		return this;
	}
	
	public PayeePage selectManagePayee()
	{
		System.out.println("Select Manage Payee");
		clickByXpath("//span[contains(text(),'Manage Payee')]");
		return this;
	}
	
	public PayeePage clickNewPayeeButton()
	{
		System.out.println("Click New Payee Button");
		clickByXpath("//button/span/span[contains(text(),'New Payee')]");
		return this;
	}
	
	public PayeePage clickSameBankPayee()
	{
		System.out.println("Click Same Bank Payee");
		clickByXpath("//button/span[contains(text(),'Same Bank Payee')]");
		return this;
	}
	
	
	public PayeePage clickInternationalPayee()
	{
		System.out.println("Click International Payee");
		clickByXpath("//button/span[contains(text(),'International Payee')]");
		return this;
	}
	
	
	public PayeePage clickLocalBankPayee()
	{
		System.out.println("Click Local Bank Payee");
		clickByXpath("//button/span[contains(text(),'Local Bank Payee')]");
		return this;
	}
	
	
	public PayeePage enterAccountNumber(String Accountno){
		System.out.println("Enter Account NUmber");
		enterByXpath("//input[@formcontrolname='encan']", Accountno);
		return this;
	}
	
	// Enter the Nickname
	public PayeePage enterNickname(String nickname){
		System.out.println("Enter Nick name");
		enterByXpath("//input[@formcontrolname='pnn']", nickname);
		return this;
	}
	
	public PayeePage verifyPayeeType()  {
		System.out.println("Verify Payee Type ");
		verifyElementisPresent("//span[contains(text(),'Payee Type')]", "Payee Type");
		return this;
	}
	
	public PayeePage verifyPayeeAccountNumber()  {
		System.out.println("Verify Payee Account Number ");
		verifyElementisPresent("//span[contains(text(),'Payee Account Number')]", "Payee Account Number");
		return this;
	}
	public PayeePage verifyPayeeName()  {
		System.out.println("Verify Payee Name ");
		verifyElementisPresent("//span[contains(text(),'Payee Name')]", "Payee Name");
		return this;
	}
	
	public PayeePage verifyPayeeNickname()  {
		System.out.println("Verify Payee Nickname ");
		verifyElementisPresent("//span[contains(text(),'Payee Nickname')]", "Payee Nickname");
		return this;
	}
	
	public PayeePage verifyBankCode()  {
		System.out.println("Verify Bank Code");
		verifyElementisPresent("//span[contains(text(),'Bank Code')]", "Bank Code");
		return this;
	}
	
	public PayeePage verifyPayeeSuccessMessage()  {
		System.out.println("Verify Payee Success Message ");
		verifyElementisPresent("//*[contains(text(),'Success! The payee added successfully.')]", "Success! The payee added successfully.");
		return this;
	}
	
	public PayeePage clickAnotherPayeeButton()
	{
		System.out.println("Click Another Payee Button");
		clickByXpath("//button/span[contains(text(),'Add Another Payee')]");
		return this;
	}
	
	public PayeePage clickTransferButton()
	{
		System.out.println("Click Transfer Button");
		clickByXpath("//button/span[contains(text(),'Transfers')]");
		return this;
	}
	
	public PayeePage enterPayeeName(String payeename){
		System.out.println("Enter Payee name");
		enterByXpath("//input[@formcontrolname='pn']", payeename);
		return this;
	}
	
	public PayeePage reenterAccountNumber(String reenterAccountNo){
		System.out.println("Re Enter Account NUmber");
		enterByXpath("//input[@formcontrolname='rean']", reenterAccountNo);
		return this;
	}
	
	public PayeePage clickConfirmBtn()
	{
		System.out.println("Click Confirm button");
		clickByXpath("//button/span[text()='Confirm']");
		return this;
	}	
	
	public PayeePage clickOKbtn() {
		System.out.println("Click OK button");
		clickByXpath("//button/span[contains(text(),'OK')]");
		return this;
	}
	
	public PayeePage clickPayeeBank()
	{
		System.out.println("Click Payee Bank");
		clickByXpath("//input[@formcontrolname='pbc']");
		return this;
	}	
	
	public PayeePage enterBankName(String bankName) 
	{
		System.out.println("Enter Bank Name");
		enterByXpath("//input[@formcontrolname='qs']", bankName);	
		return this;
	}
	
	public PayeePage clickSearchButton()
	{
		System.out.println("Click Search Button");
		clickByXpath("//span[contains(text(),'Search')]/parent::button");
		return this;
	}	
	
	//International Payee
	public PayeePage enterInternationalPayee(String intAccountNo){
		System.out.println("Enter International Payee A/c No");
		enterByXpath("//input[@formcontrolname='enc_an']", intAccountNo);
		return this;
	}
	
	public PayeePage enterReenterIntPayeeAccountNumber(String reenterPayeeAccountNo){
		System.out.println("Re Enter International Payee Account NUmber");
		enterByXpath("//input[@formcontrolname='c_enc_an']", reenterPayeeAccountNo);
		return this;
	}
	
	public PayeePage enterIntAddress1(String addressFirst){
		System.out.println("Enter International Address 1");
		enterByXpath("//input[@formcontrolname='pal1']", addressFirst);
		return this;
	}
	
	public PayeePage enterIntAddress2(String addressSecond){
		System.out.println("Enter International Address 2");
		enterByXpath("//input[@formcontrolname='pal2']", addressSecond);
		return this;
	}
	
	public PayeePage selectCountry(String countryName)
	{
		System.out.println("Select Country");
		clickByXpath("//*[@formcontrolname='pac']/child::div/div/span[text()='Select']");
		clickByXpath("//span[contains(text(),'"+countryName+"')]");
		return this;
	}	
	
	public PayeePage selectMobileNumber(String countryCode, String mobileNumber) throws InterruptedException
	{
		System.out.println("Select Country Code and Enter Mobile Number");
		// passing country code
		clickByXpath("//span[contains(text(),'"+countryCode+"')]");
		Thread.sleep(3000);
		// Passing Mobile Number
		enterByXpath("//input[@formcontrolname='pmn']", mobileNumber);
		return this;
	}
	
	// View Link
	public PayeePage clickPayeeViewLink(String payeeName)
	{
		System.out.println("Click View Link");
		// Enter the Payee Name, it will click the View Link
		clickByXpath("//div[contains(text(),'"+payeeName+"')]/parent::div/parent::div/parent::div/child::div/div/span/p[contains(text(),'View')]");
		return this;
	}	
	
	public PayeePage verifyPayeeCountry()  {
		System.out.println("Verify Payee Country");
		verifyElementisPresent("//span[contains(text(),'Payee Country')]", "Payee Country");
		return this;
	}
	
	public PayeePage verifyPayeeMobileNumber()  {
		System.out.println("Verify Payee Mobile Number");
		verifyElementisPresent("//span[contains(text(),'Payee Mobile Number')]", "Payee Mobile Number");
		return this;
	}
	
	public PayeePage verifyPayeeBankAddress()  {
		System.out.println("Verify Payee Bank Address");
		verifyElementisPresent("//span[contains(text(),'Bank Branch Address')]", "Bank Branch Address");
		return this;
	}
	
	public PayeePage verifySwiftCode()  {
		System.out.println("Verify Swift Code");
		verifyElementisPresent("//span[contains(text(),'SWIFT/BIC Code')]", "SWIFT/BIC Code");
		return this;
	}
	
	public PayeePage verifyPayeeUpdateSuccessMessage()  {
		System.out.println("Verify Payee Update Success Message");
		verifyElementisPresent("//h3[contains(text(),'Success! The payee has been updated successfully.')]", "Success! The payee has been updated successfully.");
		return this;
	}

	// Edit Link
	public PayeePage clickPayeeEditLink(String payeeName)
	{
		System.out.println("Click Edit Link");
		// Enter the Payee Name, it will click the Edit Link
		clickByXpath("//div[contains(text(),'"+payeeName+"')]/parent::div/parent::div/parent::div/child::div/div/span/p[contains(text(),'Edit')]");
		return this;
	}	

	// Delete Link
	public PayeePage clickPayeeDeleteLink(String payeeName)
	{
		System.out.println("Click Delete Link");
		// Enter the Payee Name, it will click the Delete Link
		clickByXpath("//div[contains(text(),'"+payeeName+"')]/parent::div/parent::div/parent::div/child::div/div/span/p[contains(text(),'Delete')]");
		return this;
	}	
	
	public PayeePage clickEditPayeeButton()
	{
		System.out.println("Click Edit Payee");
		clickByXpath("//button/span[contains(text(),'Edit Payee')]");
		return this;
	}
	
	public PayeePage clickDeletePayeeButton()
	{
		System.out.println("Click Delete Payee");
		clickByXpath("//button/span[contains(text(),'Delete Payee')]");
		return this;
	}
	
	public PayeePage clickManagePayeeButton()
	{
		System.out.println("Click Manage Payee");
		clickByXpath("//button/span[contains(text(),'Manage Payee')]");
		return this;
	}
	
	public PayeePage verifyPayeeDeleteSuccessMessage()  {
		System.out.println("Verify Payee Delete Success Message");
		verifyElementisPresent("//h3[contains(text(),'Success! Your payee has been deleted successfully')]", "Success! Your payee has been deleted successfully");
		return this;
	}
	
	public PayeePage userLogOut() throws InterruptedException {
		System.out.println("Logout the User");
		Thread.sleep(2000);
		clickByXpath("(//span[contains(text(), 'Logout')])[2]");
		return this;
	}
}
