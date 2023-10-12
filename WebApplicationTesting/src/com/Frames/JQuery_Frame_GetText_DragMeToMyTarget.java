package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery_Frame_GetText_DragMeToMyTarget {

	WebDriver driver;
	String applicationUrlAddress="https://jqueryui.com/droppable/";
	
	public void applicationLaunch()
	{
		//Automating the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);	
	}
	
	public void dragMeToMyTargetText() throws Exception
	{
		//identify the Frame of the WebPage
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
    
		By WebPageFrameProperty=By.className("demo-frame");
	    WebElement webPageFrame=driver.findElement(WebPageFrameProperty);
	 
	    //We should get into the Frame of the WebPage - to identify the element under test
	    
	    driver.switchTo().frame(webPageFrame);
	    
	    //<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative; left: -6px; top: -4px;"><p>Drag me to my target</p></div>
	
	    //id="draggable" - property of "Drag Me to My Target"
	    //id="draggable"
	    
	     Thread.sleep(5000);
	    By dargMeToMyTargetProperty=By.id("draggable");
	    WebElement dragMeToMyTarget=driver.findElement(dargMeToMyTargetProperty);
	    
	    String dragMeToMyTarget_Text=dragMeToMyTarget.getText();
	    System.out.println("The text of the Element Drag Me To My Target is :- "+dragMeToMyTarget_Text);
	    
	}
	
	public void applicationClose()
	{
		driver.quit();
	}
	
	
	public static void main(String[] args) throws Exception {
		JQuery_Frame_GetText_DragMeToMyTarget webPageFrame=new JQuery_Frame_GetText_DragMeToMyTarget();
		webPageFrame.applicationLaunch();
		webPageFrame.dragMeToMyTargetText();
		webPageFrame.applicationClose();
		
	}	
}
