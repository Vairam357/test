package testcases.DEMO.login;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DEMO.internetBanking.LoginPage;

public class E2E03_Verify_User_able_to_verify_Dashboard_Page_in_MRB extends wrappers.ProjectWrappers{
	
	public E2E03_Verify_User_able_to_verify_Dashboard_Page_in_MRB() throws IOException {
	}
	
	@BeforeClass
	public void setData() {
		TestCaseName="E2E03_Verify_User_able_to_verify_Dashboard_Page_in_MRB";
		TestDescription="E2E03_Verify_User_able_to_verify_Dashboard_Page_in_MRB";
		browserName="chrome";
		Application="Mobeix Retail Banking - IB";
		Authors="Automation Team";
	}
	
	@Test(enabled = true)
	public void verifyAuthScreen() throws Exception
	{
	  System.out.println("E2E03_Verify_User_able_to_verify_Dashboard_Page_in_MRB Execution Started:");
	  new LoginPage(driver, test)
	  	.enterUserName()
	  	.enterPassword()
	  	.takeMeDirectlyTo("Dashboard")
	  	.clickSignInBtn()
	  	.select2FAType("SMS OTP")
	  	.enterSMSOTP()
	  	.clickSubmitBtn2FAPage()
	  	.verifyDashboardTitle();
		System.out.println("E2E03_Verify_User_able_to_verify_Dashboard_Page_in_MRB Executed sucessfully");
	}
}
