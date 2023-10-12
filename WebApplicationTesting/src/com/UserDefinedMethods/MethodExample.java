package com.UserDefinedMethods;

public class MethodExample {
	public void chello()
	{
		System.out.println("Students its time to go HOME");
	}

public static void main(String[] args) {
MethodExample srini=new MethodExample();
//Creating an object for the Current java class srini.hello();
//Calling the user-defined method to perform the operation
srini.hello();
 
//MethodExample vasu=new MethodExample();
//vasu.chello();
srini.chello();

srini.hello();
srini.hello();

	}
	//user-Defined Methods are created for Re-Usability purpose
	public void hello()
	{
		System.out.println("Hello My Dear Students");
		
	}

}
