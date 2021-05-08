package exam_programs;

public class Fictorial_Using_Recursion {
//WJP to find factorial of a number using recursion.
	//Recursion means a function calling itself
	
	
	public static void main(String[] args) {
		
       
        System.out.println(fict(6));
        
       }
    
	
	
	
	public static int fict(int num) {
        if (num == 0)
        	return 1;
        else 
            return num * fict(num - 1);
       
    }
		
		
	}

