package exam_programs;

public class Selection_Sort {

	
		//WJP to perform ascending order Selection sort
		void sort(int arr[])
	    {
	        int n = arr.length;
	  
	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;
	  
	            // Swap the found minimum element with the first
	            // element
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
		public static void main(String[] args) {
			
			Selection_Sort ob = new Selection_Sort();
	        int arr[] = {46,21,11,33,10};
	        ob.sort(arr);
	        System.out.println("sorted Array: ");
	        for(int k=0 ; k <arr.length ; k++) {
				
				System.out.print(arr[k]+ " ");
			}
	}

}
