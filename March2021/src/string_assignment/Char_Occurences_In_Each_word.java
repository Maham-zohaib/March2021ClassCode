package string_assignment;

import java.util.HashMap;

public class Char_Occurences_In_Each_word {
	
	private static void characterCount(String s)
    {
        //Creating a HashMap containing char as a key and occurrences as a value
		//charCountMap is name of our map
  
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
  
        //Converting given string to char array
  
        char[] sArray = s.toCharArray();
  
        //checking each char of sArray
  
        for (char c : sArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char 'c' is present in charCountMap, incrementing it's count by 1
  
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value
  
                charCountMap.put(c, 1);
            }
        }
         
        //Printing inputString and charCountMap 
  
        System.out.println(s+" : "+charCountMap);
        
    }
  
    public static void main(String[] args)
    {
       characterCount("Hello World");
  
       

}
}
