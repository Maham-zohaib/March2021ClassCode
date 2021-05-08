package string_assignment;

public class LowerUpperCase {

	public static void main(String[] args) {
		// WJP to find total number of integers, uppercase and lowercase character in the give string.
		
		String s= "My Phone Number is 12345 *^*";
		String str = s.replace(" ", "");
		
		int upper = 0, lower = 0, number = 0, special = 0;
  
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }
		
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + special);
		
		

	}

}
