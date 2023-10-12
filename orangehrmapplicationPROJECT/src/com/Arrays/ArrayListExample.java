package com.Arrays;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {

public static void main(String[] args) {
		List<Object>arrayListName = new ArrayList<>();

		arrayListName.add(10);
		arrayListName.add("Selenium");
		arrayListName.add(20.456);
		arrayListName.add('C');


		/*
		System.out.println(arrayListName.get(0));
		System.out.println(arrayListName.get(1));
		*/
		

		for(int index=0;index<arrayListName.size();index++)
		{
		System.out.println(arrayListName.get(index));
		}

		System.out.println();
		System.out.println(" ******** For Each Loop *********** ");
		System.out.println();

		for(Object index:arrayListName)
		{
		System.out.println(index);
		}
        }
        }


