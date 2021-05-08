package exam_programs;

public class Remove_Char_Method {

	public static void main(String[] args) {
		//Write a method that will remove given character from the String?
	String s="my name is maham";
		System.out.println(Removechar(s,'a'));
	
	
	}

	public static String Removechar(String str ,char c) {
		
		if(str==null)
		return "";
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length() ; i++) {
			
			char ch = str.charAt(i);
			if(ch==c)
				continue;
			sb.append(ch);
		}
		return sb.toString();
		
		}
	

	
}
