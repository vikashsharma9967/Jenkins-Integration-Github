package com.flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Carousel_homepage {
		
	WebDriver driver;
	
	// Constructor
	public Carousel_homepage(WebDriver driver) 
	{	
		this.driver = driver;
		
		// This method will create web Elements
		PageFactory.initElements(driver, this);
	}
	
	
	// Identifying Web Elements
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[2]")
	WebElement Left_Carousel_Button;
	
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[3]")
	WebElement Right_Carousel_Button;
	
	
	// Creating method of operation to be performed on the Web Elements
	
	public WebElement ClickingLeftCarouselButton()
	{
		return Left_Carousel_Button;
	}
	
	
	public WebElement ClickingRightCarouselButton()
	{
		return Right_Carousel_Button;
		
	}
}
