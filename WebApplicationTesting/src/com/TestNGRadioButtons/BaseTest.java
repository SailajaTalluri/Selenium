package com.TestNGRadioButtons;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

	public class BaseTest {

		public static WebDriver driver;
		String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
        @BeforeTest
		public void Setup()
		{
			//Automating the Chrome Browser
			System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		   
			driver=new ChromeDriver();
			driver.get(applicationUrlAddress);
		}
		@AfterTest
		public void teardown()
		{
			driver.quit();
		}
	    }




