package basicClassesOfJava;

public class Day_5_Diamond_quiz {

	public static void main(String[] args) {
		int n=5;
	
		int space = n - 1;
	      
        // run loop n number rows of times 
        
        for (int i = 0; i < n; i++)
        {
            
        	// loop for printing space to look like diamond , 
            
            for (int  k= 0; k < space; k++)
                System.out.print(" ");
      
            // loop for printing starts
            
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
      
            System.out.print("\n");
            space--;
        }
      //--------------------------------//
        // Repeat again in reverse order
        
        space = 0;
      
        // run loop n number rows of times 
        for (int i = n; i > 0; i--)
        {
            // loop for printing space to look like diamond 
            for (int k= 0; k < space; k++)
                System.out.print(" ");
      
            // Print i stars
            for (int j = 0; j < i; j++)
                System.out.print("* ");
      
            System.out.print("\n");
            space++;
	}

}
}
