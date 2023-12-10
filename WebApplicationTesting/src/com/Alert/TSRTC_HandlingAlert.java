package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HandlingAlert {
	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	
	public void applicationLaunch()
	{
		//Automating The ChromeBrowser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
	}
	
	public void applicationClose()
	{
		driver.quit();
		
	}
	
	public void handlingAlert() throws Exception
	{
		//id="searchBtn"
		By checkAvailabilityproperty=By.id("searchBtn");
		WebElement checkAvailability=driver.findElement(checkAvailabilityproperty);
		checkAvailability.click();
		
		Thread.sleep(5000);
		
		//moving to an alert Window
		Alert alertWindow=driver.switchTo().alert();
		
		String alertWindowTextMessage=alertWindow.getText();
		System.out.println("The text of an alert Window is :- "+alertWindowTextMessage);
		
		alertWindow.accept(); //will perform operation on the OK 
		//press ok button alert window ok enter accept will show and press the accept click 
		
		//alertWindow.dismiss(); //will perform operation on the Cancel Button
		
		//alertWindow.sendKeys("Testing"); //will perform operation to send the test data into alert		
	   
	}
	
public static void main(String[] args) throws Exception  {
	
	TSRTC_HandlingAlert alertHandling=new TSRTC_HandlingAlert();
	alertHandling.applicationLaunch();
	alertHandling.handlingAlert();
}
}
