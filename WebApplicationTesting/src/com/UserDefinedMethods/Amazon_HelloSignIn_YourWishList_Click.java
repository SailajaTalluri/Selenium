package com.UserDefinedMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Amazon_HelloSignIn_YourWishList_Click {

	
	WebDriver driver;
		String applicationUrlAddress="http://www.amazon.in/";

		public void applicationLaunch()
		{
			//Automating The ChromeBrowser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(applicationUrlAddress);
		}
		
		public void applicationClose()
		
		{
			driver.quit();
			
		}
		
		public static void main(String[] args) {
			
			Amazon_HelloSignIn_YourWishList_Click yourWishList=new Amazon_HelloSignIn_YourWishList_Click();
			yourWishList.applicationLaunch();
			yourWishList.helloSignIn_WishList();
			yourWishList.applicationClose();	
		}
	
		
		public void helloSignIn_WishList()
		{
			
			By helloSignInProperty=By.id("nav-link-accountList");
			WebElement helloSignIn=driver.findElement(helloSignInProperty);

			
			Actions actions = new Actions(driver);
			actions.moveToElement(helloSignIn).build().perform();
			
        // <a href="/hz/wishlist/ls?requiresSignIn=1&amp;ref_=nav_AccountFlyout_wl" class="nav-link nav-item"><span class="nav-text">Your Wish List</span></a>
		//<span class="nav-text">Your Wish List</span>	
			By yourWishListProperty=By.linkText("Your Wish List");
			WebElement yourWishList=driver.findElement(yourWishListProperty);
			yourWishList.click();

	}
		}
		
		

