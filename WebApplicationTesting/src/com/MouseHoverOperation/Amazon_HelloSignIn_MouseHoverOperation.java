package com.MouseHoverOperation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHoverOperation {

	public static void main(String[] args) {

		WebDriver driver;
		String applicationUrlAddress="http://amazon.in";

		// Automating the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		// Hello SignIn Element Property
		// id="nav-link-accountList"

		By helloSignInProperty=By.id("nav-link-accountList");
		WebElement helloSignIn=driver.findElement(helloSignInProperty);

		// Mouse Hover Operation on Hello SignIn Element
		Actions actions = new Actions(driver);

		actions.moveToElement(helloSignIn).build().perform();

		}

		}


