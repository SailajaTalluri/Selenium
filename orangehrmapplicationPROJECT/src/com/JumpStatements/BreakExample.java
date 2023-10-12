package com.JumpStatements;

public class BreakExample {

	public static void main(String[] args) {
		
		for(int index=1;index<=5;index++)
		{
			System.out.println(index+" Selenium ");
			
			if(index==3)
			{
				System.out.println(" WebDriver ");
			}
			System.out.println(index+" Testing ");
		}
		
		System.out.println(" ********************************* ");
		System.out.println();
		
		for(int index=1;index<=5;index++)
		{
			System.out.println(index+" Selenium ");
			
			if(index==3)
			{
				System.out.println(" WebDriver ");
			break; // its a keyWord - which immediately terminates/Stops the program execution
			}
			System.out.println(index+" Testing ");
		}
	}

}
		
	
		

class BreakExample1 {

	public static void main(String[] args) {
		for (int index=1;index<=5;index=index+1)
		{
			System.out.println(index+ "selenium");
		}

	}

}



class BreakExample2 {

	public static void main(String[] args) {
		for (int index=1;index<=5;index++)
		{
			System.out.println(index+ "selenium");
			 if (index==3)
			 {
		  System.out.println("WebDriver");
			 }
			 System.out.println(index+ "Testing");
	}
}
}



class BreakExample3 {

	public static void main(String[] args) {
		for (int index=1;index<=5;index++)
		{
			System.out.println(index+ "selenium");
			 if (index==3)
			 {
				 System.out.println("WebDriver");
				 break;
			 }
			 
			 System.out.println(index+ "Testing");
	      
		}
		
		}
}


class BreakExample4 {

	public static void main(String[] args) {
		for (int index=1;index<=5;index++)
		{
			System.out.println(index+ "selenium");
			 if (index==4)
			 {
				 
				 System.out.println("WebDriver");
				 
				 System.out.println(index+ "LiveTech");
				 
				
			 }
			 
			 System.out.println(index+ "Testing");
			 
		}
		
		}
}



