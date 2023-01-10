package com.flipkart.testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.HelpUs;
import com.flipkart.Pages.LoginAlertDialogBox;

public class HelpUsPage extends BasePage{
	
	HelpUs Helpus;
	LoginAlertDialogBox LoginDialogBox;
	
	
	
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 1,enabled = true)
	public void ValidatePaymentLink(String ExpectedTitle)
	{

		Helpus = new HelpUs(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		Helpus.ClickingPayment().click();
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		// Implementing Assertion
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as expected");
		
	}
	
	
	
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 2 , enabled = true)
	public void ValidateShippingLink(String ExpectedTitle)
	{
	
		Helpus = new HelpUs(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		Helpus.ClickingShipping().click();
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		// Implementing Assertion
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as expected");
		
		
	}
	
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 3 , enabled = true)
	public void ValidateFAQLink(String ExpectedTitle)
	{
	
		Helpus = new HelpUs(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		Helpus.ClickingFAQ().click();
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		// Implementing Assertion
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as expected");
		
		
	}

}
