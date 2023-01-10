package com.flipkart.testCases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.AppliancesItem;
import com.flipkart.Pages.LoginAlertDialogBox;

public class AppliancesItems extends BasePage{
	
	AppliancesItem Appliances;
	LoginAlertDialogBox LoginDialogBox;
	
	
	@SuppressWarnings("deprecation")
	@Test(dataProviderClass=com.ExcelRead.Utils.ReadXLSData.class,dataProvider = "byData",priority = 1,enabled = true)
	public void TestAppliancesItemsTelevision(String ProductName) 
	{
		Appliances = new AppliancesItem(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		Appliances.ClickingAppliancesLink().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Appliances.ClickingAppliancesItemTelevision().click();
		Appliances.ProductSearchbar().sendKeys(ProductName + Keys.ENTER);
		
		// Waits
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		// Checking the webelement is present or not
		boolean isDisplayedMiTelevision = Appliances.MiTelevision().isDisplayed();
		
		// Implementing Assertion
		assertTrue(isDisplayedMiTelevision, "The Mi Tv you are searching is not availabe on the webpage");
		System.out.println("The Television you are searching is availabe on the webpage");
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test(priority = 2,enabled = true)
	public void TestAppliancesItemsAirconditioner()
	{
		Appliances = new AppliancesItem(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		Appliances.ClickingAppliancesLink().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Appliances.ClickingAppliancesItemAirConditioner().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Checking the webelement is present or not
		boolean isDisplayedAirConditioner = Appliances.FindingLgAirConditioner().isDisplayed();
		
		// Implementing Assertion
		assertTrue(isDisplayedAirConditioner, "The Air Condition you are searching is not availabe on the webpage");
		System.out.println("The Air Condition you are searching is availabe on the webpage");
		
		
	}
	
	


}
