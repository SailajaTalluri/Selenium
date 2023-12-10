package com.CoreJavaBasics;

public class Patternprograms_Logic1 {
public static void main(String[] args) {
	for (int i=1;i<=7;i++) {
		for (int j=1;j<=7;j++) {
			if(i==1||i==7||j==1||j==7||i==j||j==8-i)
				System.out.print("+");
			else
				System.out.print(" ");
		}
	System.out.println();
}	
}
}

class Patternprogram_Logic2
{
public static void main(String[] args) {
	for (int i=1;i<=5;i++)
	{
	for (int j=1;j<=5;j++)
	{
	 System.out.print(j);	
	}
 System.out.println();
}	
}
}

class Patternprogram_logic3
{
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
		}
	}
}
}

class patternprogram_logic4
{
	public static void main(String[] args)
	{
		int n=7;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++) 
			{
				if (i==1 || i==n || j==1 || j==i)
					System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
			}
		}
	}

class patternprogram_logic5
{
	public static void main(String[] args) 
	{
		for (int i=0;i<=9;i++) //The i value is 0 to 9 values printed
		{
			for(int j=5;j<=9;j++) //suppose j value is 5 and j value is decreased by 9
			{
				System.out.print(i);
			}
		System.out.println();
	}		
	}
	}



class patternprogram_logic6
{
	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


class patternprogram_logic7
{
	public static void main(String[] args) {
		for (int i=5;i>=1;i--)
		{
			for (int j=5;j>=1;j--)
			{
				System.out.print(j);				
			//	System.out.print(i);
			}
			System.out.println();
		}
	}
}


class patternprogram_logic8
{
	public static void main(String[] args) {
		for (int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(i);
				
			}
			System.out.println();
		}
	}
}

class patternprogram_logic9
{
	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j%2);
			}
		System.out.println();
		}
	}
}

class patternprogram_logic10
{
	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i%2); //Calculate the i value with percentage
			}
		System.out.println();
		}
	}
}



