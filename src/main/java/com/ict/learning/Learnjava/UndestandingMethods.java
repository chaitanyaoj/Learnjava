package com.ict.learning.Learnjava;

import java.util.Scanner;

// TODO Auto-generated method stub
		public class UndestandingMethods {
			
			int firstValue = 30;
			int secondValue = 20;
		
			//access specifier return type methodname 
			public void addition() {
				int sum = firstValue + secondValue;
				System.out.println("Sum of two numbers are = " + sum);		
			}
			
			
				public void substraction() {
					   int sub = firstValue - secondValue;
					System.out.println("Difference of two numbers = " +sub); 
				}
				public void product() {
					   int product = firstValue * secondValue;

					System.out.println("Product of two numbers = " + product); 
					
				}
				public void divide() {
				      int division = firstValue / secondValue;
						System.out.println("Division of two numbers = " + division); 
					}
					public void addition(int fValue , int sValue) {
							int sum = fValue + sValue;
						System.out.println("Sum of two numbers are =" + sum); 
						}
						
						public static void main(String[] args) {
							UndestandingMethods uMethod = new UndestandingMethods();
							uMethod.addition();
							uMethod.substraction();
							uMethod.product();
							uMethod.divide();
							uMethod.addition(40,35); //calling parameters
							
							Scanner scan = new Scanner(System.in);  //Scanner to be used for user input throughout the main method
							System.out.println("Enter the First Number");  //Display the message to the user
						    int fValue  = scan.nextInt();   //get the next int entered by user	
							System.out.println("Enter the Second Number");  //Display the message to the user
							int sValue  = scan.nextInt();  //get the next int entered by user 
							
							uMethod.addition(fValue, sValue);
								
						}
						
					}
									
					
			

		

	


