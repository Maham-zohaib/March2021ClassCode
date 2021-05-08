package exam_programs;

public class Split_String {

	public static void main(String[] args) {
		//How to split string
		String s= "maham.sappal@yahoo.com";
		
	String[] s1 = s.split("@");
	
		
		System.out.println(s);
		 for (String a : s1)
	            System.out.println(a);
		
	}

}
