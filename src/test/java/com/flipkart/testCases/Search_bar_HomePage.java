package com.flipkart.testCases;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.LoginAlertDialogBox;
import com.flipkart.Pages.Search_Bar;

public class Search_bar_HomePage extends BasePage{
	
	
	Search_Bar searchbar;
	LoginAlertDialogBox LoginDialogBox;
	
	@Test
	public void Test_Search() throws InterruptedException
	{
		searchbar = new Search_Bar(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		searchbar.SearchBar().sendKeys("iphone");
		searchbar.SearchBarBtn().click();
	    boolean isIphoneMobileDisplayed = searchbar.IphoneMobile().isDisplayed();
	    
	    
	    // Implementing Assertion
	    assertTrue(isIphoneMobileDisplayed, "The Iphone mobile is not displayed int the browser");
	    System.out.println("The Iphone mobile is avaiable on the page");
		
	}
	
	@Test
	public void Validating_MobileSearch() throws InterruptedException
	{
		searchbar = new Search_Bar(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		searchbar.SearchBar().sendKeys("one plus");
		searchbar.SearchBarBtn().click();
		Thread.sleep(4000);
		boolean isOnePlusMobileDisplayed = searchbar.oneplusMobile().isDisplayed();
		
	    // Implementing Assertion
	    assertTrue(isOnePlusMobileDisplayed, "The onePlus mobile is not displayed in the browser");
	    System.out.println("The OnePlus mobile is avaiable on the page");
		
		
		
	}

}
