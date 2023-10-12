package com.ValidatingUrlAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingUrlAddress_GoogleHomePage {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();

//Navigate Application of URL Link//
driver.navigate().to("http://google.com");

String applicationUrlAddress="http://google.com";
driver.get(applicationUrlAddress);

String Expected_GoogleHomePageUrlAddress="google.com";
System.out.println("The Expected UrlAddress of googleHomePage is :- +GoogleHomePageUrlAddress");


//Get the Url Address of the Current Web Page //
String Actual_googleHomePageCurrentUrlAddress=driver.getCurrentUrl();
System.out.println("The Actual UrlAddress of googleHomePage is :- +GoogleHomePageCurrentUrlAddress");


if
(Actual_googleHomePageCurrentUrlAddress.contains(Expected_GoogleHomePageUrlAddress))
{
	System.out.println("Actual Url Address of the google HomePage matched with Expected Url Address of googleHomePage :- Pass");
}
else
{
	System.out.println("Actual Url Address of the googleHomePage matched with Expected Url Address of GoogleHomePage :- Fail");
}
}
}




class ValidatingUrlAddress_GoogleHomePage1 {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();

//Navigate Application of URL Link//
driver.navigate().to("http://google.com");

String applicationUrlAddress="http://google.com";
driver.get(applicationUrlAddress);

String Expected_GoogleHomePageUrlAddress="Google.com";
System.out.println("The Expected UrlAddress of googleHomePage is :- +GoogleHomePageUrlAddress");


//Get the Url Address of the Current Web Page //
String Actual_googleHomePageCurrentUrlAddress=driver.getCurrentUrl();
System.out.println("The Actual UrlAddress of googleHomePage is :- +GoogleHomePageCurrentUrlAddress");


if
(Actual_googleHomePageCurrentUrlAddress.contains(Expected_GoogleHomePageUrlAddress))
{
	System.out.println("Actual Url Address of the google HomePage matched with Expected Url Address of googleHomePage :- Pass");
}
else
{
	System.out.println("Actual Url Address of the googleHomePage matched with Expected Url Address of GoogleHomePage :- Fail");
}
}
}
