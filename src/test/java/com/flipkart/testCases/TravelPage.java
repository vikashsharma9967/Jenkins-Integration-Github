package com.flipkart.testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.LoginAlertDialogBox;
import com.flipkart.Pages.Travel;

public class TravelPage extends BasePage{
	
	Travel travel;
	LoginAlertDialogBox LoginDialogBox;
	
	
	@Test(priority = 1, enabled = true)
	public void ValidateTravelPage() throws Exception
	{
	
		travel = new Travel(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		travel.ClickingTravelIconOption().click();
		travel.EnterFromAirportNameSearchBar().sendKeys("Mumbai, BOM - Chatrapati Shivaji Airport, India");
		travel.EnterDestinationAirportNameSearchBar().sendKeys("Hyderabad, HYD - Rajiv Gandhi International, India");
		travel.ClickingSearchBtn().click();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "";
		
		// Implementing Assertion
		assertEquals(ActualTitle,ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as Expected");
		

	}

}
