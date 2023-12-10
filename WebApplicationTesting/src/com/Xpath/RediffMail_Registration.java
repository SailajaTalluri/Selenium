package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class RediffMail_Registration {

	public static WebDriver driver;
	String applicationUrlAddress="http://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	    driver=new ChromeDriver();
	   // System.out.println("****CHROME BROWSER LAUNCHED SUCCESSFULLY****");
	    Log.info("****CHROME BROWSER LAUNCHED SUCCESSFULLY****");
	    driver.get(applicationUrlAddress);
	   // System.out.println("****NAVIGATED TO ORANGE HRM APPLOCATION LOGIN PAGE****");
	    Log.info("****NAVIGATED TO ORANGE HRM APPLOCATION LOGIN PAGE****");
	    driver.manage().window().maximize();
	    //implicity wait - its a global wait /smart wait / intelligent wait
	    //implicity wait will wait for every element on the webpage for a duration of 10 seconds for 
	    //the element be identify - once an element is loaded on the webpage with given 
	    //property webdriver will immediately Automate the element and will not wait for the 
	    //rest of the time
	    //This wait is going to be applicable for the driver 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //pageLoadTimeout - The webdriver will wait for the Application webpage to be loaded on the 
	    //Browser and will wait for a maximum for 30 seconds of the duration - even
	    //after the 30 seconds if the application is not loaded on the browser
	    //then webdriver will through and exception related to page load timeout 
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	/*
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		//System.out.println("****OrangeHRM Application along with chrome browser closed****");
		Log.info("****OrangeHRM Application along with chrome browser closed****");
     }
*/    
	@Test
	public void customerServiceTest()
	{
		
		//<input type="text" onblur="fieldTrack(this);
		//" name="name2a8f04dd" value="" style="width:185px;" maxlength="61">
		
		// name="name263f4b0c"
		// name="name263f4b0c"
		// name="name0618ec4a"

		//By fullNameProperty=By.name("name263f4b0c");

		// dynamic Xpath Expressin creation based on the Property
		// //*[starts-with(@name,'name')]
		By fullNameProperty=By.xpath("//*[starts-with(@name,'name')]");
		WebElement fullName=driver.findElement(fullNameProperty);
		fullName.sendKeys("Hello");
	}
    }
