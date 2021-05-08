package exam_programs;

public class Fictorial_Number {
//write a program to find factorial (Non Recursive)
	public static void main(String[] args) {
		int i;
		int n=6;
		int fict=1;
		for(i=1 ; i<=n ; i++) {
			fict = fict*i ;
			
		}
		System.out.println("Fictorial of "+n +" is " + fict);
	}

}
