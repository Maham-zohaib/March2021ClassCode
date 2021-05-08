package string_assignment;

public class Duplicate_String {

	public static void main(String[] args) {
		//Program to remove duplicates from a string input= “abcabcabc” output = “abc”
		 
		String s = "abcabcabc";
		
		
		int i = s.length();

		char ch;

		String ans=" ";

		for(int j=0; j<i; j++)

		{

		ch = s.charAt(j);

		if(ch!=' ')

		ans = ans + ch;

		s = s.replace(ch,' '); //Replacing all occurrence of the current character by a space

		}

		System.out.println("Word after removing duplicate characters:"  + ans);


	

	}

}
