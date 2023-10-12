package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestingBrowsers {
	
public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	
	         ChromeDriver chromedriver = new ChromeDriver(); 	
			    
			 chromedriver.navigate().to ("http://www.facebook.com");
			 chromedriver.navigate().to("http://www.Livetech.in");
				
				
				// Automating FireFox Browser
			//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\SAILAJA\\Desktop\\sailaja_29_8_23\\WebApplication\\BrowserDriversFiles\\chromedriver.exe");
			//	FirefoxDriver fireFoxDriver = new FirefoxDriver();
				
				// Automating Edge Browser
			//	System.setProperty("webdriver.edge.driver", "C:\\Users\\SAILAJA\\Desktop\\sailaja_29_8_23\\WebApplication\\BrowserDriversFiles\\chromedriver.exe");
			//	EdgeDriver edgeDriver = new EdgeDriver();
				
		     // Navigated to an application Url Address on the Current Browser
	
	}
	

	
	}



class TestingBrowsers1 {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	
	ChromeDriver chromeDriver = new ChromeDriver();
	
	chromeDriver.navigate().to("http://www.amazon.com");
	
	chromeDriver.navigate().to("http://www.orangehrm.com");
	
	}
	
	
}
		

