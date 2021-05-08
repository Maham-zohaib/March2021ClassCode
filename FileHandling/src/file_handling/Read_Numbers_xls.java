package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read_Numbers_xls {

	public static void main(String[] args) throws Exception {
	String sPath = System.getProperty("user.dir")+"/Users/Maham/Desktop/mydata.xls";
	HSSFWorkbook myexcel = new HSSFWorkbook (new FileInputStream(sPath));

	}

}
