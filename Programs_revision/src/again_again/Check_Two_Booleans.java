package again_again;

import java.util.Scanner;

public class Check_Two_Booleans {

	public static void main(String[] args) {
		boolean first;
		boolean sec;
		boolean third;
		boolean result;

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first boolean value: ");
	first= sc.nextBoolean();
	
	System.out.println("Enter sec boolean value: ");
	sec= sc.nextBoolean();
	
	System.out.println("Enter third boolean value: ");
	third= sc.nextBoolean();
	
	if(first) {
		result= sec||third;
		
	}else {
		result=sec&&third;
		
	}
	if(result) {
		System.out.println("two values are true");
		
	}else {
		System.out.println("two values are false");
	}
}
}
