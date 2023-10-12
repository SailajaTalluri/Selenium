package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
//Identify the file (Excel)in the system
FileInputStream testDataFile=new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		
//Identify the workbook of the file
XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);

//Identify the Particular Sheet in the WorkBook
XSSFSheet testDataSheet=workBook.getSheet("TestData");

//Identify the Row in the Sheet
Row testDataSheetRow=testDataSheet.getRow(0);

//Identify the Row of a cell-in the Row 
Cell testDataSheetRowOfCell=testDataSheetRow.getCell(0);

//Get the data from the Row of a Cell
String testData=testDataSheetRowOfCell.getStringCellValue();

System.out.println(testData);

}

}
