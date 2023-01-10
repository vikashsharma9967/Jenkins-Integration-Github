package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Icon_Page {
	
	WebDriver driver;
	
	// Constructor
	public Cart_Icon_Page(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//span[contains(text(),'Cart')]")
	WebElement cart_Icon;
	
	
	// Creating method of operation to be performed on the Web Elements
	
	public void ClickingCartIcon()
	{
		cart_Icon.click();
	}
	
	public String ActualTitle()
	{
		return driver.getTitle();
	}
}
