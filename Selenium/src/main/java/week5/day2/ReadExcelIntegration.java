package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

import cucumber.api.java.sl.Ce;

public class ReadExcelIntegration {

	

	
	public  String[][] readExcel(String fileName) throws IOException {

		// open workbook
		XSSFWorkbook workBook = new XSSFWorkbook("./data/"+fileName+".xlsx");		
		// open sheet
		XSSFSheet sheet = workBook.getSheetAt(0);

		//last used row count

		int rowCount = sheet.getLastRowNum();

		// last used column count

		short cellCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][cellCount];

		// for rows
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);

			// for column

			for (int j = 0; j < cellCount; j++) {
				//go to cell
				XSSFCell cell = row.getCell(j);

				// read data from cell string

				/*String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);*/

				data[i-1][j] = cell.getStringCellValue();
							
			}

		}
		
		return data;
		
		
		
		
	}

}
