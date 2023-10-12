package com.TimeAndDate;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class CapturingCityName extends WebApplication {

public void capturingCityName()
{
// System.out.println(" Laddu ");

// Xpath is of 2 Types
// 1. absolute xpath - always starts with html tag
// 2. Relative xpath - always starts with //

// When no properties are found for the inspected element then the
// locator - Xpath
// selector -(xpath Expression) /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

By cityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
WebElement cityName=driver.findElement(cityNameProperty);

String cityNameText=cityName.getText();
System.out.println(" The cityName is :- "+cityNameText);

}

public static void main(String[] args) {

/*
WebApplication app = new WebApplication();
app.applicationLaunch();

CapturingCityName city = new CapturingCityName();
city.capturingCityName();

app.applicationClose();

*/

CapturingCityName city = new CapturingCityName();
city.applicationLaunch();
city.capturingCityName();
city.applicationClose();


}

}
