package exam_programs;
import java.util.Scanner;
public class Binary_Search {
public static void main(String[] args) {
		//Write a program for binary search. And 5 i/p has to take from user as binary elements.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Total Values");
		int numb = sc.nextInt();
		
		System.out.println("Enter All "+ numb + " Values");
		int[] arr = new int[numb];		
		for (int i = 0; i < numb; i++)
			          arr[i] = sc.nextInt();
		System.out.println("Enter the search value:");
		int searchV = sc.nextInt();
		int first, last, middle ;
		first = 0;
	    last = numb - 1;
	    middle = (first + last)/2;
	    while( first <= last ) {
	    	  if ( arr[middle] < searchV)
	              first = middle + 1;
	    	  else if ( arr[middle] == searchV )
	          {
	            System.out.println(searchV + " found at location " + (middle + 1) + ".");
	            break;
	          }
	    	  else
	          {
	              last = middle - 1;
	          }
	          middle = (first + last)/2;
	       }
	      if ( first > last )
	          System.out.println(searchV + " is not found.\n");
	      }
}

