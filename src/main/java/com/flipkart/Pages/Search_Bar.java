package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Bar {
	
	
    WebDriver driver;
	
	// Constructor
	public Search_Bar(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
	WebElement search_bar;
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
	WebElement searchbarBtn;
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement IphoneMobileImage;
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement onePlusMobileImage;
	
	public WebElement SearchBar()
	{
		return search_bar;
	}
	
	public WebElement SearchBarBtn()
	{
		return searchbarBtn;
	}
	
	public WebElement IphoneMobile()
	{
		return IphoneMobileImage;
	}
	
	public WebElement oneplusMobile()
	{
		return onePlusMobileImage;
	}
}
