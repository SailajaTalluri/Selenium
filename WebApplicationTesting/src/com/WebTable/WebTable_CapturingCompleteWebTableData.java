package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingCompleteWebTableData extends BaseTest{

	public void CapturingCompleteWebTableData()
	{
		// First Row of First Cell
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

		// Last Row of Last Cell
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
        
		String xpathExpression1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xpathExpression2="]/td[";
		String xpathExpression3="]";
		//For Row's
		for(int rowIndex=1;rowIndex<=36;rowIndex++)
		{
			//Row of cell's
			for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
			{
				//By tableDataProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellIndex+"]");
             By tableDataProperty=By.xpath(xpathExpression1+rowIndex+xpathExpression2+rowOfCellIndex+xpathExpression3);
             WebElement tableData=driver.findElement(tableDataProperty);
             
             String tableDataText=tableData.getText();
             System.out.print(tableDataText+"  |  ");
             
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		WebTable_CapturingCompleteWebTableData WebTableData=new WebTable_CapturingCompleteWebTableData();
		WebTableData.applicationLaunch();
		WebTableData.CapturingCompleteWebTableData();
		WebTableData.applicationClose();
	}
	
}
