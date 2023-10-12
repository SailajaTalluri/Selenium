package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingCompleteWebTableData_Excel extends BaseTest {

	public void CapturingCompleteWebTableData() throws IOException
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
		String xpathExpression2="]/td[";
		String xpathExpression3="]";
		
	FileInputStream webTableExcelFile = new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(webTableExcelFile);
	XSSFSheet webTableSheet = workBook.getSheet("TestData2");

	// for Row's
	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
        // Creating a Row
        Row newRow=webTableSheet.createRow(rowIndex);
	
		//Row of Cell's
		for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
		{	
	        
			By tableDataProperty=By.xpath(xpathExpression1+rowIndex+xpathExpression2+rowOfCellIndex+xpathExpression3);
	        WebElement tableData=driver.findElement(tableDataProperty);
	         
	         String tableDataText=tableData.getText();
	         System.out.println(tableDataText+"  |  ");  
		     
		     System.out.println();
	
  
	         //Creating Row of a Cell
	         Cell newRowOfNewCell=newRow.createCell(rowOfCellIndex);
	         newRowOfNewCell.setCellValue(tableDataText);
	          
	     }
	
		
		FileOutputStream webTableExportResults=new FileOutputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		workBook.write(webTableExportResults);
	      }  
	      }
	
	public static void main(String[] args) throws IOException {

	WebTable_CapturingCompleteWebTableData_Excel webtableData = new WebTable_CapturingCompleteWebTableData_Excel();

	webtableData.applicationLaunch();
	webtableData.CapturingCompleteWebTableData();
	webtableData.applicationClose();
	}

	}

	

