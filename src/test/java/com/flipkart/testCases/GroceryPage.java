package com.flipkart.testCases;

import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.LoginAlertDialogBox;
import com.flipkart.Pages.Grocery;

public class GroceryPage extends BasePage{
	
	Grocery grocery;
	LoginAlertDialogBox LoginDialogBox;
	
	
	@SuppressWarnings("deprecation")
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 1, enabled = true)
	public void Grocery(String Pincode,String ProductName)
	{
		grocery = new Grocery(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		grocery.ClickingGroceryIcon().click();
		
		// Waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		grocery.EnterPincode().sendKeys(Pincode+Keys.ENTER);
		grocery.EnterProductName().sendKeys(ProductName+Keys.ENTER);
		
		// Getting Boolean value for the product is availabe or not
		boolean isDisplayedBritanicaPureMagicChocolushBiscuit = grocery.BritanicaPureMagicChocolushBiscuit().isDisplayed();
		
		// Implementing Assertion
		assertTrue(isDisplayedBritanicaPureMagicChocolushBiscuit,"The Madhuban Premium raisin is not available on the website");
		System.out.println("The product is available that are you searching for");

		
	}

}
