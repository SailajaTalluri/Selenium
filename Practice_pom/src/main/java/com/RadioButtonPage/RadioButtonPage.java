package com.RadioButtonPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class RadioButtonPage extends BaseTest {
public RadioButtonPage()
{
	PageFactory.initElements(driver, this);
}
/*
<input type="radio" name="group1" value="Milk">
<input type="radio" name="group1" value="Butter" checked="">
<input type="radio" name="group1" value="Cheese">
<input type="radio" name="group2" value="Water">	
<input type="radio" name="group2" value="Beer">
<input type="radio" name="group2" value="Wine" checked="">
 */

@FindBy(name = "group1")
WebElement milk;
public void validatingmilkRadiobutton()
{
	milk.click();
}
	
@FindBy(name = "group1")
WebElement butter;
public void validatingbutterRadiobutton()
{
	butter.click();
}

@FindBy(name="group1")
WebElement Cheese;
public void validatingCheeseRadiobutton()
{
	Cheese.click();
}

@FindBy(name="group2")
WebElement Water;
public void validatingWaterRadiobutton()
{
	Water.click();
}

@FindBy(name="group2")
WebElement Beer;
public void validatingBeerRadiobutton()
{
	Beer.click();
}

@FindBy(name="group2")
WebElement Wine;
public void validatingWineRadiobutton()
{
	Wine.click();
}
}
