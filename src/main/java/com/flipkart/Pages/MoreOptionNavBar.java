package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoreOptionNavBar {
	
	
    WebDriver driver;
	
	// Constructor
	public MoreOptionNavBar(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	// Identifying Web Elements
	
	@FindBy(xpath= "//*[@class='exehdJ']")
	WebElement Morebtn;
	
	@FindBy(xpath = "//div[contains(text(),'Notification Preferences')]")
	WebElement NotificationPreferences;
	
	@FindBy(xpath = "//div[contains(text(),'24x7 Customer Care')]")
	WebElement customercare;
	
	@FindBy(xpath = "//div[contains(text(),'Advertise')]")
	WebElement advertise;
	
	
	
	
	public void clickingMorebtn()
	{
		Morebtn.click();
	}
	
	
	public void clickingNotificationOption()
	{
		NotificationPreferences.click();
	}
	
	public void clickingCustomerCareOption()
	{
		customercare.click();
	}
	
	public void clickingAdertiseOption()
	{
		advertise.click();
	}

}
