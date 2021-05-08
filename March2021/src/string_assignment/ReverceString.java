package string_assignment;

public class ReverceString {

	public static void main(String[] args) {
		//Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)
		
		String s = "Java Code";
		
		System.out.println("String Before Reversing");
		System.out.println(s);
		System.out.println("String After Reversing");
		
		for(int i=s.length()-1 ; i>=0 ; i--) {
		
		System.out.print(s.charAt(i));
		}
	
	
	
	}
}
