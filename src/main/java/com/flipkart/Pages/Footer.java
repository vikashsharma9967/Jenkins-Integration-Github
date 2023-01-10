package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	
	
	WebDriver driver;
	
	// Constructor
		
	public Footer(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//span[contains(text(),'Advertise')]")
	WebElement Advertise;
	
	@FindBy(xpath = "//a[@id='']")
	WebElement FlipkartAdvertising;
	
	
	public void ClickingAdvertise()
	{
		Advertise.click();
	}
	
	public String ClickingFlipkartAdvertising()
	{
		FlipkartAdvertising.click();
		
		return driver.getTitle();
		
	}

}
