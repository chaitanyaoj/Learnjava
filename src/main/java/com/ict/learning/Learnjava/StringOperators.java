package com.ict.learning.Learnjava;

import java.io.PrintStream;

public class StringOperators {

	private static final String Reddy = null;

	public static void main(String[] args) {
		
			String firstName = "Chaitanya";
			String lastName = "Reddy";
			String fullName1 = firstName.concat(lastName);  
		
			// 1 . Java String concat
			System.out.println("Java String Concat:");
			System.out.println("fullName1"+ " - " + fullName1);
			String fullName = (firstName + " " + lastName);
			System.out.println("firstName"+ " - " + firstName);
			System.out.println("lastName"+ " - " + lastName);
			System.out.println("fullName"+ " - " + fullName);
			System.out.println();
		
			// 2 .String Uppercase
			String fullNameUpper = fullName.toUpperCase();  
			System.out.println("Java String Uppercase:");
			System.out.println("fullNameUpper"+ " - " + fullNameUpper);
			System.out.println();
		
			// 3 . String lowercase
			String fullNameLower = fullName.toLowerCase(); 
			System.out.println("Java String Lowercase:");
			System.out.println("fullNameLower"+ " - " + fullNameLower);
			System.out.println();
		
			// 4 .String length
			int fullNameLen = fullName.length(); 
			System.out.println("Java String Lenght:");
			System.out.println("fullNameLen"+ " - " + fullNameLen);
			System.out.println();
		
			// 5 . String Substring start index
			String lastNameStr=fullName.substring(9); 
			System.out.println("Java Substring Start Index:");
			System.out.println("lastNameStr"+ " - " + lastNameStr);
			System.out.println();
		
			// 6 . Substring end index (n-1 )
			String firstNameStr=fullName.substring(0,9); 
			System.out.println("Java Substring End Index:");
			System.out.println("firstNameStr"+ " - " + firstNameStr);
			System.out.println();
		
			// 7 . String charAt
			char firstNameChar = fullName.charAt(0);
			System.out.println("Java String charAt:");
			System.out.println("firstNameChar"+ " - " + firstNameChar);
			System.out.println();
		
			// 8 . Java String contains
			boolean firstNamecontains = fullName.contains(firstNameStr); 
			// to check whether a particular sequence there in a string -- 7
			//in the above example, checking whether the firstname sequence comes in full name
			System.out.println("Java String Contains:");
			System.out.println("firstNamecontains"+ " - " + firstNamecontains);
			System.out.println();
		
			// 9 . JavaStringReplace - replaces chosen character/full string with given input
			String lastNameReplace = lastName.replace('y','i');
			System.out.println("Java String Replace:");
			System.out.println("lastNameReplace" + " - "+ lastNameReplace);
			System.out.println();
		
			// 10 . Java StringStrip removes empty spaces(Returns a string whose value is this string, with all leading and trailing space removed, where space is defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).
			String name1 ="   Chaitanya  ";
			String fullNameStrip = name1.strip();  
			System.out.println("Java String Strip:");
			System.out.println("fullNameStrip" + " - "+ fullNameStrip);
			System.out.println();
		
			/* 11 . Java StringCompareto
			compares two strings lexicographically -- 10 -- Need more understanding the usage ???
			String CompareTo*/
			int CompareTo = fullName.compareTo(firstName);
			System.out.println("Java String Compare To:");
			System.out.println("CompareTo" + " - "+ CompareTo);
			System.out.println();
		
			// 12 . Java StringcharSequence
			String s1 = "My name is ChaitanyaReddy";
			// prints true
			System.out.println("Java String Char Sequence:");
		    System.out.println( s1.contains("Chaitanya"));
	 
	        // prints false
	        System.out.println(s1.contains("cr"));
	        System.out.println();
	       
	        /* 13.  Java startsWith
         	Tests if this string starts with the 
         	specified prefix beginning a specified index
	        */
	        String s2 = "My name is Chaitanya Reddy";
	        System.out.println("Java Starts With:");
	        System.out.println(s2.startsWith("My"));//true
	        System.out.println(s2.startsWith("My name is"));//true
	        System.out.println(s2.startsWith("my"));//false
	        System.out.println();
	   
	        /* 14. Java endsWith
	     	Tests if this string ends with the specified suffix	     
	        */
	        String s3 = "My name is Chaitanya Reddy";
	        System.out.println("Java Ends With:");
	        System.out.println(s3.endsWith("reddy"));//false (r vs R)
	        System.out.println(s3.endsWith("Chaitanya Reddy"));//true
	        System.out.println();
	        
	        // 15 Java String codePointCount()??
	        String myStr = "Chaitanya89067reddy";
	        int result = myStr.codePointCount(0, 19);
	        System.out.println("Java String Code Point Count: A");
	        System.out.println(result);
	        System.out.println();
	        
	        // 16 .	codePointCount​(int beginIndex, int endIndex)
	     	String str = "google.com";
	     	System.out.println("Java String Code Point Count: B");
	        System.out.println("Original String : " +str);
	        System.out.println();

	        // codepoint from index 1 to index 10
	        int ctr = str.codePointCount(0, 9);

	        // prints character from index 1 to index 10
	        System.out.println("Codepoint count = " +ctr);
	        System.out.println();
	        
	        // 17 . compareToIgnoreCase​(String str)
	        /* The compareToIgnoreCase() method compares two strings lexicographically
	        ignoring lower case and upper case differences. The comparison is based 
	        on the Unicode value of each character in the string converted to lower case.
	        The method returns 0 if the string is equal to the other string, 
	        ignoring case differences. A value less than 0 is returned if 
	        the string is less than the other string (less characters) and a 
	        value greater than 0 if the string is greater than the other string 
	        (more characters).*/
	        
	        String myStr1 = "class";
	        String myStr2 = "classes";
	        String myStr3 = "Class";
	        System.out.println("Java Compare To Ignore Cas e:");
	        System.out.println(myStr1.compareToIgnoreCase(myStr2));
	        System.out.println(myStr1.compareToIgnoreCase(myStr3));
	        
	        
	       
	        // 18 .  Casting means assigning a value of one primitive data type to another type.
			 
	        
	        
	 		//Cast int to String
			String intToString = Integer.toString(1);
			
			//Cast double to String
			String doubleToString = Double.toString(1.1);
			
			//Print the values and type of values
			System.out.println(); //blank line
			System.out.println(intToString + " " + intToString.getClass());
			System.out.println(doubleToString + " " + doubleToString.getClass());
			
			//Cast String to int
			int stringToInt = Integer.parseInt("1");
			
			//Cast String to double
			double stringToDouble = Double.parseDouble("1.1");
			
			//Print values and type of values
			System.out.println(stringToInt);
			//cast to Object then call getClass()
			System.out.println(((Object)stringToInt).getClass());
			
			System.out.println(stringToDouble);
			//cast to Object then call getClass()
			System.out.println(((Object)stringToDouble).getClass());
	        
		StringBuilder stringBuilder  = new StringBuilder("Hello");//16 
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.append(" Raj"));
		stringBuilder.trimToSize();
		System.out.println(stringBuilder.capacity());
		
		
        
	        
	}
}