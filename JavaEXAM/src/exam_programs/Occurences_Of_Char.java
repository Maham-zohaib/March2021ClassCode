package exam_programs;

import java.util.HashMap;

public class Occurences_Of_Char {

		private static void characterCount(String s)
	    {
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	  
	        char[] sArray = s.toCharArray();
	  
	      
	  
	        for (char c : sArray)
	        {
	            if(charCountMap.containsKey(c))
	            {
	             
	  
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                charCountMap.put(c, 1);
	            }
	        }
	    
	  
	        System.out.println(s+" : "+charCountMap);
	        
	    }
	  
	    public static void main(String[] args)
	    {
	       characterCount("Hello World");
	  
	       
	}

}
