package com.ExcelOperations;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperations {

	public static void main(String[] args) throws IOException {
//Identify the File(Excel)in the System
		FileInputStream testDataFile=new FileInputStream("src/com/ExcelFiles/SingleTestData.xlsx");

//Identify the WorkBook of the File
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
	
//Identify a Particular Sheet in the WorkBook
		XSSFSheet testDataSheet=workBook.getSheet("TestData");
		
//Create the Row in the Sheet
		Row newRow=testDataSheet.createRow(3);
		
//Create a Row of a Cell - in the New Row Created
		Cell newRowOfCell=newRow.createCell(5);
	
//Set the data into the New Row of a Cell Created
		newRowOfCell.setCellValue("Selenium");
		
//The Excel file with the workBook Should be saved to the System
		FileOutputStream testResultFile=new FileOutputStream("src/com/ExcelFiles/SingleTestData.xlsx");
		workBook.write(testResultFile);
		
}
}
