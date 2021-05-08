package arrays_assignments;

import java.sql.Array;
import java.util.Arrays;

public class Even_Odd {

	public static void main(String[] args) {
		/*
		  13.WJP: given an array of elements print 1 even and 1 odd number in sorted way. 

input : 7 4 8 3 2 10 6 5

output: 2 3 4 5 6 7 8
		 */
	int[ ] a = {7,4,8,3,2,10,6,5};
	
	Arrays.sort(a);
	System.out.println("sorted array");
	for (int k=0 ; k<a.length ; k++) {
		System.out.print(a[k] + " ");
	}
	
	
	

		
	
	
	
	
	}
}
	
	
	
	/*
	
	
	
	
	}
	}
	
	
	



	/*
	 * 	System.out.println("\nOdd Numbers:");  
	for(int i=0;i<a.length;i++){  
	if(a[i]%2!=0){  
	System.out.println(a[i]);  
	}  
	}  
	System.out.println("Even Numbers:");  
	for(int i=0;i<a.length;i++){  
	if(a[i]%2==0){  
	System.out.println(a[i]);  
	}  
	
	}

	 */







