package exam_programs;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		//Write a program to check Palindrome (MalayalaM) for both numbers and string? 
		String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string or number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string or number is a palindrome.");
	         
	      else  
	         System.out.println("Entered string or number isn't a palindrome."); 
	}

}
