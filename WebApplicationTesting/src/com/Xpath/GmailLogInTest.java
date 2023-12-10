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

public class GmailLogInTest {

	public static WebDriver driver;
	String applicationUrlAddress="http://gmail.com";
	@BeforeTest
	public void setUp()
	{
		System.setProperty("Webdriver.chrome.driver","/BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		Log.info("****Chrome Browser Launched Successfully****");
		driver.get(applicationUrlAddress);
		Log.info("Navigated to OrangeHRM Application LogIn Page");
		driver.manage().window().maximize();
		//implicity Wait - its a global wait / Smart wait/intelligent wait
		//implicity wait will wait for every element on the webpage for a duration of 10 seconds for 
		//The element be identify - once an element is loaded on the webpage with the given
		//property webdriver will immediately automate the element and will not wait for the 
		//rest of the time
		//this wait is going to be applicable for the driver 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//pageloadTimeout - The Webdriver will wait for the Application WebPage to be loaded on the 
		//Browser and will wait for a maximum for 30 seconds of the duration - even
		//After the 30 seconds if the Application is not loaded on the Browser 
		//Then WebDriver will through and exception related to page load timeout
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
public void gmailLoginTest()
{
	//<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0"
	//aria-label="Email or phone" name="identifier" value="" autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
	
	// //input[@autocomplete='username']
	 By emailIdproperty=By.xpath("//input[@autocomplete='username']");
	 WebElement emailId=driver.findElement(emailIdproperty);
	 emailId.sendKeys("sailaja9tester@gmail.com");
	 //Next Button property
	 //<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
	 // //span[@jsname='V67aGc']
	// By nextbuttonproperty=By.xpath("//span[@jsname='V67aGc']");
	 //text() - method - creating an xpath Expression 
	 //1.//tagname[text()='textvalue']
	 
	 // //span[text()='Next']
	 By nextbuttonproperty=By.xpath("//span[text()='Next']");
	 WebElement nextbutton=driver.findElement(nextbuttonproperty);
	 //System.out.println("The text of the Next button is :-"+nextbutton.getText());
	 Log.info("The text of the Next button is :-"+nextbutton.getText());
	 nextbutton.click();
}
}
	


