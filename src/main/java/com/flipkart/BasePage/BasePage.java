package com.flipkart.BasePage;

import java.lang.reflect.Method;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.flipkart.Utilities.ReadingPropertiesFile;
import com.flipkart.Utilities.ScreenShots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.flipkart.Utilities.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static String browser = "chrome";
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static Logger logger = LogManager.getLogger(BasePage.class);

	
	// This method will run before every Test scenario
	
	@BeforeMethod
	public void setup(Method method) throws Exception
	{
		
		String browser = ReadingPropertiesFile.getProperty("browser");
		
		if(browser.equalsIgnoreCase("Firefox"))
		{
			 logger.info("Opening Firefox browser.");
			WebDriverManager.firefoxdriver().setup();
			
			// Setting  options to false so it will run without headless mode
			// If we make it true then it will run the test code in headless mode
			
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(false);
			
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("Chrome")){
			
			 logger.info("Opening chrome browser.");
			WebDriverManager.chromedriver().setup();
			
			// Setting  options to false so it will run without headless mode
			// If we make it true then it will run the test code in headless mode
			
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(false);

			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
		}
		
		
		else if(browser.equalsIgnoreCase("Edge"))
		{
			logger.info("Opening Edge browser.");
			WebDriverManager.edgedriver().setup();
			
			// Setting  options to false so it will run without headless mode
			// If we make it true then it will run the test code in headless mode
			
			EdgeOptions options = new EdgeOptions();
			options.setHeadless(false);
			
		}
		
		extent = ExtentManager.getInstance("reports//Extent_demo.html");
		
		logger.info("Geting url to open");
		driver.get(ReadingPropertiesFile.getProperty("url"));
		
		logger.info("Getting Test method name Test scenario");
		test = extent.startTest(method.getName());
		
	
	}
	
	
	
	// This method will run After every Test Scenario
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
			if(result.getStatus()==ITestResult.SUCCESS)
				test.log(LogStatus.PASS, "Test case got passed");
			else if(result.getStatus()==ITestResult.FAILURE)
			{
				//Taking ScreenShots whenever TestCase got failed
				logger.info("Taking screen shot of failed test cases");
				ScreenShots.takeScreenShot(driver, result.getName());
				test.log(LogStatus.FAIL, "Test case got failed");
			}
			
			extent.flush();
			logger.info("Closing the Driver");
			driver.quit();
			

	}
	
	
}
