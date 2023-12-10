package com.CoreJavaBasics;
public class PatternPlusCrossSwastiska 
{
public static void main(String[] args) 
{
    for (int i=1;i<=7;i++) 
    {
    	for(int j=1;j<=7;j++) 
    	{
		System.out.print("+");
    	}
    	System.out.println();
}
}
}

class PatternPlusCrossSwastiska1
{
public static void main(String[] args) {
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=7;j++) {
			if(i==1||i==7||j==1||j==7)
		System.out.print("+");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}


class PatternPlusCrossSwastiska2
{
public static void main(String[] args) {
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=7;j++) {
			if(i==4||j==4)
		System.out.print("+");
			else
				System.out.print(" ");
		}
		System.out.println();
}
}
}


class PatternPlusCrossSwastiska3
{
	public static void main(String[] args) {
		for (int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1||i==4||i==7||j==1||j==4||j==7)
				System.out.print("+");
				else
					System.out.print(" ");
			}
	System.out.println();
		}
	
	}
}


class PatternPlusCrossSwastiska4
{
	public static void main(String[] args) {
		
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=7;j++) {
			if(i==j)
			System.out.print("+");
			else
				System.out.print(" ");
		}
		System.out.println();
}
}
}


class PatternPlusCrossSwastiska5
{
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(j==8-i)
					System.out.print("+");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}


class PatternPlusCrossSwastiska6
{
	public static void main(String[] args) {
		for (int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==j||j==8-i)
					System.out.print("+");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}


class PatternPlusCrossSwastiska7
{
	public static void main(String[] args) {
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=7;j++) {
			if(i==1||i==7||j==1||j==7||i==j||j==8-i)
				System.out.print("+");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}


class PatternPlusCrossSwastiska8
{
	public static void main(String[] args) {	
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=7;j++) {
		if((i==1&&j<=4)||j==4||(i==7&&j>=4))
			System.out.print("+");
		else 
			System.out.print(" ");
		}
		System.out.println();
	}
}
}

class PatternPlusCrossSwastiska9
{
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==4||(j==1 && i>=4)||(j==7 && i<=4))
				System.out.print("+");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}


class PatternPlusCrossSwastiska10
{
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==4||(j==1 && i>=4)||(j==7 && i<=4)||(i==1 &&j<=4)||j==4||(i==7 && j>=4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

class PatternPlusCrossSwastiska11
{
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==4||j==7||i==1||(j==1 && i>=4)||(j==7 && i<=4)||(i==1 &&j<=4)||j==4||i==7||j==1||(i==7 && j>=4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}


class PatternPlusCrossSwastiska12
{
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==4||i==7||j==1||j==7||i==1||(j==1 && i>=4)||(j==7 && i<=4))
				System.out.print("+");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

class PatternPlusCrossSwastiska13
{
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==3||j==1||i==5||j==7||(i==1&&i>=4)||(j==1&&j<=4))
				System.out.print("+");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}