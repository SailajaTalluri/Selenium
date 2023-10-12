package com.JumpStatements;

public class ContinueExample {

	public static void main(String[] args) {
		for(int index=1;index<=5;index++)
		{
			System.out.println(index+" Selenium ");
			
			if(index==3)
			{
				System.out.println(" WebDriver ");
			//break; // its a keyWord - which immediately terminates/Stops the program execution
				continue;
			}
			System.out.println(index+" Testing ");
		}
		
	}
}



class ContinueExample1 {

	public static void main(String[] args) {
		for(int index=2;index<=5;index++)
		{
			System.out.println(index+" Selenium ");
			
			if(index==2)
			{
				System.out.println(" WebDriver ");
				
			    System.out.println(index+ "Program");
			//break; // its a keyWord - which immediately terminates/Stops the program execution
			    continue;
			}
			System.out.println(index+" Testing ");
			
		}
		
	}
}

