package com.ict.learning.Learnjava;

import java.util.Scanner;

public class ReadDataFromUser {
public static void main(String[] args) {
	
	String Name;   //for code optimization
	
	Scanner scanner = new Scanner(System.in);
	System.out.println( " Enter your FirstName");
	Name = scanner.nextLine();
	
	System.out.println( " Enter your MiddleName");
	Name = Name + " " +scanner.nextLine();
	
	System.out.println( " Enter your LastName");
	Name = Name + " " + scanner.nextLine();
	
	System.out.println("Hello! " + Name + "  Welcome.");
	
	
}
}
