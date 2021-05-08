package exam_programs;

import java.util.Arrays;

public class Merge_Array {

	public static void main(String[] args) {
		//WJP to merge two sorted array.(Do not use third array) 
		//array1[10] = 1,2,4,6,9,10 
		//array2[4] = 3, 5,7,8 
		//After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10 *

		int[] arr1 = new int[10];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=4;
		arr1[3]=6;
		arr1[4]=9;
		arr1[5]=10;
		int[] arr2 = new int[4];
		arr2[0]=3;
		arr2[1]=5;
		arr2[2]=7;
		arr2[3]=8;
		
		System.out.println("Array1: "+Arrays.toString(arr1));  
	    System.out.println("\nArray2: "+Arrays.toString(arr2));
	    int m =6, n=4;
		int i = m-1, j = n-1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[index--] = arr1[i--];
            } else {
                arr1[index--] = arr2[j--];
            }
        }
        while (i >= 0) {
            arr1[index--] = arr1[i--];
        }
        while (j >= 0) {
            arr1[index--] = arr2[j--];
        }
		
        System.out.println("\nMerged array: "+Arrays.toString(arr1));  
	}

}
