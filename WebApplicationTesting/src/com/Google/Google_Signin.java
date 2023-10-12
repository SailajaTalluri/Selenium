package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Signin {

public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		//Automating the chromeDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
        driver=new ChromeDriver(); 
        driver.get(applicationUrlAddress);
        By signinLinkProperty=By.partialLinkText("in");
        WebElement signin=driver.findElement(signinLinkProperty);
        signin.click();
       //driver.quit();

}
}



class Google_Signin1 {

public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		//Automating the chromeDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
        driver=new ChromeDriver(); 
        driver.get(applicationUrlAddress);
        By signinLinkProperty=By.partialLinkText("in");
        WebElement signin=driver.findElement(signinLinkProperty);
        
        
        String UserNameTestData="nagasailaja08672@gmail.com";
        By UserNameProperty=By.className("nagasailaja08672@gmail.com");
        WebElement UserName=driver.findElement(UserNameProperty);
        UserName.sendKeys(UserNameTestData);
        
       
       //Class="button"_Property of LoginButton
       By nextbuttonProperty=By.className("nextbutton");
       WebElement nextbutton=driver.findElement(nextbuttonProperty);
       nextbutton.click();
       //driver.quit();

}
}







