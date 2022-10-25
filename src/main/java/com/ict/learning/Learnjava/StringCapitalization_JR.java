package com.ict.learning.Learnjava;

import org.apache.commons.lang3.CharSetUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

public class StringCapitalization_JR {

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
   
   String description1 = "After 30 years Navy's aviators, Pete \\\"Maverick\\\" testing";
   // to get the initials using the Wordutlis
   String initials = WordUtils.initials(description1);

   System.out.println(initials);
   //so number of words in your file will be 
   System.out.println("Total Number of words in the Paragraph :" + initials.length()); 
   System.out.println("length of  the Paragraph :" + description1.length()); 
   System.out.println("");
   
   //It's still not giving the correct output for charcter count -- to check ???
   int charCount= CharSetUtils.count(description1, args);
   System.out.println("Total characters of the paragraph :" + charCount);
   System.out.println("");
   
   // to get the whitespaces in the given string
   int whiteSpaceCount=StringUtils.countMatches(description1, " ");
   System.out.println("Total White Spaces in the Paragraph :" + whiteSpaceCount);
   System.out.println("");
   
   //to get total characters including whitespaces
   int totalCharc=description1.length();
   System.out.println("Total characters including White Spaces in the Paragraph :" + totalCharc);
   System.out.println("");
   
   //to get total characters including whitespaces through count method
   int totalCharc1=(int) description1.chars().count();
   System.out.println("Total characters including White Spaces in the Paragraph :" + totalCharc1);
   System.out.println("");
   
   //to get total characters count without whitespaces through length method
   String totalCharc2 = description1.replace(" ", "");
   int totalCharc3 = totalCharc2.length(); 
   System.out.println("Total characters without White Spaces in the Paragraph :" + totalCharc3);
   System.out.println("");
   
   

   
   
   
   

	}

}
