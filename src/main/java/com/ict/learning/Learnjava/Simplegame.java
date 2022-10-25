package com.ict.learning.Learnjava;

import java.util.Scanner;

public class Simplegame {
	
					
					
			
		
			
			
	


	
	
	// function to increase the speed
	
	

	
	static int seconds;
	static int sum;
	static int H;
	static int M;
	static int S;
	static int number;

	public static void main(String[] args) {
		// Create an instance of the SimpleGame class.
		// TODO: Your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		// Ask the user which game to play.
		// Then ask the user for input and pass the value to the corresponding method.
		
		// If the user enters 1, ask for an integer to convert and call the convertTime method.
		// If the user enters 2, ask for an integer and call the digitsSum method.
		
		// TODO: Your code goes here
		
		//Asking the user to input the user name
				
		System.out.println("Hello! Enter Integer 1 - To Covert the time and 2 - To Get the Digit Sum ");
				
				//Scanner to be used for user input throughout the main method
				Scanner scanner = new Scanner(System.in);
				
				//get the next int entered by user
				int x  = scanner.nextInt();
				
								
				if (x == 2) {
					
				
					System.out.println("Enter the number for Sum of digits");
					
					//Scanner to be used for user input throughout the main method
					Scanner scanner1 = new Scanner(System.in);
					
					//get the next int entered by user
					int number  = scanner1.nextInt();
					
					sumOfDigits();
					
				
					System.out.println("Sum of the digits"+sum );
					
				} else {
					System.out.println("Enter the Number in Seconds to convert" + number);
					
					//Scanner to be used for user input throughout the main method
					Scanner scanner1 = new Scanner(System.in);
					
					//get the next int entered by user
					int number  = scanner1.nextInt();
					
					convertTime();
					
					System.out.print( H + ":" + M + ":" + S);
					System.out.print("\n");
				}
		
		sc.close();
	}

	public static int sumOfDigits(){
		int number = 0;
        int sum =0;
        
           sum += number % 10;
          number /= 10;
        
        return sum = sum + number;
        }
	
	public static int convertTime() {
		// TODO Auto-generated method stub
		
	       
	        
	        int S = seconds % 60;
	        int H = seconds / 60;
	        int M = H % 60;
	        return H = H / 60;
	       
	    }

}
