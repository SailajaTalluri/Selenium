package com.OrangeHrmLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ohrm_AddEmployee {

public static void main(String[] args) {
//WebDriver Interface of Selenium
//We can Add external libraries the Selenium standard alone Jar files are attached and import all webdriver jar files import
WebDriver driver=new ChromeDriver();
String applicationUrlAddress=("http://183.82.103.245/nareshit/login.php");
//Automating the WebBrowser is Edge Browser
//System.setProperty("webdriver.edge.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\BasicCoreJavaPROJECT\\BROWSERDriverFiles\\msedgedriver.exe");
System.setProperty("webdriver.chrome.driver","./BROWSERDriverFiles/chromedriver.exe");
	
driver.get(applicationUrlAddress);
	
/*
<input name="txtUserName" type="text" class="loginText" tabindex="1">
<input name="txtPassword" type="password" class="loginText" tabindex="2">
<input type="Submit" name="Submit" value="Login" class="button" tabindex="3">
				 
*/
				
String userNameTestData="admin"; //Test Data
By userNameProperty=By.name("txtUserName");//Identify the property of an element
WebElement userName=driver.findElement(userNameProperty);
userName.sendKeys(userNameTestData);
System.out.println();
	
String passwordTestData="admin";
By passwordProperty=By.name("txtPassword");
WebElement password=driver.findElement(passwordProperty);
password.sendKeys(passwordTestData);
System.out.println();
	
By LoginButtonProperty=By.className("button");
WebElement LoginButton=driver.findElement(LoginButtonProperty);
LoginButton.click();

//<li>Welcome admin</li>
/*
<div id="option-menu-bar">
<ul id="option-menu">
 */
String Expected_Welcomeadmin="Welcome admin";
System.out.println("Expected welcome message is "+Expected_Welcomeadmin);
By WelcomeAdminProperty=By.id("option-menu");
WebElement WelcomeAdminText=driver.findElement(WelcomeAdminProperty);
String Actual_WelcomeAdmin=WelcomeAdminText.getText();
System.out.println("Actual welcome message is "+Actual_WelcomeAdmin);
if(Actual_WelcomeAdmin.contains(Expected_Welcomeadmin))
{
	System.out.println("The Actual and Expected Welcome Admin Text message is displayed - PASS");
}
	
else
{
	System.out.println("The Actual and Expected Welcome Admin Text message is displayed - FAIL");
}

//<span class="drop current">PIM</span>
//pim
By pimproperty=By.id("pim");
WebElement pimModule=driver.findElement(pimproperty);
Actions pimactions=new Actions(driver);
pimactions.moveToElement(pimModule).build().perform();

//<span>Add Employee</span>
By AddEmployeeproperty=By.linkText("Add Employee");
WebElement AddEmployee=driver.findElement(AddEmployeeproperty);
AddEmployee.click();

//<a href="./index.php?ACT=logout" target="rightMenu">Logout</a>
By LogoutProperty=By.linkText("Logout");
WebElement Logout=driver.findElement(LogoutProperty);
Logout.click();
driver.close();
			
}
}
