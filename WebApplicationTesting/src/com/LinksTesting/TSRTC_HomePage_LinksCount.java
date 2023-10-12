package com.LinksTesting;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TSRTC_HomePage_LinksCount {

	public static void main(String[] args) {

		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in";
		
		//Automating the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		By linksCommonProperty=By.tagName("a");
		List<WebElement>TSRTC_HomePageLinks=driver.findElements(linksCommonProperty);
		driver.findElements(linksCommonProperty);	
		
		int TSRTC_HomePageLinksCount=TSRTC_HomePageLinks.size();
		System.out.println("The number of Links on the TSRTC Home Page are:-"+TSRTC_HomePageLinksCount);
		
		driver.quit();
	
	}

	
		
	}	
	


