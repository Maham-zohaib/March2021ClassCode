package exam_programs;

import java.util.HashMap;

public class Integer_occurence_Count {
	
	public static void main(String[] args){
		
		HashMap <Integer , Integer> numbCounter = new HashMap<Integer , Integer>();
		
		int[] arr= {2,4,6,2,3,4,2,1};
		
		for(int i : arr) {
			
			if(numbCounter.containsKey(i)) {
				numbCounter.put(i, numbCounter.get(i)+1);
			}
			else {
				numbCounter.put(i,1);
				
			}
		}
		
		System.out.println(numbCounter);
    }

}
