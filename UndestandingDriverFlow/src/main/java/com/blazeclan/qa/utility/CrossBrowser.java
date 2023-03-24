package com.blazeclan.qa.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.blazeclan.qa.base.CommonFunctions;
import com.blazeclan.qa.logging.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser extends CommonFunctions {

	
	//public static WebDriver selectDriver(String browser) {

//		if (browser.equalsIgnoreCase("Chrome")) {
//			ChromeOptions options = new ChromeOptions();       
//			options.addArguments("--disable-notifications");       
//			options.addArguments("--remote-allow-origins=*"); 
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		} else if (browser.equalsIgnoreCase("Firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		} else {
//
//		}
//
//		Log.info("chrome browser selected");
//
//		DriverManager.setDriver(driver);
//		return DriverManager.getDriver();
		
//		switch(browser){
//		
//		case"chrome":
//		ChromeOptions options=  new ChromeOptions();
//		options.addArguments("--start-maximized");
//		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-extensions");
//		options.addArguments("--disable-gpu-");
//		
//		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
//		
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
//		options.addArguments("no-sandbox");
//		
//		
//		WebDriverManager.chromedriver().setup();
//      driver = new ChromeDriver(); 
//      
//	driver= WebDriverManager.chromedriver().capabilities(options).create();
		
		
		
      
       
			
//		Log.info("chrome browser selected");
//		break;
//	default:
//		System.out.println("Please provide browser name");
//	//System.setProperty("webdriver.chrome.driver", "D://Latestchromedriverexe//chromedriver.exe");
//		//System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
//		
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//	}
		
		
		
		
//		switch (browser)
//		{    
//		case "chrome": //chrome driver     
//		ChromeOptions options = new ChromeOptions();       
//			options.addArguments("--disable-notifications");       
//			options.addArguments("--remote-allow-origins=*");        
//			Log.info("chrome browser is selected");       
//			driver= (WebDriverManager.chromedriver().capabilities(options).create());      
//			break;    
//			case "firefox"://firefox driver       
//				Log.info("firefox browser is selected");       
//				driver=(WebDriverManager.firefoxdriver().create());        
//				break;   
//				case "edge"://edge driver      
//					Log.info("edge browser is selected");       
//					driver=(WebDriverManager.edgedriver().create());       
//					break;   
//					default: Log.info("Please provide browser name");
//		}
//	
//		DriverManager.setDriver(driver);
//		return DriverManager.getDriver();
//	}
//		
//		
//		DriverManager.setDriver(driver);
//		return DriverManager.getDriver();
		

	
	
	
	//}	
	
	
	 public static WebDriver selectDriver( String browser) {
	        switch (browser) {
	            case "chrome": //chrome driver
	                ChromeOptions options = new ChromeOptions();
	                options.addArguments("--no-sandbox");
	                options.addArguments("--disable-dev-shm-usage");
	                options.addArguments("--disable-notifications");
	                options.addArguments("--remote-allow-origins=*");
	               // Log.info("chrome browser is selected");

	                driver=(WebDriverManager.chromedriver().capabilities(options).create());
	                Log.info("chrome browser is selected");
	                break;
	            case "firefox"://firefox driver
	                Log.info("firefox browser is selected");
	                driver=(WebDriverManager.firefoxdriver().create());
	                break;
	            case "edge"://edge driver
	                Log.info("edge browser is selected");
	                driver=(WebDriverManager.edgedriver().create());
	                break;
	            default: Log.info("Please provide browser name");
	        }

//	        switch (browser) {
//	            case "chrome" : //chrome driver
//	                System.setProperty("webdriver.http.factory", "jdk-http-client");
//	                ChromeOptions options = new ChromeOptions();
//	                options.addArguments("--disable-notifications");
//	                options.addArguments("--remote-allow-origins=*");
	//
////	                options.addArguments("--no-sandbox");
////	                options.addArguments("--disable-dev-shm-usage");
	////
//////	                 Options to trick bot detection
//////	                 Removing webdriver property
////	                options.addArguments("--disable-blink-features=AutomationControlled");
////	                options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
////	                options.setExperimentalOption("useAutomationExtension", null);
	////
//////	                 Changing the user agent / browser fingerprint
////	                options.addArguments("window-size=1920,1080");
////	                options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
	//
//	                // Other
////	                options.addArguments("disable-infobars");
////	                options.addArguments("headless");
//	                setDriver(WebDriverManager.chromedriver().capabilities(options).create());
	//
//	                Log.info("chrome browser is selected");
//	            break;
//	            case "firefox" : //firefox driver
//	                setDriver(WebDriverManager.firefoxdriver().create());
//	                Log.info("firefox browser is selected");
//	            break;
//	            case "edge": //edge driver
//	                setDriver(WebDriverManager.edgedriver().create());
//	                Log.info("edge browser is selected");
//	            break;
//	            default : Log.info("Please provide browser name");
//	        }

	        DriverManager.setDriver(driver);

	        return DriverManager.getDriver();
	    }
		

}
	

	

	

