package com.DropDown;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class BaseTest {

		public static WebDriver driver;
		String applicationUrlAddress="https://www.osmania.ac.in/";
		
		public void applicationLaunch()
		{
			//Automating the ChromeBrowser
			System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		   
			driver=new ChromeDriver();
			driver.get(applicationUrlAddress);
		}
        
		public void applicationClose()
		{
			driver.quit();
		}
	    }






