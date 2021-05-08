package arrays_assignments;

public class Add_All_Odd {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int sumEven = 0;
		int sumOdd = 0;
		
		 
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
			
			sumOdd = sumOdd + a[i];
		
		} else {
			
			sumEven = sumEven + a[i];
			
		}
		
	}
		System.out.println("Sum of all odd numbers is: " + sumOdd);
	}
}
