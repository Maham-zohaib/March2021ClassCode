package again_again;

import java.util.Scanner;

public class Palindrome_Or_Not {

	public static void main(String[] args) {
	
String s, rev="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter word: ");
		s= sc.nextLine();
		
		int i= s.length();
		for (int j=i-1 ; j>=0 ; j--) {
			
			rev= rev + s.charAt(j);
			
		}
		if(s.equals(rev)) {
			System.out.println("Given word is Palindrome");
		}else {
			System.out.println("Given word is Not Palindrome");
		}
}
}