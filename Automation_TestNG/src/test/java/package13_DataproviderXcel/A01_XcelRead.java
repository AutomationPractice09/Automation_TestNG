package package13_DataproviderXcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;


//this is learn how to read data from excel sheet and print

public class A01_XcelRead 
{
  @Test
  public void readData() throws IOException 
  {
	  
	  //locate path of excel file
	  File f1 = new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  
	  //Read data in stream
	  FileInputStream fs = new FileInputStream(f1);
	  
	  //workbook-->sheet-->row-->column
	  XSSFWorkbook wb = new XSSFWorkbook(fs);
	  XSSFSheet sheet1 = wb.getSheet("userdata");
	  XSSFRow row1 = sheet1.getRow(2);
	  XSSFCell cell1 = row1.getCell(0);
	  
	  String un = cell1.getStringCellValue();
	  System.out.println(un);
	  
	  wb.close();
	  
	  
	  
	  
  }
}
