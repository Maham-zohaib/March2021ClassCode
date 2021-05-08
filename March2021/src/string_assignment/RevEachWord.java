package string_assignment;

public class RevEachWord {

	public static void main(String[] args) {
		/*
		 * Reverse the words in a given string – 
		
         a.Input string: I am learning OutputString: learning am I
		 */
		 

		String s = "i am learnning";
		System.out.println(s);
		
		String[] words = s.split(" ");
		
		String RevString = " ";
		
		for(String w:words) {
			String RevWord = " ";
			
			for(int i=w.length()-1 ; i>=0 ; i--) {
				RevWord = RevWord + w.charAt(i);
				
				
			}
			
			RevString = RevString + RevWord ;
			
			
		}
		
		
		
		System.out.println(RevString);
		
		
	}

}
