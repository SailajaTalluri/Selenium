package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		//Identify the file (Excel)in the system
		FileInputStream testDataFile=new FileInputStream("./src/com/ExcelFiles/Excel_Read_MultipleTestData.xlsx");
				
		//Identify the workbook of the file
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);

		//Identify the Particular Sheet in the WorkBook
		XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
	
       
		//Identifying the number of Active Rows
		int rowCount = testDataSheet.getLastRowNum();
		
		//To goto an Active Row
		for (int rowIndex=0;rowIndex<=rowCount;rowIndex++)
		{
	//To goto an Active Row in the Sheet
			Row testDataSheetRow=testDataSheet.getRow(rowIndex);
		
			//Identifying the Number of activeRow of all the activeCells
			int sheetRowOfCellsCount=testDataSheetRow.getLastCellNum();
			
			//To goto every ActiveRow of All the active cells - to get the data
			for (int rowOfCellIndex=0;rowOfCellIndex<sheetRowOfCellsCount;rowOfCellIndex++)
			{
				//Going to an Active Row of an Active Cell
				Cell rowOfCell=testDataSheetRow.getCell(rowOfCellIndex);
				String data=rowOfCell.getStringCellValue();  //get the data from the row of cell
				System.out.println(data+"|");
			}
		
		System.out.println();
	}

}
}