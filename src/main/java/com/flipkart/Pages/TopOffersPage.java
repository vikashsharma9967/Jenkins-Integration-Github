package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopOffersPage {
	
	
    WebDriver driver;
	
	// Constructor
	public TopOffersPage(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//*[@class='_396cs4'][@alt='Top Offers']")
	WebElement TopOffersLink;
	
	@FindBy(xpath = "//div[contains(text(),'Home Furnishing Range')]")
	WebElement HomeFurnishingRangeLink;
	
	
	public WebElement ClickingTopOffersLink()
	{
		return TopOffersLink;
	}
	
	
	public WebElement ClickingHomeFurnishingRangeLink()
	{
		return HomeFurnishingRangeLink;
	}

}
