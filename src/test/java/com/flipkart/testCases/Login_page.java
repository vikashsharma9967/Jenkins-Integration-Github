package com.flipkart.testCases;

import org.testng.annotations.Test;

import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.CreateAccount;
import com.flipkart.Pages.LoginAlertDialogBox;
import com.flipkart.Pages.LoginPage;

public class Login_page extends BasePage{
	
	
	LoginPage login;
	CreateAccount createAccount;
	LoginAlertDialogBox LoginDialogBox;
	
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority=1,enabled = true)
	public void Validating_login(String Email)
	{
		login = new LoginPage(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		login.ClickingLoginBtn();
		login.EnteringEmail(Email);
		login.ClickingRequestOtpButton();
	}
	
	
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 2, enabled = true)
	public void Validating_Registering(String MobileNumber)
	{
		createAccount = new CreateAccount(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		createAccount.clickingLogingBtn();
		createAccount.clickingCreateAccount();
		createAccount.EnterMobileNumber(MobileNumber);
		createAccount.clickingContinueBtn();
		
	}

}
