package arrays_assignments;

public class Sort_Array {

	public static void main(String[] args) {
		
		int[] a = {3,2,4,7,0,3,1,5,8,4};
		int temp;
		
		for (int i=0 ; i<a.length ; i++) {
			
			for (int j=0 ; j<a.length-1-i ; j++) {
				
				if(a[j]<a[j+1]) {
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
