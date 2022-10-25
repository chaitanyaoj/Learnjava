package com.ict.learning.Learnjava;

public class UnderstandingLoopsHW {
	

	public static void main(String[] args) {
		
		//for loop
		   
			for(int x=2; x<=10;x= x+=2) {
				System.out.println("The even number is " + x);
			}
			
		System.out.println("");	

		// while loop 
		int a =2;
		while (a <= 10) {
		  System.out.println("The even number is " + a);
		 a=a+2 ;
		}
		
		System.out.println("");	
		
		// Do while loop
		
		int i = 2;
		do {
			System.out.println("The even mumber is " + i);
			i = i+2;
	}
		while (i <= 10);
	}
	
}    


