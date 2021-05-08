package string_assignment;

//.input string= “ABCAABCAEBE” which character is duplicated least number of times. 

public class Least_Numb_Of_Times {

	public static void main(String[] args) {
		
       String s = "ABCAABCAEBEF";
		
		int[] arr = new int[127];
		
		for(int i=0 ; i<s.length() ; i++) {
			
			arr[s.charAt(i)] = arr[s.charAt(i)] + 1 ;
			
			
		}
		
		int min = 999;
		char c= ' ';
		
		for(int i=0 ; i<s.length() ; i++) {
			
			if(arr[s.charAt(i)]!=0)
			if(arr[s.charAt(i)]<=min) {
				min = arr[s.charAt(i)];
				c= s.charAt(i);
				
				
			}
		}
		System.out.println("Minimum character is "+ c);
	}
	}
		
		