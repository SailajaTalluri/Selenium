package com.Arrays;

public class SingleDimensionalArrayExample {

	public static void main(String[] args) {
//Array is capable of storing multiple values//
	    /*int var=20;
		var=30;
		System.out.println(var);*/
		
		int array1[]=new int[4];
		array1[0]=30;
		array1[1]=30;
		array1[2]=40;
		array1[3]=50;
		/*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		*/
		
	    // for(int arrayindex=0;arrayindex<=4;arrayindex++);
		
		  for(int arrayIndex=0;arrayIndex<array1.length;arrayIndex++)
		  
		{
			  
		  // System.out.println(arrayIndex+array1[0]);
		
		  // System.out.println(arrayIndex+" "+array1[0]);
		   
		  System.out.println(arrayIndex+" "+ array1[arrayIndex]);
		
		}
	}
}
	


