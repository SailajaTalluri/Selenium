package com.CoreJavaBasics;

public class CharactersTrianglePatterns {

	public static void main(String[] args) {
		for (char i='A';i<='E';i++) {
			for (char j='A';j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

class CharactersTrianglePatterns1 {
public static void main(String[] args) {
	for(char i='A';i<='E';i++) {
		for(char j='A';j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}


class CharactersTrianglePatterns2 {
public static void main(String[] args) {
	for(char i='A';i<='E';i++) {
		for(char j=i;j>='A';j--) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}

class CharactersTrianglePatterns3 {
public static void main(String[] args) {
	for(char i='E';i>='A';i--) {
		for(char j='A';j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}

class CharactersTrianglePatterns4 {
public static void main(String[] args) {
	for(char i='A';i<='E';i++) {
		for(char j=i;j<='E';j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}

class CharactersTrianglePatterns5 {
public static void main(String[] args) {
	for(char i='E';i>='A';i--) {
		for(char j='E';j>=i;j--) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}

class CharactersTrianglePatterns6 {
public static void main(String[] args) {
	for(char i='E';i>='A';i--) {
		for(char j=i;j<='E';j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}

class CharactersTrianglePatterns7 {
public static void main(String[] args) {
	for(char i='A';i<='E';i++) {
		for(char j='E';j>=i;j--) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}

class CharactersTrianglePatterns8 {
public static void main(String[] args) {
	for(char i='E';i>='A';i--) {
		for(char j=i;j>='A';j--) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}

