package com.ConditionalStatements;

public class SwitchStatement {

	public static void main(String[] args) {
		// syntax: switch(Initialization,Expression)
		//{
		//case1:
		//statement/statements;
		//break;
		//case2:
		//statement/statements;
		//break;-----
		//default:
		//statement/statements;
	    //}   //data type variable name = variable value //
		int Weekday = 8;
		switch (Weekday)
		{
			case 1: 
			    System.out.println("Sunday");	
			break;
			case 2:
				System.out.println("Monday");
			break;
			case 3:
				System.out.println("Tuesday");
			break;
			case 4:
				System.out.println("wednesday");
			break;
			case 5:
				System.out.println("Thursday");
			break;
			case 6:
				System.out.println("Friday");
			break;
			case 7:
				System.out.println("Saturday");
			break;
		default :
			System.out.println("All Weekdays Should be dispalyed");
			
		}
		}
		}



