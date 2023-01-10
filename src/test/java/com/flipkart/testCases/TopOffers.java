package com.flipkart.testCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.LoginAlertDialogBox;
import com.flipkart.Pages.TopOffersPage;

public class TopOffers extends BasePage{
	
	TopOffersPage TopOffers;
	LoginAlertDialogBox LoginDialogBox;
	
	
	
	@SuppressWarnings("deprecation")
	@Test(priority =1,enabled=true)
	public void TestTopOffersLink()
	{
		TopOffers = new TopOffersPage(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		TopOffers.ClickingTopOffersLink().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TopOffers.ClickingHomeFurnishingRangeLink().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Content Store Online - Buy Content Online at Best Price in India | Flipkart.com";
		
		// Implementing Assertion
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as expected");
		
	}
}
