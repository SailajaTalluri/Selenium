package com.RadioButtons;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonsTestingAssignment extends BaseTest {

	//@Test(description="Validating Group1 Radio Buttons")
	public void groupOfRadioButtonTesting() throws InterruptedException
	{
	/*
	<input type="radio" name="group1" value="Milk">
	<input type="radio" name="group1" value="Butter" checked="">
	<input type="radio" name="group1" value="Cheese">

	<input type="radio" name="group2" value="Water">
	<input type="radio" name="group2" value="Beer">
	<input type="radio" name="group2" value="Wine" checked="">
	*/

	// common property of the first Group1 radio buttons
	By group1RadioButtonsProperty=By.name("group1");
	List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonsProperty);
	By group2RadioButtonsProperty=By.name("group2");
	List<WebElement>group2RadioButtons=driver.findElements(group2RadioButtonsProperty);
	// to goto every Radio Button
	for(int group1RadioButtonClick=0;group1RadioButtonClick<group1RadioButtons.size();group1RadioButtonClick++)
	{
	// going to a Radio Button and performing click operation
	group1RadioButtons.get(group1RadioButtonClick).click();
	// to goto every Radio Button and get the Status of it
	for(int group1RadioButtonsStatus=0;group1RadioButtonsStatus<group1RadioButtons.size();group1RadioButtonsStatus++)
	{
	// Thread.sleep(5000);
	String group1RadioButtonName=group1RadioButtons.get(group1RadioButtonsStatus).getAttribute("value");
	String statusOfRadioButton=group1RadioButtons.get(group1RadioButtonsStatus).getAttribute("checked");
	System.out.println(group1RadioButtonName+" - "+statusOfRadioButton);
	}
	System.out.println();
	}
	for(int group2RadioButtonClick=0;group2RadioButtonClick<group2RadioButtons.size();group2RadioButtonClick++)
	{
	// going to a Radio Button and performing click operation
	group1RadioButtons.get(group2RadioButtonClick).click();
	// to goto every Radio Button and get the Status of it
	for(int group2RadioButtonsStatus=0;group2RadioButtonsStatus<group2RadioButtons.size();group2RadioButtonsStatus++)
	{
	// Thread.sleep(5000);
	String group2RadioButtonName=group2RadioButtons.get(group2RadioButtonsStatus).getAttribute("value");
	String statusOfRadioButton=group2RadioButtons.get(group2RadioButtonsStatus).getAttribute("checked");
	System.out.println(group2RadioButtonName+" - "+statusOfRadioButton);
	}
	System.out.println();
	}
	}
	public static void main(String[] args) throws InterruptedException {
	RadioButtonsTestingAssignment radioButtonsTest = new RadioButtonsTestingAssignment();
	radioButtonsTest.applicationLaunch();
	radioButtonsTest.groupOfRadioButtonTesting();
	radioButtonsTest.applicationClose();
	}
	}

