package com.ict.learning.Learnjava;

public class UnderstandingArray {

	public static void main(String[] args) {
		int i []= { 1 ,2 ,3 ,4 ,5 ,6};//single dimension array
         System.out.println( i [2]);
		
		for( int x:i) {
			System.out.println(x);
		}
	 int i2 [][]= {{1,2,3,4,5,6},{6,3,4,5}};//multi
		for(int[] x1:i2) {
			for(int z:x1) { 			
		System.out.println(z);
	}
		}
		
		String colors[][]= {{"Red","Blue","green"},{"yellow","pink"}};
	     for(String[] color:colors) {
            for(String z:color) { 
            System.out.println(z);
            }
	     }
            	
		}
	}	

