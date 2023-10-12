package com.StringsCompare;

public class StringsCompareExample {

	public static void main(String[] args) {
		String string1="LiveTech";
		String string2="LiveTech";

		if(string1.equals(string2))
		{
		System.out.println(" string1 variable value is similar to string2 variable value ");
		}
		else
		{
		System.out.println("string1 variable value is NOT similar to string2 variable value ");
		}

		System.out.println();

		String string3="LiveTech";
		String string4=" LiveTech";

		if(string3.equals(string4))
		{
		System.out.println(" string3 variable value is similar to string4 variable value ");
		}
		else
		{
		System.out.println("string3 variable value is NOT similar to string4 variable value ");
		}

		System.out.println();

		String string6="LiveTech";
		String string7="Livetech";

		if(string6.equals(string7))
		{
		System.out.println(" string6 variable value is similar to string7 variable value ");
		}
		else
		{
		System.out.println("string6 variable value is NOT similar to string7 variable value ");
		}

		System.out.println();

		String string8="LiveTech";
		String string9="Livetech";
		if(string8.equalsIgnoreCase(string9))
		{
		System.out.println(" string8 variable value is similar to string9 variable value ");
		}
		else
		{
		System.out.println("string8 variable value is NOT similar to string9 variable value ");
		}


		String string10="LiveTech";
		String string10LowerCaseLetters=string10.toLowerCase();
		System.out.println(" The string10 variable value after conveting to Lower Case letters is :-  "+string10LowerCaseLetters);

		String string11="Livetech";
		String string11UpperCaseLetters=string11.toUpperCase();
		System.out.println(" The string11 variable value after conveting to Lower Case letters is :-  "+string11UpperCaseLetters);

		if(string10.toLowerCase().equals(string11.toUpperCase()))
		{
		System.out.println(" Both the Strings are Equal ");
		}
		else
		{
		System.out.println(" Both the Strings are NOT Equal ");
		}

		System.out.println();

		if(string10.toLowerCase().equalsIgnoreCase(string11.toUpperCase()))
		{
		System.out.println(" Both the Strings are Equal ");
		}
		else
		{
		System.out.println(" Both the Strings are NOT Equal ");
		}


		String string12="LiveTech";
		String string13="Tech";

		if(string12.contains(string13))
		{
		System.out.println(" String Existing ");
		}
		else
		{
		System.out.println( " String Not Found ");
		}

		char string14=string12.charAt(4);
		System.out.println(" The index character value is :- "+string14);

		System.out.println();

		System.out.println(string12.charAt(4));

		int ascii_ValueOfStringIndex=string12.charAt(4);

		System.out.println(ascii_ValueOfStringIndex);

		int string12CharactersCount=string12.length();
		System.out.println(" The number of characters of the the String varible string12 is :- "+string12CharactersCount);

		if(string1.length() == string2.length())
		{
		System.out.println(" Number of characters of the Strings are Same ");
		}
		else
		{
		System.out.println("Number of characters of the Strings are NOT Same ");
		}
    	}
        }



class StringsCompareExample1 {

public static void main(String[] args) {
		String string1="LiveTech";
		String string2="LiveTech";
// "LiveTech" is equals to "LiveTech" //
		//"LiveTech" is same characters//
		if(string1.equals(string2))
		{
		System.out.println(" string1 variable value is similar to string2 variable value ");
		}
		else
		{
		System.out.println("string1 variable value is NOT similar to string2 variable value ");
		}
	}
	}



class StringsCompareExample2 {

public static void main(String[] args) {
		String string3="LiveTech";
		String string4=" LiveTech";
        // LiveTech NOT similar to LiveTech //
		// "LiveTech"  = " LiveTech" is difference to spaces in " LiveTech"//
		if(string3.equals(string4))
		{
		System.out.println(" string3 variable value is similar to string4 variable value ");
		}
		else
		{
		System.out.println("string3 variable value is NOT similar to string4 variable value ");
		}
	}
	}


	
class StringsCompareExample3 {

public static void main(String[] args) {
		String string6="LiveTech";
		String string7="Livetech";
  //string6 variable value is NOT similar to string7 variable value //
		//LiveTech = Livetech//
		//LiveTech (T) is Upper case value = Livetech (t) is Lower case value//
		if(string6.equals(string7))
		{
		System.out.println(" string6 variable value is similar to string7 variable value ");
		}
		else
		{
		System.out.println("string6 variable value is NOT similar to string7 variable value ");
		}
	}
		}
		
		
class StringsCompareExample4 {

public static void main(String[] args) {
		String string8="LiveTech";
		String string9="Livetech";
		//"LiveTech" is similar to "Livetech"//
		//"LiveTech" = "Livetech"//
		if(string8.equalsIgnoreCase(string9))
		{
		System.out.println(" string8 variable value is similar to string9 variable value ");
		}
		else
		{
		System.out.println("string8 variable value is NOT similar to string9 variable value ");
		}
       }
	
	}
	
	



class StringsCompareExample5 {

public static void main(String[] args) {
		String string10="LiveTech";
		String string10LowerCaseLetters=string10.toLowerCase();
		//"LIVETECH" Upper case letters is converting into Lower Case Letters is - "livetech"//
		
		System.out.println(" The string10 variable value after conveting to Lower Case letters is :-  "+string10LowerCaseLetters);

	}
}


class StringsCompareExample6 {

public static void main(String[] args) {
		String string11="livetech";
		String string11UpperCaseLetters=string11.toUpperCase();
		// "livetech" Lower case letters is converting into Upper case Letters is - "LIVETECH" //
		
		System.out.println(" The string11 variable value after conveting to Lower Case letters is :-  "+string11UpperCaseLetters);
	}
}
		
  
		

class StringsCompareExample7 {

public static void main(String[] args) {
		String string10="LiveTech";
		String string11="Livetech";
	// "LiveTech" characters are NOT equal "Livetech" //
		//"LiveTech"(T) = "Livetech"(t)//
		if(string10.toLowerCase().equals(string11.toUpperCase()))
		{
		System.out.println(" Both the Strings are Equal ");
		}
		else
		{
		System.out.println(" Both the Strings are NOT Equal ");
		}
	}
}



class StringsCompareExample8 {

public static void main(String[] args) {
		String string10="LiveTech";
		String string11="Livetech";
		//"LiveTech" is the Upper Case are equals to "Livetech" Lower case characters are equal //
		if(string10.toLowerCase().equalsIgnoreCase(string11.toUpperCase()))
		{
		System.out.println(" Both the Strings are Equal ");
		}
		else
		{
		System.out.println(" Both the Strings are NOT Equal ");
		}
	}
	}



class StringsCompareExample9 {
public static void main(String[] args) {
	String string12="LiveTech";
	String string13="Tech";
	//"LiveTech" is Existing In "LiveTech" "Tech" is there //
	if(string12.contains(string13))
	{
		System.out.println(" String Existing ");
	}
	else
	{
		System.out.println( " String Not Found ");
	}
	}
	}


class StringsCompareExample10 {

public static void main(String[] args) {
	String string12="LiveTech";
	//"LiveTech"(T) ASCII value is the character value is T :- 84 //
	char string14=string12.charAt(4);
	System.out.println(" The index character value is :- "+string14);

	System.out.println();

	System.out.println(string12.charAt(4));

	int ascii_ValueOfStringIndex=string12.charAt(4);

	System.out.println(ascii_ValueOfStringIndex);
	}
}


class StringsCompareExample11 {

public static void main(String[] args) {
	
	String string1="LiveTech";
	String string2="LiveTech";
    String string12="LiveTech";
    //No of characters in "LiveTech" is 08 characters in string 12 //
    //No of characters in "LiveTech" is 08 characters in string1 and string2 both are same characters //
    
    int string12CharactersCount=string12.length();
	System.out.println(" The number of characters of the the String varible string12 is :- "+string12CharactersCount);

	if(string1.length() == string2.length())
	{
	System.out.println(" Number of characters of the Strings are Same ");
	}
	else
	{
	System.out.println("Number of characters of the Strings are NOT Same ");
	}
	}
    }

