package package13_DataproviderXcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


//Read data from excel, save it to Array and Print Array.


public class A02_ExcelRead2 {
	@Test
	public void readData() throws IOException {
		File f1 = new File(System.getProperty("user.dir") + "//TestData//Data.xlsx");
		FileInputStream fs = new FileInputStream(f1);
		XSSFWorkbook wb = new XSSFWorkbook(fs);

		// get Number of rows
		int rows = wb.getSheet("userdata").getPhysicalNumberOfRows();

		// get Number of columns
		int col = wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();

		// create array of same size
		Object data[][] = new Object[rows-1][col];                    //row-1 because we don't need 1st header row

		// iterate array, read data from file and save it in array
		for (int i = 1; i < rows; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				data[i-1][j] = wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data[i-1][j]+" ");
			}
			System.out.println("");
		}
		
		wb.close();
	}
}
