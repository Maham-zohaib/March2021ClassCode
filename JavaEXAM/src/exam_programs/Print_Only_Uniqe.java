package exam_programs;

import java.util.Arrays;
import java.util.HashSet;

public class Print_Only_Uniqe {

	public static void main(String[] args) {
		//Given a string print the unique words of the string
      /*we are using HashSet because HashSet only stores unique values
       */
	
			
	        String str = "hello java world java ";
	         
	        String[] words = str.split(" ");
	         
	        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
	         
	        for(String s:uniqueWords)
	            System.out.println(s);
	    }
			
		
		
	}


