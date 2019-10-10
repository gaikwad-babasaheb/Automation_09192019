package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class readExcel {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file= new FileInputStream("D:\\Automation_09192019\\test\\src\\filehandling\\testdata.xls");
		HSSFWorkbook wb= new HSSFWorkbook(file);
		HSSFSheet Sheet=wb.getSheet("Sheet1");
		HSSFRow row=Sheet.getRow(0);
		HSSFCell Cell=row.getCell(0);
		System.out.println(Cell.getStringCellValue());
		
		//Number of rows
		System.out.println(Sheet.getLastRowNum());
		//Number of coloms
		System.out.println(row.getLastCellNum());

	}

}
