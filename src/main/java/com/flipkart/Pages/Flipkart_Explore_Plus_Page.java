package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Explore_Plus_Page {
	
	
	WebDriver driver;
	
	// Constructor
		
	public Flipkart_Explore_Plus_Page(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
	WebElement FlipkartExplorePlus;
	
	@FindBy(xpath = "//a[contains(text(),'Flights')]")
	WebElement Flight;
	
	@FindBy(xpath = "//a[contains(text(),'Offer Zone')]")
	WebElement OfferZone;
	
	
	
	// Creating method of operation to be performed on the Web Elements
	
	public void clickingFlipkartExplorePlus()
	{
		FlipkartExplorePlus.click();
	}
	
	
	public void ClickingFlight()
	{
		Flight.click();	
	}
	
	public void ClickingOfferZone()
	{
		OfferZone.click();
	}

}
