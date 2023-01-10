package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class Travel {
	
    WebDriver driver;
	
	// Constructor
	public Travel(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	// Identifying Web Elements
	
	
	@FindBy(xpath= "//*[@class='_396cs4'][@alt='Travel']")
	WebElement TravelIconOption;
	
	
	@FindBy(xpath = "//*[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2vegSu _2mFmU7']")
	WebElement FromAirportNameSearchBar;
	
	@FindBy(xpath = "//*[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2dqBfU _2mFmU7']")
	WebElement DestinationAirportNameSearchBar;
	
	@FindBy(xpath = "//span[contains(text(),'SEARCH')]")
	WebElement SearchBtn;
	
	
	public WebElement ClickingTravelIconOption()
	{
		return TravelIconOption;
	}
	
	public WebElement EnterFromAirportNameSearchBar()
	{
		return FromAirportNameSearchBar;
	}
	
	
	public WebElement EnterDestinationAirportNameSearchBar()
	{
		return DestinationAirportNameSearchBar;
	}
	
	
	public WebElement ClickingSearchBtn()
	{
		return SearchBtn;
	}

}
