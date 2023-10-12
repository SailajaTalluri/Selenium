package com.WebTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

	public void applicationLaunch()
	{
		//Automating the Chrome Browser
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	   
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
	}

	public void applicationClose()
	{
		driver.quit();
	}
    }




