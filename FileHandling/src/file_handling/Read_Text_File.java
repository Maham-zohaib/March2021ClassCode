package file_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_Text_File {

	public static void ReadFileMethod(String fileName) throws IOException {
		
		
		 String sPath=System.getProperty("user.dir")+"//Utility//"+ fileName+".txt";
	     String sLine ;
	       
	       
	     FileReader fr = new FileReader(sPath); //to read file
	     BufferedReader br = new BufferedReader(fr); //to read line by line
	       
	    
	       while((sLine=br.readLine())!=null) { //to read whole file
	    	  System.out.println(sLine);
	}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// We already learn how to read
		//now we will create a method with all the code to read a text file wnd will call it in main method
		//so that we can read as many .txt files as we want without writing code over and over again

		ReadFileMethod("mytestfile");
		ReadFileMethod("mySecendefile");
		
		
		
	}

}
