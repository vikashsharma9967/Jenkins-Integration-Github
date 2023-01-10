package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grocery {
	
	WebDriver driver;
	
	// Constructor
		
	public Grocery(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	// Identifying Web Elements
	
	@FindBy(xpath="//div[contains(text(),'Grocery')]")
	WebElement GroceryIcon;
	
	@FindBy(xpath = "//*[@class='_166SQN']")
	WebElement EnterPinCode;
	
	@FindBy(xpath = "//*[@class='_3704LK'][@name='q']")
	WebElement GrocerySearchBar;
	
	@FindBy(xpath = "//*[@class='_396cs4'][@alt='BRITANNIA Pure Magic Chocolush Biscuits Cream Filled']")
	WebElement BritanicaPureMagicChocolushBiscuits;
	
	
	
	public WebElement ClickingGroceryIcon()
	{
		return GroceryIcon;
	}
	
	
	public WebElement EnterPincode()
	{
		return EnterPinCode;
	}
	
	
	public WebElement BritanicaPureMagicChocolushBiscuit()
	{
		return BritanicaPureMagicChocolushBiscuits;
	}
	
	
	public WebElement EnterProductName()
	{
		return GrocerySearchBar;
	}
	
	
	

	

}
