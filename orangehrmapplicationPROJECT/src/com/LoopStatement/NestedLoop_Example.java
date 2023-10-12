package com.LoopStatement;

public class NestedLoop_Example {

	public static void main(String[] args) {
		
		// outer loop
				for(int index1=1;index1<=3;index1=index1+1)
				{
					// inner loop
					for(int index2=0;index1>=index2;index2++)
					{
						System.out.println(" Testing ");
					}
				}
				
				System.out.println(" **********  2  ********** ");
				System.out.println();
				//outer loop
				for(int i=1;i<=3;i++)
				{
					//inner loop
					for(int j=0;j<i;j++) 
					{
						System.out.println(j);       
					}
				}
				
			}
		}


class NestedLoop_Example1 {

	public static void main(String[] args) {
		//outer loop
		for(int index1=1;index1<=3;index1=index1+1)
		{
			// inner loop
			for(int index2=0;index1>=index2;index2++)
			{
				System.out.println(" Testing ");
			}
		}
	}
}

class NestedLoop_Example2 {

	public static void main(String[] args) {
		
		//outer loop
		for(int i=1;i<=3;i++)
		{
			//inner loop
			for(int j=0;j<i;j++) 
			{
				System.out.println(j);       
			}
		}
		
	}
}
	
	
		


