package com.TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";
	@BeforeTest
	public void Setup()
	{
		//Automating the ChromeBrowser
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


