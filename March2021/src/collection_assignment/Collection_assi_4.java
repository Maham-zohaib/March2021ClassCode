package collection_assignment;

import java.util.ArrayList;

class Student2{
	
	int reg;
	String name;
	
	Student2(int reg, String name){
		this.reg = reg;
		this.name = name;
		
	}
	}

public class Collection_assi_4 {

	public static void main(String[] args) {
		
		ArrayList<Student2> al = new ArrayList<Student2>();
		
		al.add(new Student2(01, "maham"));
		al.add(new Student2(02, "momal"));
		al.add(new Student2(03, "adil"));
		al.add(new Student2(04, "aqib"));
		al.add(new Student2(05, "haider"));
		
for(int i=0 ; i<al.size() ; i++) {
			
			System.out.println(al.get(i).reg + " " +al.get(i).name);
		}
		
		
		
	}

}
