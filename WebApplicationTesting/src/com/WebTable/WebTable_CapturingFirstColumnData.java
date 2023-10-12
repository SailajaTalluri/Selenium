package com.WebTable;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class WebTable_CapturingFirstColumnData extends BaseTest {

public void CapturingFirstColumnData() throws IOException
{

// first Row of First Column
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
// 2nd Row of 1st column/cell
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
// last Row of first column/cell
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]

// tr - table Row
// td - table data /row of cell

String xpathExpression1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
String xpathExpression2="]/td[1]";


for(int rowIndex=1;rowIndex<=36;rowIndex++)
{

// By cityNameProperty=By.xpath
//("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td[1]");

By cityNameProperty=By.xpath(xpathExpression1+rowIndex+xpathExpression2);

WebElement cityName=driver.findElement(cityNameProperty);

String cityNameText=cityName.getText();
System.out.println(rowIndex+"  "+cityNameText);

}

}
public static void main(String[] args) throws IOException {

WebTable_CapturingFirstColumnData cityNamesList = new WebTable_CapturingFirstColumnData();

cityNamesList.applicationLaunch();
cityNamesList.CapturingFirstColumnData();
cityNamesList.applicationClose();
}

}
		
		
		
	
	


