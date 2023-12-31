package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_DynamicDataHandling extends BaseTest {
        
		public void dynamiceWebTable()
		{
		// identifying the WebTable
		// /html/body/div[5]/section[1]/div
		By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div");
		WebElement webTable=driver.findElement(webTableProperty);

		// Identifying the Rows in the WebTable
		// Row Property
		By rowProperty=By.tagName("tr");
		List<WebElement>rows=webTable.findElements(rowProperty);

		// To goto the WebTable - to all the Rows
		for(int rowIndex=0;rowIndex<rows.size();rowIndex++)
		{

		// goto a Row in the WebTable
		WebElement row=rows.get(rowIndex);

		// going to a Row and finding the Number of Row of Cells
		// Cell Property
		By rowOfCellProperty=By.tagName("td");
		List<WebElement>rowOfcells=row.findElements(rowOfCellProperty);

		// to goto a Row -  and to all its respective Cell's
		for(int rowOfCellIndex=0;rowOfCellIndex<rowOfcells.size();rowOfCellIndex++)
		{
		WebElement rowOfCell=rowOfcells.get(rowOfCellIndex);
		String webTableData=rowOfCell.getText();
		System.out.print(webTableData+" | ");
		}
		System.out.println();
		}
		}
        public static void main(String[] args) {
        	WebTable_DynamicDataHandling webTableData=new WebTable_DynamicDataHandling();
        	webTableData.applicationLaunch();
        	webTableData.dynamiceWebTable();
    		webTableData.applicationClose();
		}
		}

