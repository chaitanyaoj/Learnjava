package com.ict.learning.Learnjava;

import java.util.Scanner;

public class UnderstandingIfCondition {
public static void main(String[] args) {
	
	int firstvalue;
	int secondvalue;
	int thirdvalue;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the firstvalue");
	firstvalue = scanner.nextInt();
	System.out.println("Enter the secondvalue");
	secondvalue = scanner.nextInt();
	System.out.println("Enter the thirdvalue");
	thirdvalue = scanner.nextInt();
	
	if(firstvalue>secondvalue) {
		System.out.println("firstvalue is greater");
	}
	
	else if(secondvalue>thirdvalue){
		System.out.println("secondvalue is greater");
	}
	else if  (thirdvalue > firstvalue){
		System.out.println("thirdvalue is greater");
 	}
 
}
}
