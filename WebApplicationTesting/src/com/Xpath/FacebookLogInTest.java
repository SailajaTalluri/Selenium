package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class FacebookLogInTest {


public static WebDriver driver;
String applicationUrlAddrss="http://facebook.com";

@BeforeTest
public void setUp()
{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
driver = new ChromeDriver();

// System.out.println(" **** Chrome Browser Launched Successfully ********");
Log.info("**** Chrome Browser Launched Successfuly ********");

driver.get(applicationUrlAddrss);

//System.out.println(" Navigated to OrangeHRM Application LogIn Page ");

Log.info(" Navigated to FaceBook Application LogIn Page ");

driver.manage().window().maximize();

// implicitlyWait - its a Global wait / Smart wait / intelligent wait
// implicitlyWait will wait for Every Element on the WebPage for a duration of 10Seconds for
//    the element be identify - once an element is loaded on the WebPage with the given
//       property WebDriver will immediately Automate the element and will not wait for the
//          rest of the Time
//    This wait is going to be applicable for the driver

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// pageLoadTimeout - The WebDriver will wait for the Application WebPage to be loaded on the
//                   Browser and will wait for a maximum for 30Seconds of the duration - even
//                    after the 30Seconds if the Application is not loaded on the Browser
//                     then WebDriver will through and exception related to page load timeOut
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

}

/*
@AfterTest
public void tearDown()
{
driver.quit();
// System.out.println("******** OrangeHRM Application along with Chrome Browser Closed ******");

Log.info("******** OrangeHRM Application along with Chrome Browser Closed ******");
}

*/

@Test
public void facebookLogInTest()
{

// <input type="text"  
// data-testid="royal_email" placeholder="Email address or phone number" autofocus="1"
// aria-label="Email address or phone number">

// By emailIdProperty=By.id("email");

// locator - xpath
// selector (Xpath expression )- is created based on the available properties ( attribute and
//                                 with respective of its corresponding value )

// Syntax for xpath expression creation - based on Single Property
// any xpath expression starts with "//" is called as Relative Xpath
// //tagname[@attribute='attributeValue'] -
// //input[@data-testid='royal_email'] - Relative Xpath expression for identifying Email element

By emailIdProperty=By.xpath("//input[@data-testid='royal_email']");
WebElement emailId=driver.findElement(emailIdProperty);
emailId.sendKeys("nagasailaja08672@gmail.com");

// Password Element Properties
// <input type="password" class="inputtext _55r1 _6luy _9npi" name="pass"
// id="pass" data-testid="royal_pass" placeholder="Password"
// aria-label="Password">

// //input[@id='pass'] - its an xpath expression created based on the locator of the WebDriver
// //*[@id='pass']
// //*[@data-testid='royal_pass']


//By passwordProperty=By.xpath("//input[@id='pass']");

// "//" - means search on the complete WebPage
// search for the tagName - "input"
// "*" - means search for all the Tag's on the WebPage

// By passwordProperty=By.xpath("//*[@id='pass']");
// By passwordProperty=By.xpath("//*[@data-testid='royal_pass']");

// Syntax for xpath expression creation - based on Multiple Property
// //tagname[@attributename1='attributevalue1' and @attributename2='attributevalue2' and ...]
// //input[@placeholder='Password' and @type='password']

By passwordProperty=By.xpath("//input[@placeholder='Password' and @type='password']");
WebElement password=driver.findElement(passwordProperty);
password.sendKeys("cute@sailu123");

// LogIn Button Properties
// <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"
// name="login" data-testid="royal_login_button"
// type="submit" id="u_0_5_/4">Log in</button>


//button[@type='submit']

By logInButtonProperty=By.xpath("//button[@type='submit']");
WebElement logInButton=driver.findElement(logInButtonProperty);
logInButton.click();

}

}










