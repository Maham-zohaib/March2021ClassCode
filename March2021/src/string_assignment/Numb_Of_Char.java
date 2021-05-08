package string_assignment;

public class Numb_Of_Char {

	
		/*Given two strings, first string is a sentence and the second string is a character.
		 *  You need to write a function to print number of characters in between the occurrences of second-string excluding spaces. 
		 *  String1 = “I love java programming” String2 =”o” 
		 */

	
	    
	    	
	static int maximumChars(String str)
    {
        int n = str.length();
        int res = -1;
          
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (str.charAt(i) == str.charAt(j))
                    res = Math.max(res, Math.abs(j - i - 1));
                           
        return res;
    }
      
    // Driver code
    public static void main(String[] args)
    {
    	
    	
        String s = "my phone number id #0300786541#";
        String str=s.replace(" " , "");
        
        System.out.println(maximumChars(str));
    }
}
		
	
