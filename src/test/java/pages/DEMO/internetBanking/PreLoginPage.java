package pages.DEMO.internetBanking;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class PreLoginPage extends wrappers.ProjectWrappers  {
	
	public static String SetPassword;
	
	public PreLoginPage(RemoteWebDriver driver, ExtentTest test)throws Exception{
		this.driver = driver;
		this.test = test;
//		openQAApplication();
		openDemoIBApplication();
	}
		
	public PreLoginPage verifyLoginToIBHeading()
	{
		System.out.println("Verify Login To IB Heading");
		verifyElementisPresent("//*[contains(text(),'Login')]", "Login to Internet Banking Heading");
		verifyTextByXpath("//*[contains(text(),'Login')]", "Login to Internet Banking");
		return this;
	}	
			
	public PreLoginPage verifyTakeMeDirectlyToHeading()
	{
		System.out.println("Verify Take Me Directly To Heading");
		verifyElementisPresent("//mat-select[@formcontrolname='directTo']", "Take Me Directly To Heading");
//		verifyTextByXpath("//mat-select[@formcontrolname='directTo']", "Take Me Directly To");
		return this;
	}	
		
	public PreLoginPage takeMeDirectlyTo(String page)
	{
		System.out.println("Select any one take me directly option");
		clickByXpath("//mat-select[@formcontrolname='directTo']");
	    clickByXpath("//span[@class='mat-option-text'][contains(text(),'"+page+"')]");
//	    clickById("login_select_Dashboard");
//	    clickById("login_select_Manage Cards");    
		return this;
	}
	
	public PreLoginPage clickHomeTab()
	{
		System.out.println("Click Home Tab");
		clickByXpath("//div[@class='ng-star-inserted']/a[contains(text(),'Home')]");
		return this;
	}
	
	public PreLoginPage clickAboutUsTab()
	{
		System.out.println("Click About Us Tab");
		clickByXpath("//div[@class='ng-star-inserted']/a[contains(text(),'About')]");
		return this;
	}
	
	public PreLoginPage clickLocateUsTab()
	{
		System.out.println("Click Locate Us Tab");
		clickByXpath("//div[@class='ng-star-inserted']/a[contains(text(),'Locate')]");
		return this;
	}
	
	public PreLoginPage selectLocateUsCategory(String Category)
	{
		System.out.println("Select Language in Login Page");
		clickByXpath("//mat-select[@formcontrolname='category']");
	    clickByXpath("//mat-option//span[contains(text(),'"+Category+"')]");
		return this;
	}
	
	public PreLoginPage enterSearchLocation()
	{
		System.out.println("Enter Search Location");
		enterByXpath("//input[@placeholder='Search']","Singapore");
		clickByXpath("//button/span[contains(text(),'Search')]");
		return this;
	}
		
	public PreLoginPage clickContactUsTab()
	{
		System.out.println("Click Contact Us Tab");
		clickByXpath("//div[@class='ng-star-inserted']/a[contains(text(),'Contact')]");
		return this;
	}
	
	public PreLoginPage clickViewDemoTab()
	{
		System.out.println("Click View Demo Tab");
		clickByXpath("//div[@class='ng-star-inserted']/a[contains(text(),'View Demo')]");
		return this;
	}
	
	public PreLoginPage clickFAQTab()
	{
		System.out.println("Click FAQ Tab");
		clickByXpath("//div[@class='ng-star-inserted']/a[contains(text(),'FAQ')]");
		return this;
	}
	
	public PreLoginPage selectLanguage(String Lang)
	{
		System.out.println("Select Language in Login Page");
		clickByXpath("(//span[text()='English'])[2]");
	    clickByXpath("//span[@class='mat-option-text']//following-sibling::span[contains(text(),'"+Lang+"')]");
		return this;
	}
	
	public PreLoginPage clickSecurityAndPrivacyLink()
	{
		System.out.println("Click Security And Privacy Link");
		clickByXpath("//p/b[contains(text(),'Security')]");
		return this;
	}
	
	public PreLoginPage clickFacebookIcon()
	{
		System.out.println("Click Facebook Icon");
		clickByXpath("//img[@alt='mxfacebook']");
		return this;
	}

	public PreLoginPage clickLinkedInIcon()
	{
		System.out.println("Click LinkedIn Icon");
		clickByXpath("//img[@alt='mxlinkedin']");
		return this;
	}
	
	public PreLoginPage clickTwitterIcon()
	{
		System.out.println("Click Twitter Icon");
		clickByXpath("//img[@alt='mxtwitter']");
		return this;
	}
			
	public PreLoginPage clickSubmitBtn()
	{
		System.out.println("Click Submit button");
		clickByXpath("//button/span[contains(text(),'Submit')]");
//		clickById("login_button_submit");
		return this;
	}
	
	public PreLoginPage clickCancelBtn()
	{
		System.out.println("Click Cancel button");
//		clickByXpath("//button/span[text()='Cancel']");
		clickById("shared_login_2fa_button_cancel");
		return this;
	}
	
	public PreLoginPage verifyNotesTextArea()
	{
		System.out.println("Verify Notes Text area");
//		verifyElementisPresent("//h2[contains(text(),'Notes')]", "Notes");
		verifyElementisPresentById("login_label_note", "Notes");
//		verifyTextByXpath("//h2[contains(text(),'Notes')]", "Notes");
		verifyTextById("login_label_note", "Notes");
		return this;
	}
	
	public PreLoginPage verifyCaneclPopUp()
	{
		System.out.println("Verify Canecl Pop Up");
		verifyElementisPresent("//p[contains(text(),'Are you sure you want to discard the changes?')]", "Cancel Pop Up");
		verifyTextByXpath("//p[contains(text(),'Are you sure you want to discard the changes?')]", "Are you sure you want to discard the changes?");
		return this;
	}
	
	public PreLoginPage clickYesbtn() {
		System.out.println("Click YES button");
		clickByXpath("//button/span[text()=' Yes ']");
		return this;
	}
	
	public PreLoginPage clickOKbtn() {
		System.out.println("Click OK button");
		clickByXpath("//button/span[contains(text(),'OK')]");
//		clickById("login_button_OK");
		return this;
	}
	
	public PreLoginPage clickEscapeButton()
	{
		System.out.println("Click Escape Button");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		return this;
	}
	
	public PreLoginPage userLogOut() throws InterruptedException {
		System.out.println("Logout the User");
		Thread.sleep(2000);
		clickByXpath("(//span[contains(text(), 'Logout')])[2]");
		return this;
	}
}
