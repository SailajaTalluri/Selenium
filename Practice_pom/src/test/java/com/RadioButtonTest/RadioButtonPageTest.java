package com.RadioButtonTest;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.RadioButtonPage.RadioButtonPage;

public class RadioButtonPageTest extends BaseTest {
@Test(priority=1,description="Validating milk radio button page Test")
	public void validatingmilkRadiobutton()
	{
	RadioButtonPage milkbtn=new RadioButtonPage();
	milkbtn.validatingmilkRadiobutton();
	
	}
@Test(priority=2,description="Validating butter radio button page Test")
public void validatingbutterRadiobutton()
{
	RadioButtonPage butterbtn=new RadioButtonPage();
	butterbtn.validatingbutterRadiobutton();
}
@Test(priority=3,description="validating cheese radio button page Test")
public void validatingCheeseRadiobutton()
{
	RadioButtonPage cheesebtn=new RadioButtonPage();
	cheesebtn.validatingCheeseRadiobutton();
}
@Test(priority=4,description="validating water radio button page Test")
public void validatingWaterRadiobutton()
{
	RadioButtonPage waterbtn=new RadioButtonPage();
	waterbtn.validatingWaterRadiobutton();
}
@Test(priority=5,description="Validating beer radio button page Test")
public void validatingBeerRadiobutton()
{
	RadioButtonPage beerbtn=new RadioButtonPage();
	beerbtn.validatingBeerRadiobutton();
}
@Test(priority=6,description="validating wine radio button page Test")
public void validatingWineRadiobutton()
{
	RadioButtonPage winebtn=new RadioButtonPage();
	winebtn.validatingWineRadiobutton();
}
	
}


