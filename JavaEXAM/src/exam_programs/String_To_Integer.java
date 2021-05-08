package exam_programs;

public class String_To_Integer {

	public static void main(String[] args) {
		//WJP to convert string to int
		
		
		String s="120";
		
		int n = Integer.parseInt(s); //its a builtin method to conver string value onto int but string must be of all decimal numbers
		
		System.out.println("String numbers are "+ s);
        System.out.println("After converting into int "+ n);
	    System.out.println(n + 10);
	}

}
