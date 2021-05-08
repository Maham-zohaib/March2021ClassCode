package inheritance_assignment;

public class Computer_OS extends Operating_system  {

public static void Input_Output(){
		
		System.out.println("Computer Operating system can handel input output");
		
	}
	
public static void Disk_Access(){
		
		System.out.println("Computer Operating system has access to disk");
		
	}

public static void Resource(){
	
	System.out.println("Computer Operating system can do resource allocations");
	
}
	
	
	public static void main(String[] args) {
		ProgExe();
		Memory();
		Error();
		
		Input_Output();
		Disk_Access();
		Resource();
	
	}

}
