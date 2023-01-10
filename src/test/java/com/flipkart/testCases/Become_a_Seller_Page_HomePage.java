package com.flipkart.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.flipkart.Pages.Become_A_Seller;
import com.flipkart.Pages.LoginAlertDialogBox;
import com.flipkart.BasePage.BasePage;

public class Become_a_Seller_Page_HomePage extends BasePage {
	
	
	Become_A_Seller become_a_seller;
	LoginAlertDialogBox LoginDialogBox;
	
	
	
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 1,enabled = true)
	public void Validating_Become_A_Seller_registration_form(String ExpectedTitle,String MobileNumber)
	{
		
		// Creating object for become_a_seller class
		become_a_seller = new Become_A_Seller(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		become_a_seller.clickingBecomeSellerLink().click();
		become_a_seller.EnterMobileNumber().sendKeys(MobileNumber);
		become_a_seller.ClickingStartSellingButton().click();
		
		// Storing the title of Webpage
		String actualTitle= driver.getTitle();
		
		// Asserting browser title with actual and expected title of the webpage.
		assertEquals(actualTitle, ExpectedTitle,"The actual Title is not same as expected");
		System.out.println("The Expected page is same as actual page :- " +actualTitle);
	
	}
	
	
	@Test(priority = 2,enabled = true)
	public void validating_Become_A_Seller_Login_Button()
	{
		
		// Creating object for become_a_seller class
		become_a_seller = new Become_A_Seller(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		become_a_seller.clickingBecomeSellerLink().click();
		become_a_seller.clickingBecomeASellerLoginButton().click();
		boolean isdisplayed = become_a_seller.isdisplayed();
		
		// Implementing Assertion
		assertTrue(isdisplayed,"The Login button is not displayed on the webpage");
		System.out.println("The Login button is present on the web page.");
		
		


	}
	

}
