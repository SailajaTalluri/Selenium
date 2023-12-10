package com.CoreJavaBasics;

public class BasicPatternwithConditions {
public static void main(String[] args) {
for (int i=1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		if(i%2==0)
		System.out.print("#");
		else
			System.out.print("$");
}
System.out.println(); //The output is rows wise printed (__)
}
}
}


class BasicPatternwithConditions1 {
public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j%2==0)
				System.out.print("#");
				else
					System.out.print("$");
		}
		System.out.println(); //The output is Columns wise printed (|) 
		}
		}
		}


class BasicPatternwithConditions2
{
	public static void main(String[] args) {
	int k=1;
	for (int i=1;i<=5;i++) {
		for (int j=1;j<=5;j++) {
			System.out.print(k++%10);
		}
	System.out.println();
}
}
}


class BasicPatternwithConditions3
{
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
		if(i%2==0)
			System.out.print(j);
		else
			System.out.print(i);
		}
	System.out.println();
}
}
}

class BasicPatternwithConditions4
{
	public static void main(String[] args) {
		for (int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
		if(i%2==0)
			System.out.print(j);
		else
			System.out.print(i);
		}
	System.out.println();
}
}
}

