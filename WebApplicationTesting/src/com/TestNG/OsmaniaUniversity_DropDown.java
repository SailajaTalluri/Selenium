package com.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OsmaniaUniversity_DropDown extends BaseTest {
	@Test(description="Getting the Languages names from the Select Language DropDown")
	public void gettingDropDownLanguagesListNames()
	{
	// id="gtranslate_selector"
	By selectLanguagesDropDownProperty=By.id("gtranslate_selector");
	WebElement selectLanguagesDropDown=driver.findElement(selectLanguagesDropDownProperty);
	/*
	<option value="en|hi">Hindi</option>
	<option value="en|fr">French</option>
	<option value="en|de">German</option>
	*/
	// going to the dropDown and find the Elements with the Property
	By dropDownProperty=By.tagName("option");
	List<WebElement>dropDown=selectLanguagesDropDown.findElements(dropDownProperty);

	// To goto Every element of the SelectLanuguage DropDown and  get the Names
	for(int index=0;index<dropDown.size();index++)
	{
	String selectLanguageDropDown_LanguageName=dropDown.get(index).getText();
	System.out.println(index+" "+selectLanguageDropDown_LanguageName);
	}
	}
	}


