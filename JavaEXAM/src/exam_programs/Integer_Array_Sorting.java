package exam_programs;
public class Integer_Array_Sorting {

	public static void main(String[] args) {
		//Given an array of integers, sort the integer values.
		
		int[] a= {3,1,8,4,9,43,2,45,28};
		
           
          int temp;
		
		for (int i=0 ; i<a.length ; i++) {
			
			for (int j=0 ; j<a.length-1-i ; j++) {
				
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] =temp;
					
				}
			}
		}
		
		for(int k=0 ; k <a.length ; k++) {
			
			System.out.print(a[k]+ " ");
		}
		
	}

}
