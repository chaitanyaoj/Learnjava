package com.ict.learning.Learnjava;

import java.util.Scanner;

public class methodsPratice {

   int fValue; 
   int sValue;
   int tValue;
     
   
   public methodsPratice() {
	   
	   System.out.println("Understanidng the Constuctor in Java");
	   
	      }
   
   public void addition() {
	 
			  
	   int sum = fValue + sValue;
	   System.out.println("Sum of two numbers are " + sum);
   }
   
   public void addition(int fNumber, int sNumber) {
		int sum = fNumber + sNumber;
		
		System.out.println("Sum of two numbers are = " + sum); 
	}
   
   public int addition(int fValue, int sValue, int tValue) {
	   int sum = fValue + sValue + tValue;
	   return sum;
   
 }
  

    public static void main(String[] args) {
	
    	methodsPratice pmethod = new methodsPratice();
    	
    	pmethod.addition();
    	    	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter First value");
	 int fValue  = scan.nextInt();
	System.out.println("Enter Second value");
	 int sValue  = scan.nextInt();
	 System.out.println("Enter Third value");
	 int tValue  = scan.nextInt();
	
	 pmethod.addition(fValue, sValue);
	
	System.out.println(pmethod.addition(fValue, sValue, tValue));
	
	 
	
	
	
	
}
}
