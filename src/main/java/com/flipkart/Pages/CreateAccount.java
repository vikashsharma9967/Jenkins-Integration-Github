package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
	
	
	WebDriver driver;
	
	// Constructor
	public CreateAccount(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//a[contains(text(),'New to Flipkart? Create an account')]")
	WebElement createAccount;
	
	@FindBy(xpath ="//a[contains(text(),'Login')]")
	WebElement LoginBtn;
	
	
	@FindBy(xpath = "//*[@class='_2IX_2- VJZDxU']")
	WebElement enterMobileNumber;
	
	@FindBy(xpath = "//span[contains(text(),'CONTINUE')]")
	WebElement continueBtn;
	
	
	public void clickingCreateAccount()
	{
		createAccount.click();
	}
	
	public void EnterMobileNumber(String number)
	{
		enterMobileNumber.sendKeys(number);
	}
	
	public void clickingContinueBtn()
	{
		continueBtn.click();
	}
	
	public void clickingLogingBtn()
	{
		LoginBtn.click();
	}

}
