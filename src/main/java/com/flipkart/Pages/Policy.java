package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Policy {
	
    WebDriver driver;
	
	// Constructor
	public Policy(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//a[contains(text(),'Return Policy')]")
	WebElement ReturnPolicy;
	
	@FindBy(xpath = "//a[contains(text(),'Security')]")
	WebElement Security;
	
	@FindBy(xpath = "//a[contains(text(),'Privacy')]")
	WebElement Privacy;
	
	
	public WebElement ClickingReturnPolicyLink()
	{
		return ReturnPolicy;
	}
	
	public WebElement ClickingSecurityLink()
	{
		return ReturnPolicy;
	}
	
	public WebElement ClickingPrivacyLink()
	{
		return ReturnPolicy;
	}
	

}
