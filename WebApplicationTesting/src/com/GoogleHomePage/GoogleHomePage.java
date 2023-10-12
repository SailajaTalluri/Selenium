package com.GoogleHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleHomePage {

	
	public static void main(String[] args) {
		 WebDriver driver;
		 String applicationUrlAddress="https://www.google.com";

		 //Automating ChromeBrowser
         
         System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		
        driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
	driver.findElement(By.name("q")).sendKeys("googlehomepage");
	
	     //driver.close();
		//driver.quit();
}
}



