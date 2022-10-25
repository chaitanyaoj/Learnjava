package com.ict.learning.Learnjava;

import java.net.MulticastSocket;

public class ArithmeticOperations {
  public static void main(String[] args) {
	
	  //to create the arithmetic class and operations//
	  
	  // to declare the variables
	  int a = 10;
	  int b = 20;
	  int c = a + b;
	  int d = a - b ;
	  int prod = a * b;
	  int div = b/a;
	  int mod =b%a;
	  
	  System.out.println("My add " + c);
	  System.out.println("My sub number " + d);
	  System.out.println("My product number " + prod);
	  System.out.println("My divided number " + div);// in division we get quotient
	  System.out.println("My modulo number " + mod);  //Modulo we get Remainder
	  System.out.println(" ");  //to get space between line add empty line with space
	  
	  
	  int n=5;
            
      System.out.println(n);
      System.out.println(n++);
      System.out.println(n);
      System.out.println(++n);
      System.out.println(" "); 
      System.out.println(n--);
      System.out.println(n);     
      System.out.println(--n);
      System.out.println(n=n+3);
	  System.out.println(n=n-3);
    
}
}