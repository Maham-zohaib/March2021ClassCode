package file_handling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Write_Text_File {

	public static void WriteFileMethod(String fileName) throws IOException {
		
	
	}
	     public static void main(String[] args) throws IOException {
	    		
	    	 String sPath= System.getProperty("user.dir")+ "\\Utility\\firstwritenfile.txt";
	    	 
	   	       
	   	     FileWriter fw = new FileWriter(sPath); // to write file
	   	    BufferedWriter br = new BufferedWriter(fw); //to write line by line
	
	   	  br.write("hello\n");
	   	  br.write("hiiiiiiiii");
	      br.flush();
	   	   br.close();
	   	  //------now----this code is to read the file we just write
	   	   
	   	FileReader fr = new FileReader(sPath); //to read file
	     BufferedReader bre = new BufferedReader(fr); //to read line by line
	       String sLine;
	    
	       while((sLine=bre.readLine())!=null) { //to read whole file
	    	  System.out.println(sLine);
			}
	 
	 }
	     
	     

}
