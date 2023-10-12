package com.CapturingTitle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bing_CapturingTitle {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://bing.com");
		String applicationUrladdress = "http://bing.com";
		driver.get (applicationUrladdress);
		String BingHomepageTitle = "Bing";
		driver.getTitle();
		System.out.println("The title of the Bing HomePage is :- +bingHomePageTitle");
		//driver.close();
		//driver.quit();
		
		}
	
}



		








