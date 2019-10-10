package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class setcelldata {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("D:\\Automation_09192019\\test\\src\\filehandling\\testdata.xls");
		HSSFWorkbook wb= new HSSFWorkbook(file);
		HSSFSheet Sheet=wb.getSheet("Sheet1");
		HSSFRow row=Sheet.getRow(0);
		HSSFCell Cell=row.getCell(0);
		
		Cell.setCellValue("teju");
		FileOutputStream fileOut = new FileOutputStream("D:\\Automation_09192019\\test\\src\\filehandling\\testdata.xls");
		wb.write(fileOut);
		
	}

}
