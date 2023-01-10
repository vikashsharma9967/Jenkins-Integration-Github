package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Become_A_Seller {
	
	WebDriver driver;
	
	// Constructor
	public Become_A_Seller(WebDriver driver) 
	{
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//button[contains(text(),'✕')]")
	public WebElement HomePage_login_close_btn;
	
	@FindBy(xpath ="//span[text()='Become a Seller']")
	public WebElement become_a_seller;
	
	@FindBy(xpath = "//*[@name='registrationNumber']")
	public WebElement User_mobile_number;
	
	@FindBy(xpath = "//span[text()='Start Selling']")
	public WebElement start_selling_btn;
	
	@FindBy(xpath = "//span[text()='Login']")
	public WebElement Become_a_seller_Login_Btn;
	
	
	
	// Creating method of operation to be performed on the Web Elements
	
	public WebElement clickingDialogBoxCloseButton()
	{
		return HomePage_login_close_btn;
	}
	
	public WebElement clickingBecomeSellerLink()
	{
		return become_a_seller;
	}
	
	public WebElement EnterMobileNumber()
	{
		return User_mobile_number;
		
	}
	
	public WebElement ClickingStartSellingButton()
	{
		return start_selling_btn;
	}
	
	
	public String ActualTitle()
	{
		return driver.getTitle();
	}
	
	public WebElement clickingBecomeASellerLoginButton()
	{
		return Become_a_seller_Login_Btn;
	}
	
	public boolean isdisplayed()
	{
		boolean flag = Become_a_seller_Login_Btn.isDisplayed();
		return flag;
	}
	


}
