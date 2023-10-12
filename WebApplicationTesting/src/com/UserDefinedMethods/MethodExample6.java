package com.UserDefinedMethods;

public class MethodExample6 {
	public static void main(String[] args) {
		System.out.println("*******MethodExample1 Java class*******");
		MethodExample1 m1=new MethodExample1();
		m1.addition();
		System.out.println();
		
		System.out.println("*******MethodExample2 Java Class*******");
		MethodExample2 m2=new MethodExample2();
		m2.multiplication();
		System.out.println();
		
		System.out.println("*******MethodExample3 Java class*******");
		MethodExample3 m3=new MethodExample3();
		m3.division();
		System.out.println();
		
		System.out.println("*******MethodExample5 Java Class*******");
		MethodExample5 m5=new MethodExample5();
		m5.addition1(30, 40, 50);
		System.out.println();
		
		System.out.println("*******MethodExample5 Java Class*******");
		m5.addition1(90, 200);
		System.out.println();
		
	}

}
