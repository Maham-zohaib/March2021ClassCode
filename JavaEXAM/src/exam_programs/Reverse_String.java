package exam_programs;

public class Reverse_String {

	public static void main(String[] args) {
		//Given a string print the reverse of the string
		String s= "Java Code";
		System.out.println(s);
		System.out.println("After Reversing");
		
		for(int i=s.length() ; i>0 ; i--) {
			System.out.print(s.charAt(i-1));
		}
		
		
	}

}
