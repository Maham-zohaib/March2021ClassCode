package collection_assignment;

import java.util.HashMap;




public class Student {
	
	


	public static void main(String[] args) {
		
		//Create student class with name(String type) and RegNo: (int type) attributes.
		//use any collection to Store 5 student information. (no duplicates).
		
		
		HashMap <String , Integer> st = new HashMap<String, Integer>();
		
		st.put("Maham", 01);
		st.put("Momal", 02);
		st.put("Adil", 03);
		st.put("Aqib", 04);
		st.put("Haider", 05);
		
	//System.out.println(st);
		
	
		for (String i : st.keySet()) {
			  System.out.println(i + " " + st.get(i));
			}
		
		

	}

}
