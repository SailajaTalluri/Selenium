package com.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google_SignIn_GetText {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");

WebDriver driver;
String applicationUrlAddress="http://google.com";

driver=new ChromeDriver();
driver.get(applicationUrlAddress);
By signInLinkProperty=By.partialLinkText("in");
WebElement signIn=driver.findElement(signInLinkProperty);

String signInText=signIn.getText();
System.out.println("The text of signIn element on the GoogleHomePage is:- +signInText");

signIn.click();
//driver.quit();

	}

}
