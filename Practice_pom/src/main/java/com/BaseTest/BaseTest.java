package com.BaseTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import com.utility.Log;
public class BaseTest {
public static WebDriver driver;
String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
@BeforeTest
public void setUp()
{
//Automating the chromeBrowser
System.setProperty("webdriver.edge.driver", "./BROWSERDRIVERFILES/msedgedriver.exe");
driver=new EdgeDriver();
Log.info("*****Edge Browser Launched Successfully*****");
driver.get(applicationUrlAddress);
Log.info("****Successfully Navigated to expected webdriver Application*****");

//implicity wait
driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
