package com.Arrays;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {

		String array1[][] = new String[2][2];

		array1[0][0] = "Venkat Sir";
		array1[0][1] = "Manual Testing";

		array1[1][0] = "Srini";
		array1[1][1] = "Automation Testing";

		//array1[2][1] = "Performance Testing";

		//System.out.println(array1[1][1]);
		//System.out.println(array1[0][0]);

		System.out.println();

		// to goto every Row
		for(int rowIndex=0;rowIndex<=1;rowIndex++)
		{
		// to goto every Row of all its Cells
		for(int rowOfCellIndex=0;rowOfCellIndex<=1;rowOfCellIndex++)
		{
		System.out.print(array1[rowIndex][rowOfCellIndex]+" | ");
		}
		System.out.println();
		}
		}
        }




