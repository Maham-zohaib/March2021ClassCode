package arrays_assignments;

public class Push_Zeros {

public static void main(String[] args) {
		// Push all the zeros element to the end of the array

      //a.input1={5,0,6,0,7} output={5,6,7,0,0}
		
		
		int a[]= {5,0,6,4,0,1,7};
		
		int temp;
		
		
		for (int i=0 ; i<a.length ; i++) {
			
			for (int j=0 ; j<a.length-1-i ; j++) {
			if (a[j]<a[j+1]) {
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] =temp;
				
				
			}
			}
			
		}
		for(int k=0 ; k<a.length ; k++) {
			System.out.print(a[k] + " ");
		}

	}

}
