package arrays_assignments;

public class Three_Num {

	
		/*
		 * Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4]
		 */
		
		// Function to reverse every sub-array formed by
	    // consecutive k elements
	    static void reverse(int arr[], int n, int k){
	        for (int i = 0; i < n; i += k)
	        {
	            int left = i;
	      
	            // to handle case when k is not multiple
	            // of n
	            int right = Math.min(i + k - 1, n - 1);
	            int temp;
	              
	            // reverse the sub-array [left, right]
	            while (left < right)
	            {
	                temp=arr[left];
	                arr[left]=arr[right];
	                arr[right]=temp;
	                left+=1;
	                right-=1;
	            }
	        }
	    }
		
	    
	    public static void main(String[] args) {
	    	
	    	   
	        int arr[] = {3,2,4,7,0,3,1,5,8, 4};
	        int k = 3;
	        int n = arr.length;
	      
	        reverse(arr, n, k); //calling method
	      
	        for (int i = 0; i < n; i++) //printing array
	        	
	            System.out.print(arr[i] + " ");
	    
	}

}


