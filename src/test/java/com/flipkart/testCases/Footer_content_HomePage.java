package com.flipkart.testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.Footer;
import com.flipkart.Pages.LoginAlertDialogBox;

public class Footer_content_HomePage extends BasePage {
	
	Footer footer;
	LoginAlertDialogBox LoginDialogBox;
	
	
	
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 1,enabled = true)
	public void Validating_Advertise_link(String ExpectedTitle)
	{
		// Creating object for the class
		
		footer = new Footer(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		footer.ClickingAdvertise();
		String ActualTitle = footer.ClickingFlipkartAdvertising();		
		
		
		// Asserting Page with actual and expected title of the page
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("The Title of the Advertising link is :- " + ActualTitle);
		System.out.println("------------------------------------------------------------------------------------------------");
		
	}
	
	

}
