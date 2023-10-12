package com.Arrays;

public class ObjectArrayExample {

	public static void main(String[] args) {
		// Object array is capable of storing different dataType values

		Object array1[] = new Object[4];

		array1[0]=10;
		array1[1]="Hello";
		array1[2]='A';
		array1[3]=20.1234;

		/*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		*/
		for(int index=0;index<array1.length;index++)
		{
		System.out.println(array1[index]);
		}

		System.out.println();

		System.out.println(" ************* For Each Loop ************* ");

		for(Object index: array1)
		{
		System.out.println(index);
		}
		}
        }


