package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		// open workbook
		XSSFWorkbook workBook = new XSSFWorkbook("./data/readData.xlsx");		
		// open sheet
		XSSFSheet sheet = workBook.getSheetAt(0);

		//last used row count

		int rowCount = sheet.getLastRowNum();

		// last used column count

		short cellCount = sheet.getRow(0).getLastCellNum();

		// for rows
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);

			// for column

			for (int j = 0; j < cellCount; j++) {
				//go to cell
				XSSFCell cell = row.getCell(j);

				// read data from cell string

				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);

			}



		}
		workBook.close();
		
		
		
		
		/*// read the data from a particular cell
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/readData.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(4);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);*/
		
		
		



	}

}
