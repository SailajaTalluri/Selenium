package com.CoreJavaBasics;

public class StarTrianglePatterns {
public static void main(String[] args) {
  for(int i=1;i<=5;i++) {
	  for(int j=1;j<=i;j++) {
		  System.out.print("*");
	  }
	  System.out.println();
  }

	}

}

class StarTrianglePatterns1 
{
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print("*");
		  }
		  System.out.println();
		  }
}

}
	
class StarTrianglePatterns2
{
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		  for(int j=i;j<5;j++) {
			  System.out.print(" ");
		  }
		  for (int k=1;k<=i;k++) {
		  System.out.print("*");
		  }
System.out.println();
}
}
}
	

class StarTrianglePatterns3
{
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		  for(int j=1;j<i;j++) {
			  System.out.print(" ");
		  }
		  for (int k=i;k<=5;k++) {
		  System.out.print("*");
		  }
System.out.println();
}
}
}	

class StarTrianglePatterns4
{
public static void main(String[] args) {
	for(int i=1;i<10;i++) {
		if(i<=5) {
		  for(int j=1;j<=i;j++) {
			  System.out.print("*");
		  }
		  System.out.println();
		}
		else {
			for (int k=i;k<10;k++) {
				
		  System.out.print("*");
		  }
     System.out.println();
}
}
}
}


class StarTrianglePatterns5
{
public static void main(String[] args) {
	for(int i=1;i<10;i++) {
		if(i<=5) {
			for(int x=1;x<=5;x++) {
				System.out.print(" ");
			}
		  for(int j=1;j<=i;j++) {
			  System.out.print("*");
		  }
		  System.out.println();
		}
		else {
			
			for(int x=i;x>=5;x++) {
				System.out.print(" ");
			}
			
			for (int k=i;k<10;k++) {
		      System.out.print("*");
		   }
     System.out.println();
}
}
}
}

class StarTrianglePatterns6
{
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
		if(i<=5) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
	}
			System.out.println();
		}
		else {
			for(int k=5;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}	
	}

class StarTrianglePatterns7
{
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
		if(i<=5) {
			for(int x=1;x<=i;x++) {
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++) {
				System.out.print("*");
	}
			System.out.println();
		}
		else {
			for(int x=i;x<10;x++) {
				System.out.print(" ");
			}
			for(int k=5;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}	
	}


class triangle {
	public static void main(String[] args) {
		for (int i=5;i>=1;i--) {
			for (int j=5-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
		System.out.print(j);
			}
	System.out.println();
		}
}
}



