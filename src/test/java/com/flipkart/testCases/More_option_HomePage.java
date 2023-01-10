package com.flipkart.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.LoginAlertDialogBox;
import com.flipkart.Pages.MoreOptionNavBar;

public class More_option_HomePage extends BasePage{
	
	MoreOptionNavBar moreOption;
	LoginAlertDialogBox LoginDialogBox;
	
	
	@Test(priority = 1,enabled = true)
	public void Validating_MoreOption_Notification_option() throws Exception
	{
		moreOption = new MoreOptionNavBar(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		moreOption.clickingMorebtn();
		moreOption.clickingNotificationOption();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		assertEquals(ActualTitle, ExpectedTitle,"The Title of the page is not same as expected");
		System.out.println("The Title of the page is same as expected");
	}
	
	
	@Test(priority = 2, enabled = true)
	public void Validating_Moreoption_Customercare_option()
	{
		moreOption = new MoreOptionNavBar(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		moreOption.clickingMorebtn();
		moreOption.clickingCustomerCareOption();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		// Implementing Assertion
		assertEquals(ActualTitle, ExpectedTitle,"The Title of the page is not same as expected");
		System.out.println("The Title of the page is same as expected");
		
		
	}
	
	
	@Test(priority = 3,enabled = true)
	public void Validating_Moreoption_Advertise_option()
	{
		moreOption = new MoreOptionNavBar(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		moreOption.clickingMorebtn();
		moreOption.clickingAdertiseOption();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Flipkart Ads Platform";
		
		// Implementing Assertion
		assertEquals(ActualTitle, ExpectedTitle,"The Title of the page is not same as expected");
		System.out.println("The Title of the page is same as expected");
		
	}

}
