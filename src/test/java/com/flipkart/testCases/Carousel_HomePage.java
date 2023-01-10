package com.flipkart.testCases;

import org.testng.annotations.Test;
import com.flipkart.BasePage.BasePage;
import com.flipkart.Pages.Carousel_homepage;
import com.flipkart.Pages.LoginAlertDialogBox;

public class Carousel_HomePage extends BasePage{
	
	
	Carousel_homepage carousel;
	LoginAlertDialogBox LoginDialogBox;
	
	@Test
	public void Validating_Carousel_Button_HomePage()
	{
		// Creating object for Carousel class
		carousel = new Carousel_homepage(driver);
		LoginDialogBox = new LoginAlertDialogBox(driver);
		
		LoginDialogBox.clickingLoginAlertDialogBox().click();
		carousel.ClickingLeftCarouselButton().click();
		carousel.ClickingRightCarouselButton().click();
		
		System.out.println("Left and Right Carousel Button are working Smoothly");
		
	}
	
	
	
	

}
