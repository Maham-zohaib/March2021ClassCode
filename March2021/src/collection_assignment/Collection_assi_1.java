package collection_assignment;

import java.util.ArrayList;

public class Collection_assi_1 {

	public static void main(String[] args) {
		//Implement user defined Array List (Implement only add and remove methods)

		ArrayList <Integer> stu = new ArrayList <Integer>();
		
		stu.add(20);
		stu.add(40);
		stu.add(60);
		stu.add(80);
		stu.add(30);
		stu.add(50);
		
		for (int i=0 ; i<stu.size() ; i++) {
			
			System.out.println(stu.get(i));
		}
		System.out.println("after remove ");
		stu.remove(5);
		stu.remove(4);
		
for (int i=0 ; i<stu.size() ; i++) {
			
			System.out.println(stu.get(i));
		}
	}

}
