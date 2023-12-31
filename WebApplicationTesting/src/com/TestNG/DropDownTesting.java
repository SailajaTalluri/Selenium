package com.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTesting extends BaseTest{
@Test(description="Getting the Languages names from the Select Language DropDown")
public void gettingDropDownLanguagesListNames()
{
// id="gtranslate_selector"
By selectLanguagesDropDownProperty=By.id("gtranslate_selector");
WebElement selectLanguagesDropDown=driver.findElement(selectLanguagesDropDownProperty);

Select selection = new Select(selectLanguagesDropDown);
selection.selectByIndex(1); // index starts with 0
selection.selectByValue("en|hi"); // value should be taken from the property of the
                                   // element given by the developer
selection.selectByVisibleText("Hindi"); // text of the element

//selection.deselectAll(); // will deselect all the selected Optional values
//selection.deselectByVisibleText("Telugu");
//selection.deselectByIndex(9);

//selection.selectByValue("en|fr");

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
System.out.println();
}
/*
	public static void main(String[] args) {
		DropDownTesting DropDownTest=new DropDownTesting();
		DropDownTest.applicationLaunch();
		DropDownTest.gettingDropDownLanguagesListNames();
		DropDownTest.applicationClose();
		*/
	}

	
	
	
