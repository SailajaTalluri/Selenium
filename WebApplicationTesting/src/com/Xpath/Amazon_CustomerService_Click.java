package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class Amazon_CustomerService_Click {
public static WebDriver driver;
String applicationUrlAddress="http://amazon.in";

@BeforeTest
public void setUp()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	//System.out.println("****Chrome Browser Launched Successfully****");
	Log.info("****Chrome Browser Launched Successfully****");
	driver.get(applicationUrlAddress);
	//System.out.println("****Navigated to orange HRM Application Login Page****");
    Log.info("****NAVIGATED TO ORANGE HRM APPLICATION LOGIN PAGE ****");
    driver.manage().window().maximize();
    // implicityWait - its a Global wait / smart wait / intelligent wait
     //implicity wait will wait for every element on the webpage for a duration of 10 seconds for
    //the element be identify - once an element is loaded on the webpage with the given
    //rest of the time
    //This wait is going to be applicable for the driver 
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //pageloadTimeout - The webdriver will wait for the Application webpage to be loaded on the 
    //Browser and will wait for a maximum for 30 seconds if the application is not loaded on the browser
    //then webdriver will through and exception related to page load time out
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
}
/*
@AfterTest
public void tearDown()
{
	driver.quit();
	//System.out.println("****ORANGE HRM APPLICATION ALONG WITH CHROME BROWSER CLOSED****");
	Log.info("****ORANGE HRM APPLICATION ALONG WITH CHROME BROWSER CLOSED****");
}
*/

@Test
public void customerServiceTest()
{
	//Customer Service - its a link 
	//By customerserviceproperty=By.linkText("Customer Service");
	//1.//tagname[contains(text(),'partialtextvalue')]
	// //a[contains(text(),'Customer')]
	//<a href="/gp/help/customer/display.html?nodeId=200507590&amp;ref_=nav_cs_help" class="nav-a  " tabindex="0" data-csa-c-type="link" 
	//data-csa-c-slot-id="nav_cs_5" 
	//data-csa-c-content-id="nav_cs_help" data-csa-c-id="u0sjz3-co0sis-ezrz01-uzhmuf">Customer Service</a>
	//By customerserviceproperty=By.xpath("//a[contains(text(),'Customer')]");
	By customerserviceproperty=By.xpath("//*[contains(text(),'Customer')]");
    WebElement customerservice=driver.findElement(customerserviceproperty);
    customerservice.click();
    System.out.println("The title of the Webpage is :-"+driver.getTitle());
}
}


