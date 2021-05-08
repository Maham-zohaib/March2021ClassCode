package arrays_assignments;

public class Running_Sum {

	public static void main(String[] args) {
//3. WJP for int array = [1,2,3,4,5] running sum of numbers. O/p = [1,1+2,1+2+3,1+2+3+4,1+2+3+4+5] i.e [1,3,6,10,15}
		
		int[] a = {1,2,3,4,5};
		int Sum=0;
		
		
		for(int i=0 ; i<a.length ; i++){
			
				
			Sum = Sum + a[i];
			a[i] = Sum;
				
			}
			
			
		
	
      for(int k=0 ; k <a.length ; k++) {
			
			System.out.print(a[k]+ " ");
}
	}

}
