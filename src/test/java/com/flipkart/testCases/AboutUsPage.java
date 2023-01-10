package com.flipkart.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.AboutUs;
import com.flipkart.Pages.LoginAlertDialogBox;
import com.relevantcodes.extentreports.LogStatus;


public class AboutUsPage extends BasePage{
	
	// Creating Object for AboutUs Class
	AboutUs Aboutus;
	LoginAlertDialogBox LoginDialogBox;
	
	
	@SuppressWarnings("deprecation")
	@Test(priority = 1 , enabled = true)
	public void ValidateContactUs()
	{
		Aboutus = new AboutUs(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		test.log(LogStatus.INFO,"Closing Login Alert Dialog Box");
		Aboutus.ClickingContactusLink().click();
		
        // Waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		Aboutus.ClickingCancelAndReturnOption().click();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = ActualTitle;
		
		// Implementing Assertion
		
		assertEquals(ActualTitle, ExpectedTitle,"The Actual Title of page is not same as expected");
		System.out.println("The title of the page is same as expected");
		test.log(LogStatus.INFO,"Asserting WebPage Title with Expected title");
		
	}
	
	
	@Test(priority = 2 , enabled = true)
	public void ValidateAboutUs()
	{
		Aboutus = new AboutUs(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		test.log(LogStatus.INFO,"Closing Login Alert Dialog Box");
		Aboutus.ClickingAboutUsLink().click();
		
		boolean isDisplayedAboutUsImage = Aboutus.AboutUsImage().isDisplayed();
		
		// Implementing Assertion
		assertTrue(isDisplayedAboutUsImage,"The About us image is not displayed on the web Page");
		System.out.println("The Image is Available on the web Page");	
		test.log(LogStatus.INFO,"Asserting with AboutUsImage is displayed in the screen or not");
		
	}
	
	

	@SuppressWarnings("deprecation")
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 3 , enabled = true)
	public void ValidateCarrers(String email,String password, String ExpectedTitle)
	{
		Aboutus = new AboutUs(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		test.log(LogStatus.INFO,"Closing Login Alert Dialog Box");
		Aboutus.ClickingCarrerLink().click();
		
		// Waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Aboutus.ClickingCandidateLoginButton().click();
		Aboutus.EnterEmail().sendKeys(email);
		Aboutus.EnterPassword().sendKeys(password);
		Aboutus.ClickingLoginButton();
		String ActuaTitle = driver.getTitle();
		
		
		// Implementing Assertion
		assertEquals(ActuaTitle,ExpectedTitle,"The Actual title is not same as expected");
		System.out.println("The Title of the page is same as expected");
		test.log(LogStatus.INFO,"Asserting with Actual webpage title with expected title of the webpage");
			
		
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 4 , enabled = true)
	public void ValidateFlipkartStories(String ExpectedTitle)
	{
		Aboutus = new AboutUs(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		test.log(LogStatus.INFO,"Closing Login Alert Dialog Box");
		Aboutus.ClickingFlipkartStoriesLink().click();
		
		// Performing Action on the menu item to hover and click the Sub item
		Actions action = new Actions(driver);
		action.moveToElement(Aboutus.FlikartStoriesNewsroomLink()).perform();
		
		// Waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Aboutus.ClickingNewsroomSubLinkCovid();
		
		String ActualTitle = driver.getTitle();
		
		assertEquals(ActualTitle, ExpectedTitle,"The title of the page is not same as expected");
		System.out.println("The title of the page is same as expected");	
		test.log(LogStatus.INFO,"Asserting The given page with the expected title of the webpage");
       
	}
	
	
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 5 , enabled = true)
	public void ValidateCorporateInformation(String ExpectedTitle)
	{
		Aboutus = new AboutUs(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		test.log(LogStatus.INFO,"Closing Login Alert Dialog Box");
		Aboutus.ClickingCorporateInformationLink().click();
		
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		// Implementing Assertion
		assertEquals(ActualTitle, ExpectedTitle,"The Title of the page is not same as expected");
		System.out.println("The title of the page is same as expected");
		test.log(LogStatus.INFO,"Asserting with actual title webpage with expected title of the webpage");
		
	}
	
}
