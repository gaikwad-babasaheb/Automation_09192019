package filehandling;

import java.io.IOException;

public class testXlsreaderclass {

	public static void main(String[] args) throws IOException
	{
		 Xls_Reader xl= new Xls_Reader("D:\\Automation_09192019\\test\\src\\filehandling\\testdata.xls");
		 
		 //Get row count
		 System.out.println(xl.getrowcount("Sheet1"));
		  
		 //Get colomn count
		 System.out.println(xl.getColumncount("Sheet1"));
		 
		 //Get cell data
		 System.out.println(xl.getCellData("Sheet1", 1, 1));
	

	}
}
