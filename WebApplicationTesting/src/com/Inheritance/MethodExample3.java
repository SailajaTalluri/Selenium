package com.Inheritance;

public class MethodExample3 extends MethodExample2 {
	public void addition1(int var1,int var2)//Method with Parameters
	{
		//local Variables
		//int var1=20;
		//int var2=30;
		int var3;
	var3=var1+var2;
	System.out.println("The value of the variable var3 after addition is:-"+var3);
	}
	
	public void division() // default method
	{
		//Exception Handling
		try
		{
			int var1=20;
			int var2=30;
			int var3;
			 var3=var1/var2;
			 System.out.println("The Value of the variable var3 after division is:-"+var3);
			 
		}
		catch(Exception exceptionErrorMessage)
		{
			System.out.println("The exception is :-"+exceptionErrorMessage);
		}
	}
public static void main(String[] args) {
	
	MethodExample3 m3=new MethodExample3();
	m3.division();
	m3.addition();
	m3.multiplication();
}
}
