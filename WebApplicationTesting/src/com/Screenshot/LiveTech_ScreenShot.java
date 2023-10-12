package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LiveTech_ScreenShot {
 
	WebDriver driver;
	
	public void applicationLaunch()
	{
		String applicationUrlAddress="http://livetech.in";
		
		//Automating the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);		
	}
	
	public void applicationClose()
	{
		driver.quit();
	}
	
	public static void main(String[] args) throws IOException  {
		
		LiveTech_ScreenShot liveTech=new LiveTech_ScreenShot();
		liveTech.applicationLaunch();
		liveTech.capturingLiveTechHomePageScreenShot();
		liveTech.applicationClose();	
	}
	public void capturingLiveTechHomePageScreenShot() throws IOException {
		
		
	// TakesScreenshot - is an interface of Selenium
	// OutputType - is an interface of Selenium
	File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenShot, new File("./ScreenShot/LiveTech.png"));
	
}
}
