package com.flipkart.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.LoginAlertDialogBox;
import com.flipkart.Pages.Policy;

public class PolicyPage extends BasePage{
	
	Policy policy;
	LoginAlertDialogBox LoginDialogBox;
	
	
	@Test(priority = 1,enabled = true)
	public void ValidateReturnPolicy()
	{
	
		policy = new Policy(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		policy.ClickingReturnPolicyLink().click();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
		
		// Implementing Assertion
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as ecpected");
				
	}
	
	
	@Test(priority = 2,enabled = true)
	public void ValidateSecurityLink()
	{
		
		policy = new Policy(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		policy.ClickingReturnPolicyLink().click();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
		System.out.println(ActualTitle);
		
		// Implementing Assertion
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as ecpected");	
		
	}
	
	
	@Test(priority = 3,enabled = true)
	public void ValidatePrivacyLink()
	{
	
		policy = new Policy(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		policy.ClickingReturnPolicyLink().click();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
		System.out.println(ActualTitle);
		
		// Implementing Assertion
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as ecpected");	
		
	}

}
