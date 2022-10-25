package com.ict.learning.Learnjava;

import java.util.Scanner;

public class StringMethodPractice {

	String fName; 
	String mName;
	String lName; 
	
	public void name() {
		
		String fName = "Chaitanya";
		String lName = "Reddy";
		System.out.println("Your Name is - " + fName  + " " +   lName);
	}
	
	public void name1(String fName, String mName, String lName) {
		String name = fName + lName;
		System.out.println("Your Name is - " + fName + mName + lName);
	}
	
	public String name (String fName, String mName, String lName){
		String fullname = (fName  + mName + lName);
		return fullname;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringMethodPractice c = new StringMethodPractice();
		
		c.name();
		c.name("Chaitanya", " Jagannatha", " Reddy");
					
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your First Name");
		String fName= scan.nextLine();
		System.out.println("Enter Your Middle Name");
		String mName= scan.nextLine();
		System.out.println("Enter Your Last Name");
		String lName= scan.nextLine();
		
		c.name1(fName, mName, lName);
		
		System.out.println(c.name(fName, mName, lName));
		
	}

}
