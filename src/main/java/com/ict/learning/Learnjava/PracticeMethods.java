package com.ict.learning.Learnjava;

import java.util.Scanner;

public class PracticeMethods {
	
	
	// instance var
	
	int fNumber; 
	int sNumber; 
		
	public void addition(int fNumber, int sNumber) {
		int sum = fNumber + sNumber;
		
		System.out.println("Sum of two numbers are = " + sum); 
	}
	
	public void sub(int fNumber, int sNumber) {
		int Diff = fNumber - sNumber;
		System.out.println("Difference of two numbers = " + Diff); 	
	}
	
	public void product(int fNumber, int sNumber) {
		int  Product= fNumber*sNumber;
		
		System.out.println("Product of two numbers = " + Product); 
			
	}

	public void division(int fNumber, int sNumber) {
		int  division = fNumber/sNumber;
		
		System.out.println("Division of two numbers = " + division); 
			
	}
	public static void main(String[] args) {
		
		PracticeMethods e = new PracticeMethods();
				
		e.addition(40, 50);
		e.sub(50,40);
		e.product(20, 20);
		e.division(200, 10);
		
		Scanner scan = new Scanner(System.in);  //Scanner to be used for user input throughout the main method
		System.out.println("Enter the First Number");  //Display the message to the user
	    int fValue  = scan.nextInt();   //get the next int entered by user	
		System.out.println("Enter the Second Number");  //Display the message to the user
		int sValue  = scan.nextInt();  //get the next int entered by user 
		
		scan.close();
		
		e.addition(fValue, sValue);
		e.sub(fValue, sValue);
		e.product(fValue, sValue);
		e.division(fValue, sValue);
			
		}

	

	

}
