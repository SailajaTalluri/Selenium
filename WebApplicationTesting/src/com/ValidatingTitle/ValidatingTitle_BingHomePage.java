package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_BingHomePage {

	public static void main(String[] args) {
//Automating ChromeBrowser//
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	//Navigating to an Application URL Address//
    driver.navigate().to("http://bing.com");
    
    String applicationUrlAddress="http://bing.com";
    driver.get(applicationUrlAddress);
    
    String Expected_BingHomePageTitle = "bing";
    System.out.println("The Expected title of the BingHomePage is :- +Expected_bingHomePage Title");
    driver.getTitle();
    
    String Actual_BingHomePageTitle = "Bing";
    System.out.println("The Actual title of the BingHomePage is :- +Actual_BingHomePage Title");
    driver.getTitle();
    
    if
    (Actual_BingHomePageTitle.equals(Expected_BingHomePageTitle))
    {
    	System.out.println("Title of the BingHomePage is Matched = Pass");
    	
    }
    else
    {
    	System.out.println("Title of the BingHomePage is Not Matched = Fail");
    	
    	//driver.close();
    	//driver.quit();
    	
    }
	}
	}
    
    
    

class BingHomePage1 {

	public static void main(String[] args) {
//Automating ChromeBrowser//
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	//Navigating to an Application URL Address//
    driver.navigate().to("http://bing.com");
    
    String applicationUrlAddress="http://Bing.com";
    driver.get(applicationUrlAddress);
    
    String Expected_BingHomePageTitle = "bing";
    System.out.println("The Expected title of the BingHomePage is :- +Expected_bingHomePage Title");
    driver.getTitle();
    
    String Actual_BingHomePageTitle = "bing";
    System.out.println("The Actual title of the BingHomePage is :- +Actual_bingHomePage Title");
    driver.getTitle();
    
    if
    (Actual_BingHomePageTitle.equals(Expected_BingHomePageTitle))
    {
    	System.out.println("Title of the BingHomePage is Matched = Pass");
    	
    }
    else
    {
    	System.out.println("Title of the BingHomePage is Not Matched = Fail");
    	
    	//driver.close();
    	//driver.quit();
    	
    }
	}
	}
    
    
	
	
	
	