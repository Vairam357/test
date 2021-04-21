package testcases.DEMO.login;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DEMO.internetBanking.LoginPage;

public class E2E02_Verify_User_able_to_Logout_Successfully_from_MRB_After_Login extends wrappers.ProjectWrappers{
	
	public E2E02_Verify_User_able_to_Logout_Successfully_from_MRB_After_Login() throws IOException {
	}
	
	@BeforeClass
	public void setData() {
		TestCaseName="E2E02_Verify_User_able_to_Logout_Successfully_from_MRB_After_Login";
		TestDescription="E2E02_Verify_User_able_to_Logout_Successfully_from_MRB_After_Login";
		browserName="chrome";
		Application="Mobeix Retail Banking - IB";
		Authors="Automation Team";
	}
	
	@Test(enabled = true)
	public void verifyAuthScreen() throws Exception
	{
	  System.out.println("E2E02_Verify_User_able_to_Logout_Successfully_from_MRB_After_Login Execution Started:");
	  new LoginPage(driver, test)
	  	.enterUserName()
	  	.enterPassword()
	  	.takeMeDirectlyTo("Dashboard")
	  	.clickSignInBtn()
	  	.select2FAType("SMS OTP")
	  	.enterSMSOTP()
	  	.clickSubmitBtn2FAPage()
	  	.verifyDashboardTitle()
	  	.userLogOut();
		System.out.println("E2E02_Verify_User_able_to_Logout_Successfully_from_MRB_After_Login Executed sucessfully");
	}
}
