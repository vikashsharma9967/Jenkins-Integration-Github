package com.flipkart.testCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.Flipkart_Explore_Plus_Page;
import com.flipkart.Pages.LoginAlertDialogBox;

public class Flipkart_Explore_Plus extends BasePage{
	
	Flipkart_Explore_Plus_Page flipkartExplorePlus;
	LoginAlertDialogBox LoginDialogBox;
	
	
	@Test(priority=1,enabled = true)
	public void Validating_Flight() throws Exception
	{
		// Creating object for the class
		
		flipkartExplorePlus = new Flipkart_Explore_Plus_Page(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
        flipkartExplorePlus.clickingFlipkartExplorePlus();
        
        // Waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		flipkartExplorePlus.ClickingFlight();	
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as expected");
		
	}
	
	

	@Test(priority = 2,enabled = true)
	public void Validating_OfferZone()
	{
		// Creating object for the class
		
		flipkartExplorePlus = new Flipkart_Explore_Plus_Page(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
        flipkartExplorePlus.clickingFlipkartExplorePlus();
        
        // Waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        flipkartExplorePlus.ClickingOfferZone();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as expected");
        
	}

}
