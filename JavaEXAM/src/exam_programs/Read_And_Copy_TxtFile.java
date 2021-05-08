package exam_programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read_And_Copy_TxtFile {

	public static void main(String[] args) throws IOException {
		//Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
		//Readin a file 
		String sPath="/Users/Maham/Desktop/myfile.txt";
	     String sLine ;
	       
	       
	     FileReader fr = new FileReader(sPath); //to read file
	     BufferedReader br = new BufferedReader(fr); //to read line by line
	       
	    
	      
	     while((sLine=br.readLine())!=null) { //to read whole file
	    	  System.out.println(sLine);
			}
	     System.out.println("************This can read not copy ***************************");
	//coping the file in reverse order
	       
	       String Path="/Users/Maham/Desktop/mycopyfile.txt";
	       
	       FileWriter fw = new FileWriter(Path); // to write file
	   	    BufferedWriter bri = new BufferedWriter(fw); //to write line by line
	       
	      bri.write(sPath);
	      bri.flush();
	      bri.close();
	      while((sLine=br.readLine())!=null) { //to read whole file
	    	  System.out.println(sLine);
			}
	       
}
}