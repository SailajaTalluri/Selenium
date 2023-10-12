package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JQuery_DragAndDrop {
	
	WebDriver driver;
	String applicationUrlAddress="https://jqueryui.com/droppable/";

	public void applicationLaunch()
	{
	// Automating the Chrome Browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\sailaja_29_8_23\\WebApplicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	}

	public void dragAndDrop() throws InterruptedException
	{
	// Identify the Frame of the WebPage
	//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>

	By webPageFrameProperty=By.className("demo-frame");
	WebElement webPageFrame=driver.findElement(webPageFrameProperty);

	// we should get into the Frame of the WebPage - to identify the element under Test

	driver.switchTo().frame(webPageFrame);

	// id="draggable" - property of "Drag Me to my Target"
	// id="draggable"

	//Thread.sleep(5000);

	By dragMeToMyTargetProperty=By.id("draggable");
	WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);

	String dragMeToMyTarget_Text=dragMeToMyTarget.getText();
	System.out.println(" The text of the Element Drag Me to My Target is :- "+dragMeToMyTarget_Text);

	// id="droppable"

	By droppableProperty=By.id("droppable");
	WebElement droppable=driver.findElement(droppableProperty);
	String droppableText=droppable.getText();
	System.out.println(" The text of an element Droppable is :- "+droppableText);

	// Performing Drag and Drop Operation

	Actions dragAndDropAction = new Actions(driver);
	dragAndDropAction.dragAndDrop(dragMeToMyTarget, droppable).build().perform();;

	// since the driver is within the frame of the WebPage - should be switched
	// back to the actual WebPage - using the method defaultContent()
	driver.switchTo().defaultContent();

	// Automating Resizable Element - is not in the frame of the WebPage
	// <a href="https://jqueryui.com/resizable/">Resizable</a>
	// <a href="https://jqueryui.com/resizable/">Resizable</a>

	Thread.sleep(5000);

	By resizableProperty=By.linkText("Resizable");
	WebElement resizable=driver.findElement(resizableProperty);
	resizable.click();

	System.out.println(driver.getTitle());

	}


	public void applicationClose()
	{
	driver.quit();
	}


	public static void main(String[] args) throws InterruptedException {


	JQuery_DragAndDrop dragAndDropOperation = new JQuery_DragAndDrop();
	dragAndDropOperation.applicationLaunch();
	dragAndDropOperation.dragAndDrop();
	// dragAndDropOperation.applicationClose();

	}

	}


