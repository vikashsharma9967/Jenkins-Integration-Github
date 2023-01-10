package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppliancesItem {
	
	
	WebDriver driver;
	
	// Constructor
	public AppliancesItem(WebDriver driver) 
	{
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//img[@class='_396cs4'][@alt='Appliances']")
	WebElement Aplliances;
	
	@FindBy(xpath = "//img[@class='kJjFO0 _3DIhEh'][@alt='dd']")
	WebElement AppliancesItemTelevision;
	
	@FindBy(xpath = "//*[@name='q']")
	WebElement SearchBar;
	
	@FindBy(xpath = "//div[contains(text(),'Mi 5A 80 cm (32 inch) HD Ready LED Smart Android T')]")
	WebElement MiTv;
	
	@FindBy(xpath = "//*[@class='kJjFO0 _3DIhEh'][@alt='AC-Large-Mall-Mode-Nav-1']")
	WebElement AppliancesItemAirConditioner;
	
	@FindBy(xpath = "//*[@class='_396cs4'][@loading='eager'][@alt='LG Super Convertible 6-in-1 Cooling 1.5 Ton 5 Star Split Dual Inverter AI, 4 Way Swing, HD Filter with...']")
	WebElement LgAirConditioner;
	
	
	
	public WebElement ClickingAppliancesLink()
	{
		return Aplliances;
	}
	
	public WebElement ProductSearchbar()
	{
		return SearchBar;
	}
	
	
	public WebElement ClickingAppliancesItemTelevision()
	{
		return AppliancesItemTelevision;
	}
	
	
	public WebElement ClickingAppliancesItemAirConditioner()
	{
		return AppliancesItemAirConditioner;
	}
	
	public WebElement FindingLgAirConditioner()
	{
		return LgAirConditioner;
	}
	
	
	public WebElement MiTelevision()
	{
		return MiTv;
	}

}
