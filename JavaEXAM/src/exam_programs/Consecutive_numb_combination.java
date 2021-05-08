package exam_programs;
import java.util.Scanner;
public class Consecutive_numb_combination {
public static void main(String[] args) {
		//Write a program which inputs a positive natural number N and prints the possible consecutive number combinations, 
		//which when added give N. INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4 *

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int n = sc.nextInt();
	System.out.println("Consecutive number combinations are");
	int sum=0,c=0,j=0;
    for(int i=1;i<n;i++)
    {
     sum=i;
     j=i+1;
     while(sum<n)
        {
            sum=sum+j;
            j++;
        }
    if(sum==n)
         {
        for(int k=i;k<j;k++)
         {
         if(k==i)
      System.out.print(k);
      else
    	  System.out.print(" + "+k);
         }
      System.out.println();
     }
}
}
}
