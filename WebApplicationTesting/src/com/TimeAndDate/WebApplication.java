package com.TimeAndDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebApplication {

public static WebDriver driver;
String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

public void applicationLaunch()
{
// Automating the Chrome Browser
System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
driver = new ChromeDriver();

driver.get(applicationUrlAddress);

}

public void applicationClose()
{
driver.quit();
}
}
