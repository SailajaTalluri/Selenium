package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingFirstColumnData_Excel extends BaseTest {

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

	FileInputStream WebTableExcelFile = new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(WebTableExcelFile);
	XSSFSheet webTableSheet = workBook.getSheet("TestData1");

	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{

	// By cityNameProperty=By.xpath
	//("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td[1]");

	By cityNameProperty=By.xpath(xpathExpression1+rowIndex+xpathExpression2);

	WebElement cityName=driver.findElement(cityNameProperty);

	String cityNameText=cityName.getText();
	System.out.println(rowIndex+" "+cityNameText);

	// Creating a Row
	Row newRow=webTableSheet.createRow(rowIndex);

	// creating  Row of a Cell
	Cell newRowOfNewCell=newRow.createCell(0);

	newRowOfNewCell.setCellValue(cityNameText);

	}

	FileOutputStream webTableExportResults = new FileOutputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
	workBook.write(webTableExportResults);

	}

	public static void main(String[] args) throws IOException {

	WebTable_CapturingFirstColumnData_Excel cityNamesList = new WebTable_CapturingFirstColumnData_Excel();

	cityNamesList.applicationLaunch();
	cityNamesList.CapturingFirstColumnData();
	cityNamesList.applicationClose();
	}

	}

