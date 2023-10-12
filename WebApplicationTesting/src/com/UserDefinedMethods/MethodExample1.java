package com.UserDefinedMethods;

public class MethodExample1 {
public void addition()
{
	int var1=20;
	int var2=30;
	int var3;
	
	var3=var1+var2;
	System.out.println("The value of the variable var3 after addition is :-"+var3);
	
}
	public static void main(String[] args) {
MethodExample1 m1=new MethodExample1();
m1.addition();

m1.substraction();

m1.addition();
	}

	//Names of the User-defined methods should be unique
	private void substraction()
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1-var2;
		System.out.println("The value of the variable var3 after substraction is :-"+var3);
	}

	}

