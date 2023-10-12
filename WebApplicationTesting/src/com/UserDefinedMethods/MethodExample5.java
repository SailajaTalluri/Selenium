package com.UserDefinedMethods;

public class MethodExample5 {

	
int var1=70; //Global/Instance Variable
int var2=80; //Global/Instance Variable

public void addition1() //Method without Parameters
{    //Local Variables
	int var1=20;
	int var2=30;
	int var3;
	var3=var1+var2;
	System.out.println("The value of the Variable var3 after addition is :-" +var3);
	
}
public void addition1(int var1,int var2) // Method with Parameters

{
	//int var1=20;
	//int var2=30;
	int var3;
	var3=var1+var2;
	System.out.println("The value of the variable var3 after addition is:-" +var3);	
}

//Method OverLoading-Names of the Methods are similar but with different method Signature
 
public void addition1(int var1,double var2,int var3) //Method OverLoading
{
	double var4;
	var4=var1+var2+var3;
	System.out.println("The value of the variable var4 after addition is:-" +var4);
}

public static void main(String[] args) {
	MethodExample5 m5=new MethodExample5();
	m5.addition1(); //Method Without Parameters
	m5.addition1(); //Method Without Parameters
	m5.addition1(100,200); //When the Method with parameters is called - We provide the values of the Variables
	m5.addition1(150,550);
	m5.addition1(10, 20.123, 30);
	m5.addition2();
	
}
public void addition2()
{
	int var3;
	//var2=60;
	//var1=80;
	var3=var1+var2; //These variables will take the values from the Global Variables
	System.out.println("The value of the variable var3 after addition is:-" +var3);
	
}
}
