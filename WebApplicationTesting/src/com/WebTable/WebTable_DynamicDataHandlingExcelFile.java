package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_DynamicDataHandlingExcelFile extends BaseTest{

	public void dynamiceWebTable() throws IOException
	{
		
		FileInputStream webTableExcelFile = new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(webTableExcelFile);
		XSSFSheet webTableSheet = workBook.getSheet("TestData3");
		
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
		// Creating a Row
        Row newRow=webTableSheet.createRow(rowIndex);

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
	
	//Creating Row of a Cell
    Cell newRowOfNewCell=newRow.createCell(rowOfCellIndex);
    newRowOfNewCell.setCellValue(webTableData);
	}
	System.out.println();
	}
	FileOutputStream webTableDataExportResults=new FileOutputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
	workBook.write(webTableDataExportResults);
	}
    public static void main(String[] args) throws IOException {
    	WebTable_DynamicDataHandlingExcelFile webTableData=new WebTable_DynamicDataHandlingExcelFile();
    	webTableData.applicationLaunch();
    	webTableData.dynamiceWebTable();
		webTableData.applicationClose();
	}
	}


