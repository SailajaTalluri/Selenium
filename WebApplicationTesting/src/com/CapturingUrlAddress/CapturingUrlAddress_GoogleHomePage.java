package com.CapturingUrlAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingUrlAddress_GoogleHomePage {
	

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	String CurrentUrllink="http://google.com";
	driver.get(CurrentUrllink);
	
	String GoogleHomePageCurrentUrllink=driver.getCurrentUrl();
	System.out.println("The current url Address of google Home Page is:-  +google Application Home Page Current url Address");
	//driver.quit();
	}
    }

