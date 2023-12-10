package com.AmazonApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		String applicationUrlAddress="http://amazon.in";

		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();

		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();


		//id="nav-link-accountList";
		By accountlistProprty=By.id("nav-link-accountList");
		WebElement accountlist=driver.findElement(accountlistProprty);
		accountlist.click();
		//driver.quit();



		//<input type="email" maxlength="128" id="ap_email" name="email" tabindex="1" class="a-input-text a-span12 auth-autofocus auth-required-field">
		By signinproperty=By.name("email");
		WebElement signin=driver.findElement(signinproperty);
		signin.sendKeys("8074459824");

		//<input id="continue" tabindex="5" class="a-button-input" type="submit" aria-labelledby="continue-announce">
		By buttonproperty=By.className("a-button-input");
		WebElement button=driver.findElement(buttonproperty);
		button.click();

		//<input type="password" maxlength="1024" id="ap_password" name="password" tabindex="2" class="a-input-text a-span12 auth-autofocus auth-required-field">
		//<input type="password" maxlength="1024" id="ap_password" name="password" tabindex="2" class="a-input-text a-span12 auth-autofocus auth-required-field">
		By passwordproperty=By.id("ap_password");
		WebElement password=driver.findElement(passwordproperty);
		password.sendKeys("cutesailu");


		//<input id="signInSubmit" tabindex="3" class="a-button-input" type="submit" aria-labelledby="auth-signin-button-announce">

		By signInproperty=By.id("signInSubmit");
		WebElement signIn=driver.findElement(signInproperty);
		signIn.click();
  /*       
		//<input type="tel" maxlength="6" required="" id="input-box-otp" autocomplete="off" spellcheck="false" class="a-input-text cvf-widget-input cvf-widget-input-code single-input-box-otp">
By emailverificationcodeproperty=By.id("input-box-otp");
WebElement emailverificode=driver.findElement(emailverificationcodeproperty);
Thread.sleep(5000);
emailverificode.sendKeys("686155");
*/
}

}

