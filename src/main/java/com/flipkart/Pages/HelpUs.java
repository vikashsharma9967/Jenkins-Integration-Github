package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpUs {
	
	WebDriver driver;
	
	// Constructor
		
	public HelpUs(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//a[contains(text(),'Payments')]")
	WebElement Payment;
	
	
	@FindBy(xpath = "//a[contains(text(),'Shipping')]")
	WebElement Shipping;
	
	@FindBy(xpath = "//a[contains(text(),'FAQ')]")
	WebElement FAQ;
	
	
	public WebElement ClickingPayment()
	{
		return Payment;
	}
	
	
	public WebElement ClickingShipping()
	{
		return Shipping;
	}
	
	
	public WebElement ClickingFAQ()
	{
		return FAQ;
	}
	
	
}
