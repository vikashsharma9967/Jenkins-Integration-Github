package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	// Constructor
	public LoginPage(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	// Identifying Web Elements
	
	@FindBy(xpath ="//a[contains(text(),'Login')]")
	WebElement LoginBtn;
	
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	WebElement EnterEmail;
	
	@FindBy (xpath = "//button[contains(text(),'Request OTP')]")
	WebElement RequestOtp;
	
	
	
	public void ClickingLoginBtn()
	{
		LoginBtn.click();
	}
	
	public void EnteringEmail(String email)
	{
		EnterEmail.sendKeys(email);
	}
	
	public void ClickingRequestOtpButton()
	{
		RequestOtp.click();
	}

}
