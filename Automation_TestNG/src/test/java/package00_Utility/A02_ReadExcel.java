package package00_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class A02_ReadExcel 
{
	public XSSFWorkbook wb;
	
	@DataProvider(name="exceldata")
	public Object[][] ReadExcel()
	{
		File f1 = new File(System.getProperty("user.dir") + "//TestData//Data.xlsx");
		FileInputStream fs;
		Object data[][]=null;
		try {
			fs = new FileInputStream(f1);
			wb = new XSSFWorkbook(fs);
			
			int rows = wb.getSheet("userdata").getPhysicalNumberOfRows();
			int col = wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();

			 data = new Object[rows-1][col];                    

			for (int i = 1; i < rows; i++) 
			{
				for (int j = 0; j < col; j++) 
				{
					data[i-1][j] = wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}

}
