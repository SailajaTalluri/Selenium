package com.CoreJavaBasics;

public class Patterns {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++);
				if(k>9)
					k=1;
			}
			System.out.println();
			}
		}
	}

class Patterns1{
	public static void main(String[] args) {
		int k=1;
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++);
				if(k>9)
					k=1;
			}
			System.out.println();
			}
		}
	}


class Patterns2 
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
					System.out.print(k);
			}
			System.out.println();
			}
	}
}
	
class Patterns3 
{
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
					System.out.print(k);
			}
			System.out.println();
			}
	}
}

class Patterns4 
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
					System.out.print(k);
			}
			System.out.println();
			}
	}
}

class Patterns5
{
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
					System.out.print(k);
			}
			System.out.println();
			}
	}
}

class Patterns6 
{
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
					System.out.print(k);
			}
			System.out.println();
			}
	}
}


class Patterns7
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
					System.out.print(k);
			}
			System.out.println();
			}
	}
}