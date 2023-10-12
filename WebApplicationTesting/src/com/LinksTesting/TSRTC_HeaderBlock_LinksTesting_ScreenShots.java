package com.LinksTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_LinksTesting_ScreenShots {

	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web";
	
public void applicationLaunch()
{
	//Automating the Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get(applicationUrlAddress);
}

public void applicationClose()
{
	driver.quit();
}

public void tsrtc_headerBlocklinksTesting_CapturingScreenShots() throws IOException
{
	//Identifying the Header Block of the WebPage 
	//<div class="menu-wrap"><div class="menu">-property of the Header Block 
	By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
	WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	
	//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
	//<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
	//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
	
	By linksProperty=By.tagName("a");
	List<WebElement>tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(linksProperty);
	
	//finding the size of the ArrayList(tsrtc_HeaderBlockLinks)
	int tsrtc_HeaderBlockLinksCount=tsrtc_HeaderBlockLinks.size();
	System.out.println("The number of elements of type links in the Header Block of TSRTC Application HomePage are:-"+tsrtc_HeaderBlockLinksCount);
	
	for(int index=0;index<tsrtc_HeaderBlockLinksCount;index++)
	{
		String tsrtc_HeaderBlockLinkName=tsrtc_HeaderBlockLinks.get(index).getText();
		System.out.println(index+ "  "+tsrtc_HeaderBlockLinkName);
		
		String Expected_LinkUrlAddress=tsrtc_HeaderBlockLinks.get(index).getAttribute("href");
		System.out.println("The Expected Url Address of the link is :- "+Expected_LinkUrlAddress);
		
		tsrtc_HeaderBlockLinks.get(index).click();
		
		String webPageTitle=driver.getTitle();
		System.out.println(webPageTitle);
		
		String Actual_webPageCurrentUrlAddress=driver.getCurrentUrl();
		System.out.println("The Actual Url Address of the links of the Webpage is :- "+Actual_webPageCurrentUrlAddress);
		
		if(Actual_webPageCurrentUrlAddress.equals(Expected_LinkUrlAddress))
		{
			System.out.println("Successfully navigated to the Expected link WebPage - PASS");
		}
		else
		{
			System.out.println("Failed to navigate to the Expected link WebPage - FAIL");
			
		}
		System.out.println();
		
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot,new File("./TSRTC_HeaderBlock_ScreenShots/" +tsrtc_HeaderBlockLinkName+".png"));
		
		driver.navigate().back();
		
		tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
		tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(linksProperty);
		
	}
}

				
public static void main(String[] args) throws IOException {
	TSRTC_HeaderBlock_LinksTesting_ScreenShots screenShot=new TSRTC_HeaderBlock_LinksTesting_ScreenShots();
	screenShot.applicationLaunch();
	screenShot.tsrtc_headerBlocklinksTesting_CapturingScreenShots();
	screenShot.applicationClose();
}
			
}
	

