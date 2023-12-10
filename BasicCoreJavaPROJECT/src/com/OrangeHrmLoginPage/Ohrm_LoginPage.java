package com.OrangeHrmLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Ohrm_LoginPage {

	public static void main(String[] args) {
		//WebDriver Interface of Selenium
		//We can Add external libraries the Selenium standard alone Jar files are attached and import all webdriver jar files import
		 //EdgeDriver driver;
		//driver=new EdgeDriver();
		
		String applicationUrlAddress=("http://183.82.103.245/nareshit/login.php");
		//Automating the WebBrowser is Edge Browser
		System.setProperty("webdriver.edge.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\BasicCoreJavaPROJECT\\BROWSERDriverFiles\\msedgedriver.exe");
		//System.setProperty("webdriver.chrome.driver","./BROWSERDriverFiles/chromedriver.exe");
		EdgeDriver driver=new EdgeDriver();
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
driver.close();
	}
    }
