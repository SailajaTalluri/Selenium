package com.LinksTesting;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_DisplayLinkNames {

	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in";
		  
		//Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(applicationUrlAddress);
        
        By linksCommonProperty=By.tagName("a");
        List<WebElement>TSRTC_HomePageLinks=driver.findElements(linksCommonProperty);
        
        
        int TSRTC_HomePageLinksCount=TSRTC_HomePageLinks.size();
        System.out.println("The number of Links on the TSRTC Home Page are :-"+TSRTC_HomePageLinksCount);
        
        for(int index=0;index<TSRTC_HomePageLinksCount;index++)
        {
        	String linkName=TSRTC_HomePageLinks.get(index).getText();
        	System.out.println(index+" "+linkName);
        }
        driver.quit();
        		
		
	}

}
