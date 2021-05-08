package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithScanner {

	public static void main(String[] args) throws IOException {
		
		
		
	File f = new File("/Users/Maham/Desktop/myfile.txt") ;
		
		Scanner sc = new Scanner(f);
		
		
		while(sc.nextLine() != null) {
			System.out.println((sc.nextLine()+ "\n"));
			
		}
		
		
		
		
		
		
		
	
	}
	}
