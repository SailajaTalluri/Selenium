package com.ConditionalStatements;

public class NestedIf_Example {

	public static void main(String[] args) {
//	 Syntax:-   If (condition) is True (condition satisfies)
//		         {
//              statement/statements;_optional	    	      
//               If(Condition) is False Block
//	                {	
//	               statement/statements;
//	                 }	
//             }		
// Data type Variable name = variable value;
		int var1=45;
		int var2=40;
		int var3=35;
		if(var1>var2)
		{
			System.out.println("var1 is greater than var2");
			if(var1==var3)
			{
				System.out.println("Actual Statement var1 is greater than var3 so false statement");
		}
			System.out.println("Testing Tools");
		}
}
}

  class NestedIf_Example1 {

	public static void main(String[] args) {
//	 Syntax:-   If (condition) is True (condition satisfies)
//		         {
//              statement/statements;_optional	    	      
//               If(Condition) is False Block
//	                {	
//	               statement/statements;
//	                 }	
//             }		
// Data type Variable name = variable value;
		int var1=40;
		int var2=20;
		int var3=40;
		System.out.println("Hello Students");
		if(var1>var2)
		{
			System.out.println("LiveTech");
			if(var1>var3)
			{
		System.out.println("Web Driver"); //false block //
		}
			System.out.println("Testing Tools");
		}
}
}

  class NestedIf_Example2 {

		public static void main(String[] args) {

			int var1=40;
			int var2=20;
			int var3=40;
			System.out.println("Hello Students");
			if(var1>var2)    //true block//
			{
				System.out.println("LiveTech");
				if(var1==var3)
				{
			System.out.println("Web Driver"); //true block //
			}
				System.out.println("Testing Tools");
			}
	}
	}
  
  
  class NestedIf_Example3 {

		public static void main(String[] args) {

			int var1=30;
			int var2=20;
			int var3=40;
			System.out.println("Hello Students");
			if(var2>var1)    //false block//
			{  //total conditions block//
				System.out.println("LiveTech");
				if(var1==var3)
				{
			System.out.println("Web Driver"); //true block //
			}
				System.out.println("Testing Tools");
			}
	}
	}  

	

  class NestedIf_Example4 {

		public static void main(String[] args) {

			int var1=40;
			int var2=20;
			int var3=40;
			System.out.println("Hello Students");
			if(var1>var2)    //true block//
			{  
				System.out.println("LiveTech");
				if(var1==var3)
				{
			System.out.println("Web Driver"); //true block //
			}
				System.out.println("Selenium");
			}
			System.out.println("Testing");
	
		}
  }
  
  
  class NestedIf_Example5 {

		public static void main(String[] args) {
			
			int var1=40;
			int var2=20;
			int var3=40;
			
			System.out.println(" Hello Students");
			
			if(var1>var2)
			{
				System.out.println(" LiveTech ");
				if(var1==var3)
				{
					System.out.println(" WebDriver ");
				}
				System.out.println(" Selenium ");
			}
			
			System.out.println(" Testing ");
		}
	}
		
  
		
		
		
	
		 