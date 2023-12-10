package com.CoreJavaBasics;
public class BasicCharacterPatterns {
public static void main(String[] args) {
	for (char i='A';i<='E';i++) {
		for(char j='A';j<='E';j++) {
	System.out.print(i); // calculate the A to E below characters will printed 
		}                 //i value characters are printed to Rows (__)
System.out.println();
}
}
}

 class BasicCharacterPatterns1 {
	 public static void main(String[] args) {
		for(char i='A';i<='K';i++) {
			for(char j='A';j<='K';j++) {
				System.out.print(j); //calculate the A to K alphabets below characters will printed
			}
		System.out.println(); //j value characters are printed to columns (|)
		}
	}
 }
 
 class BasicCharacterPatterns2
 {
	 public static void main(String[] args) {
		for (char x='E';x>='A';x--) {
			for(char y='E';y>='A';y--) {
				System.out.print(x);
			}
		System.out.println();
		}
	}
 }
 
 
 class BasicCharacterPatterns3
 {
	 public static void main(String[] args) {
		for (char x='E';x>='A';x--) {
			for(char y='E';y>='A';y--) {
				System.out.print(y);
			}
		System.out.println();
		}
	}
 }