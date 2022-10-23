package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	static XSSFWorkbook workbook;

	public ExcelDataProvider(String filePath) {
		try {
			FileInputStream fins = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fins);

		} catch (Exception e) {

			// TODO: handel exeption

		}
	}

	public static int getRowCount(String sheetname) {

		return workbook.getSheet(sheetname).getLastRowNum();
	}

	public static int getColsCount(String sheetname) {

		return workbook.getSheet(sheetname).getRow(0).getLastCellNum();
	}
	
	public static int getRowCount(int index) {

		return workbook.getSheetAt(index).getLastRowNum();
	}

	public static int getColsCount(int index) {

		return workbook.getSheetAt(index).getRow(0).getLastCellNum();
	}
	
	
	
	

	public static String getStringCellData(String sheetname, int row, int col) {

		return workbook.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	}

	public static String getStringCellData(int index, int row, int col) {

		return workbook.getSheetAt(index).getRow(row).getCell(col).getStringCellValue();
	}

	public static int getNumericCellData(String sheetname, int row, int col) {

		return (int) workbook.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
	}

	public static int getNumericCellData(int index, int row, int col) {

		return (int) workbook.getSheetAt(index).getRow(row).getCell(col).getNumericCellValue();

	}

}
