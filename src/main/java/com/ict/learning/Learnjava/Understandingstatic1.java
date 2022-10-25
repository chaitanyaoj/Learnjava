package com.ict.learning.Learnjava;

public class Understandingstatic1 {
	


public static class UnderstandingStatic {
	
	 static String name ="chaitanya";
	 
	 public static String fullName(){
		 String fName = "Chaitnaya";
		 String lName = "Reddy";
		 String fullName = (fName + lName);
		 System.out.println("Your Name is - " + fullName);
		return fullName;
		 
	 }
	 
	 static {
		 System.out.println("Wecome to TD Bank!");
	 }
	
	
	

	public static void main(String[] args) {
		
		//UnderstandingStatic c = new UnderstandingStatic();
		System.out.println(name);
		fullName();
		
		 
	}

}
}