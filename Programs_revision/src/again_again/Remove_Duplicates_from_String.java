package again_again;

public class Remove_Duplicates_from_String {

	public static void main(String[] args) {
	
		String s="abcabcabc";
		
		char ch;
		String ans="";
		int i=s.length();
		
		for(int j=0 ; j<i ; j++) {
			 
			ch = s.charAt(j);
			
			if(ch!=' ');
			 
			ans = ans+ch;
			
			s= s.replace(ch, ' ');
			}
	
		System.out.println("after removing duplicates "+ ans);
	}
}
