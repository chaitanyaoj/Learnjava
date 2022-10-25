package com.ict.learning.Learnjava;

public class Week2 {
	
			
		//instance variables
		
		/**
		 * Current string.
		 */
		String myString;
		
		/**
		 * Indicates if the current string myString has been set (not null).
		 */
		boolean isSet;
		
		//constructor
		
				/**
				 * Initializes current string myString to null.
				 * Initializes isSet to false.
				 */
				public Week2() {
					// TODO Implement constructor
					
					this.myString = null;
					this.isSet = false;
					System.out.println("This program is going to work!" +myString + isSet);
				}
		
		/**
		 * Sets the value of the current string and sets this.isSet to true.
		 * If the given string is null, sets this.isSet to false.
		 * @param string value to be set
		 */
		public void setString(String string) {
			// TODO Implement method
			
			if (myString != null) {
	            this.myString = string;
	            this.isSet = true;
	        } else {
	            this.isSet = false;
	        }
			
		}

		
		
		

		// methods 
		
	    /**
	     * Returns the current string.
	     * If the current string is null, or has not been set to a value with setString, it should return null.
	     * @return current string
	     */
		public String getString(String string) {
			// TODO Implement method
			  if (this.myString != null){
		            
		        }	
		        			
			  return this.myString;
			

	}

		public static void main(String[] args) {
			
			Week2 c = new Week2();
			c.setString("Jagan Reddy");
			c.getString("Jagan");
			System.out.println(c.getString("Chaitanya"));
		
	
			
		}
}
