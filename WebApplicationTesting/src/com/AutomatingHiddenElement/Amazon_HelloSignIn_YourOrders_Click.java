package com.AutomatingHiddenElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon_HelloSignIn_YourOrders_Click {

	public static void main(String[] args) {
        WebDriver driver;
		String applicationUrlAddress="http://amazon.in";

		// Automating the ChromeBrowser
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

		// Automating Hidden Element - Your Orders
		// Your Ordres
		// Type of element is link
		// locator - linkText
		// selector - Your Orders

		By yourOrdersProperty=By.linkText("Your Orders");
		WebElement yourOrders=driver.findElement(yourOrdersProperty);
		yourOrders.click();

		String webPageTitle=driver.getTitle();
		System.out.println(" The navigated Your Orders webPage title is :- "+webPageTitle);

		driver.quit();

		}
	    }


