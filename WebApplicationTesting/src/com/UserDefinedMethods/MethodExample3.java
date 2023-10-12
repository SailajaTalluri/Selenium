package com.UserDefinedMethods;

public class MethodExample3 {
	
	protected void division()
	{
	    int var1=20;
		int var2=1;
		int var3;
		
		var3=var1/var2;
		System.out.println("The value of the variable var3 after division is :-" +var3);
	}

	public static void main(String[] args) {
MethodExample3 m3=new MethodExample3();
m3.division();

	}

}
