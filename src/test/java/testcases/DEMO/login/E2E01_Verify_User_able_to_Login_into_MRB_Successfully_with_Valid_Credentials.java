package testcases.DEMO.login;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DEMO.internetBanking.LoginPage;

public class E2E01_Verify_User_able_to_Login_into_MRB_Successfully_with_Valid_Credentials extends wrappers.ProjectWrappers{
	
	public E2E01_Verify_User_able_to_Login_into_MRB_Successfully_with_Valid_Credentials() throws IOException {
	}
	
	@BeforeClass
	public void setData() {
		TestCaseName="E2E01_Verify_User_able_to_Login_into_MRB_Successfully_with_Valid_Credentials";
		TestDescription="E2E01_Verify_User_able_to_Login_into_MRB_Successfully_with_Valid_Credentials";
		browserName="chrome";
		Application="Mobeix Retail Banking - IB";
		Authors="Automation Team";
	}
	
	@Test(enabled = true)
	public void verifyAuthScreen() throws Exception
	{
	  System.out.println("E2E01_Verify_User_able_to_Login_into_MRB_Successfully_with_Valid_Credentials Execution Started:");
	  new LoginPage(driver, test)
	  	.enterUserName()
	  	.enterPassword()
	  	.takeMeDirectlyTo("Dashboard")
	  	.clickSignInBtn()
	  	.select2FAType("SMS OTP")
	  	.enterSMSOTP()
	  	.clickSubmitBtn2FAPage()
	  	.verifyDashboardTitle();
		System.out.println("E2E01_Verify_User_able_to_Login_into_MRB_Successfully_with_Valid_Credentials Executed sucessfully");
	}
}
