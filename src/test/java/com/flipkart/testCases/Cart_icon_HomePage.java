package com.flipkart.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.Cart_Icon_Page;
import com.flipkart.Pages.LoginAlertDialogBox;

public class Cart_icon_HomePage extends BasePage{
	
	Cart_Icon_Page CartIcon;
	LoginAlertDialogBox LoginDialogBox;
	
	
	
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 1,enabled = true)
	public void Validating_Cart_Icon(String ExpectedTitle)
	{
		CartIcon = new Cart_Icon_Page(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		CartIcon.ClickingCartIcon();
		String ActualTitle = CartIcon.ActualTitle();
		
		// Asserting Cart Page title with actual and expected title of the webpage.
		
		assertEquals(ActualTitle, ExpectedTitle,"The Cart page Title is not same as expected");
		System.out.println("------------------------------------------------------");
		System.out.println("The cart page title is same as expected" + ActualTitle);
		System.out.println("------------------------------------------------------");
		
		
	}

}
