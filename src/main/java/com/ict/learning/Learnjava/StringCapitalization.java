package com.ict.learning.Learnjava;

import org.apache.commons.lang3.CharSetUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

public class StringCapitalization {

	public static void main(String[] args) {
		
	String description ="After more than 30 years of service as one of the Navy's top aviators, Pete \"Maverick\" Mitchell is where he belongs, pushing the envelope as a courageous test pilot and dodging the advancement in rank that would ground him.";
   System.out.println(description);
   System.out.println("");
   
   
  description = WordUtils.capitalize(description);
   System.out.println(description);
   System.out.println("");
         
   description = WordUtils.uncapitalize(description );
   System.out.println(description);
   System.out.println("");
   
   description = WordUtils.capitalizeFully(description );
   System.out.println(description);
   System.out.println("");
   
   String initials = WordUtils.initials(description);
   System.out.println(initials); //so number of words in your file will be
   System.out.println("Total Number of words in the Paragraph :" + initials.length()); 
   System.out.println("length of  the Paragraph :" + description.length()); 
   System.out.println("");
   
   //It's still not giving the correct output for character count -- to check ???
   int CharCount = CharSetUtils.count(description, args);
   System.out.println("Total characters of the paragraph :" + CharCount);
   System.out.println("");
   
   // to get the whitespaces in the given string
   int whiteSpaceCount= StringUtils.countMatches(description, " ");
   System.out.println("Total White Spaces in the Paragraph :" + whiteSpaceCount);
   System.out.println("");
   
   //to get total characters including whitespaces through length method
   int totalCharc=description.length();
   System.out.println("Total characters including White Spaces in the Paragraph :" + totalCharc);
   System.out.println("");
   
   //to get total characters including whitespaces through count method
   int totalCharc1=(int) description.chars().count();
   System.out.println("Total characters including White Spaces in the Paragraph :" + totalCharc1);
   System.out.println("");
   
   //to get total characters count without whitespaces through length method
   String totalCharc2 = description.replace(" ", "");
   int totalCharc3 = totalCharc2.length(); 
   System.out.println("Total characters without White Spaces in the Paragraph :" + totalCharc3);
   System.out.println("");
   
   
   //regex is  predefined string
   String specialChar = description.replaceAll("[a-zA-Z]+"," ").replaceAll(" " , "");
   System.out.println(specialChar);
   System.out.println("Total length of Special Characters  " + specialChar.length()); //method 1
   
   System.out.println(description.replaceAll("[a-zA-Z]+"," ").replaceAll(" " , "").length()); //method 2
   
   

   
   
   
   

	}

}
