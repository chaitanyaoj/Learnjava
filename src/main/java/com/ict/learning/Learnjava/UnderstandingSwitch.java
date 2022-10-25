package com.ict.learning.Learnjava;

public class UnderstandingSwitch {

	public static void main(String[] args) {
		/* switch(expression){
		 * case x:
		 *     break;
		 * case y:
		 *     break;
		 * case z:
		 *     break;
		 *   default:
		 		}
		        */

		  int day =5;
		  switch(day) {
		  case 1:
			  System.out.println("Monday");
			  break;
		  case 2:
			  System.out.println("Tuesday");
			  break;
		  case 3:
			  System.out.println("Wednesday");
			  break;
		  default:
			  System.out.println("No matching found");
		  }
	}

}
