package com.Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Google_Signin {

public static void main(String[] args){
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		//Automating the chromeDriver
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
        driver=new ChromeDriver(); 
        driver.get(applicationUrlAddress);
        By signinLinkProperty=By.partialLinkText("in");
        WebElement signin=driver.findElement(signinLinkProperty);
        signin.click();
       //driver.quit();
     //Thread.sleep(5000);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
//<span jsname="V67aGc" class="VfPpkd-vQzf8d">Create account</span>
///html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span        
        By createaccountproperty=By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span");
        WebElement createaccount=driver.findElement(createaccountproperty);
        Actions createaccountactions=new Actions(driver);
        createaccountactions.moveToElement(createaccount).build().perform();
        createaccount.click();

//<span jsname="K4r5Ff" class="VfPpkd-StrnGf-rymPhb-b9t22c">For my personal use</span>        
        
        By personaluseproperty=By.className("VfPpkd-StrnGf-rymPhb-b9t22c");
        WebElement mypersonaluse=driver.findElement(personaluseproperty);
        mypersonaluse.click();
 //<input type="text" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="on" spellcheck="false" tabindex="0" aria-label="First name" name="firstName" value="" aria-disabled="false" autocapitalize="sentences" 
 //id="firstName" data-initial-value="tirunagari" badinput="false" dir="ltr">       
        By firstnameproperty=By.id("firstName");
        WebElement firstname=driver.findElement(firstnameproperty);
        firstname.sendKeys("tirunagari");
        
//<input type="text" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="on" spellcheck="false" tabindex="0" aria-label="Last name (optional)" name="lastName" value="" aria-disabled="false" 
//autocapitalize="sentences" id="lastName" data-initial-value="geethasrimani" badinput="false" dir="ltr">        
By lastnameproperty=By.id("lastName");
WebElement lastname=driver.findElement(lastnameproperty);
lastname.sendKeys("geethasrimani");

//<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
By nextbuttonproperty=By.className("VfPpkd-vQzf8d");
WebElement nextbutton=driver.findElement(nextbuttonproperty);
nextbutton.click();

//<option value="1" class="xxcVG">January</option>
///html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div[2]/select
By monthproperty=By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div[2]/select");
WebElement month=driver.findElement(monthproperty);
Select select=new Select(month);
select.selectByVisibleText("October");


//<input type="tel" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="off" spellcheck="false" tabindex="0" aria-label="Day" maxlength="2"
//name="day" value="" aria-disabled="false" id="day" data-initial-value="">
By dayproperty=By.name("day");
WebElement day=driver.findElement(dayproperty);
day.sendKeys("12");



}
}










