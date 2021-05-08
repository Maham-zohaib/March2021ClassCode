package exam_programs;

public class Reverse_Each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java Code";
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


