package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
	
	WebDriver driver;
	
	// Constructor
	public AboutUs(WebDriver driver) 
	{
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	WebElement contactus;
	
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	WebElement About_Us;
	
	@FindBy(xpath = "//a[contains(text(),'Careers')]")
	WebElement Carrer;
	
	@FindBy(xpath = "//a[@id='candidate-login-before']")
	WebElement CandidateLoginBtn;
	
	@FindBy(xpath = "//*[@name='username']")
	WebElement EnterEmail;
	
	@FindBy(xpath = "//*[@name='password']")
	WebElement EnterPassword;
	
	@FindBy(xpath = "//button[@id='loginbtn']")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Flipkart Stories')]")
	WebElement FlipkartStories;
	
	@FindBy(xpath = "//*[@class='menu-link']")
	WebElement FlikartStoriesNewsroomLink;
	
	@FindBy(xpath = "//*[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-67934']")
    WebElement NewsroomSubLinkCovid;
	
	@FindBy(xpath = "//a[contains(text(),'Corporate Information')]")
	WebElement CorporateInformation;
	
	@FindBy(xpath = "//span[text()='Flipkart Plus']")
	WebElement CancelAndReturn;
	
	@FindBy(xpath = "//p[contains(text(),'If I cancel or return an item from my order, will ')]")
	WebElement CancelAndReturnChooseTopic;
	
	@FindBy(xpath = "//img[contains(@src,'//static-assets-web.flixcart.com/www/promos/new/20161017-190224-20150824-132608-the-journey3.png')]")
	WebElement AboutUsImg;
	
	
	
	public WebElement ClickingContactusLink()
	{
		return contactus;
	}
	
	
	public WebElement ClickingAboutUsLink()
	{
		return About_Us;
	}
	
	
	public WebElement ClickingCarrerLink()
	{
		return Carrer;
	}
	
	public WebElement ClickingCandidateLoginButton()
	{
		return CandidateLoginBtn;
	}
	
	
	public WebElement EnterEmail()
	{
		return EnterEmail;
	}
	
	public WebElement EnterPassword()
	{
		return EnterPassword;
	}
	
	public WebElement ClickingLoginButton()
	{
		return LoginBtn;
	}
	
	public WebElement ClickingFlipkartStoriesLink()
	{
		return FlipkartStories;
	}
	
	
	public WebElement ClickingNewsroomSubLinkCovid()
	{
		return NewsroomSubLinkCovid;
	}
	
	
	public WebElement FlikartStoriesNewsroomLink()
	{
		return FlikartStoriesNewsroomLink;
	}
	
	
	
	public WebElement ClickingCorporateInformationLink()
	{
		return CorporateInformation;
	}
	
	
	public WebElement ClickingCancelAndReturnOption()
	{
		return CancelAndReturn;
	}
	
	public WebElement ClickingCancelAndReturnChooseTopic()
	{
		return CancelAndReturnChooseTopic;
	}
	
	
	public WebElement AboutUsImage()
	{
		return AboutUsImg;
	}
	
	
	
	
	
	
	

}
