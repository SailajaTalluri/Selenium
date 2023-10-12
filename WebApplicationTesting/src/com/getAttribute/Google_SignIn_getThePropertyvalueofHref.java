package com.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_getThePropertyvalueofHref {

	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		 
	    //Automating the chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		//Signin element property//
		By SigninProperty=By.linkText("Sign in");
		WebElement Signin=driver.findElement(SigninProperty);
		String SigninText=Signin.getText();
		
		System.out.println("The text of an element Signin is:- "+SigninText);
		
		String SigninHrefAttributeValue=Signin.getAttribute("href");
		System.out.println("The attribute Href Value is:-" +SigninHrefAttributeValue);
		
		Signin.click();
		//driver.quit();
}

}
