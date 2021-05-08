package file_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample_reader {

	public static void main(String[] args) throws IOException {
	//to print path of our project java have a feature called user.dir
		System.out.println(System.getProperty("user.dir"));
		
		//to print our file path we can add folder and file name including / slash
     System.out.println(System.getProperty("user.dir")+"//Utility//mytestfile.txt");
	
     // to print contancs of thi list we will declear a variable first and A veriable to which whole path is decleared
       String sPath=System.getProperty("user.dir")+"//Utility//mytestfile.txt";
       String sLine ;
       
       
       // To READ File 
       FileReader fr = new FileReader(sPath);
       
       // To read line by line we are using BufferReader
       BufferedReader br = new BufferedReader(fr);
       
       //To print first line only
       //sLine = br.readLine();
       //System.out.println(sLine);
       
       // to read all the lines we use a while loop
       while((sLine=br.readLine())!=null) {
    	  System.out.println(sLine);
       }
       
	
	}

}
