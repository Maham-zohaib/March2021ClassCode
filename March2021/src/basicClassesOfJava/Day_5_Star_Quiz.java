package basicClassesOfJava;

public class Day_5_Star_Quiz {



	 public static void main(String[] args) {
     int i,j,k;
     int n=5;
     int space = n-1;
     
     //outer loop to handle number of rows
     //  n in this case
     for(i=0 ; i<n ; i++){ 
    
    	 
    	 //adding initial space
    	 for ( k = 0; k < space; k++)
             System.out.print(" ");
	
    	 
    	 
    	 
         //  inner loop to handle number of columns
        //  values changing acc. to outer loop 
    	  for(j=0 ; j<=i ; j++) {
	      System.out.print("* ");
	      
	      
		}
    	  
    	//ending row with next line
	      System.out.println();
	      
	      
		  space--;  
	 
	  
}
     
     
     
		 
		 
	 }
}
	
	