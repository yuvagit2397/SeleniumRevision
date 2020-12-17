package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class prac {
	static FileInputStream fs;
	static Workbook wb;
	static Sheet sheet;

	public static void fetchAllData() throws IOException {
		//commonMethod();
		String s = "D:\\desktopfiles\\datadriven.xlsx";
		File f=new File(s);
		fs = new FileInputStream(f);
		wb = new XSSFWorkbook(fs);
		sheet = wb.getSheet("sheet1");
  int noOfRows = sheet.getPhysicalNumberOfRows();
  for (int i = 0; i < noOfRows; i++) {
	Row row = sheet.getRow(i);
	int noOfCells = row.getPhysicalNumberOfCells();
	String value="";
	for (int j = 0; j < noOfCells; j++) {
		Cell cell = row.getCell(j);
		if(cell.getCellType().equals(CellType.STRING)) {
		value = cell.getStringCellValue();
		}else if(cell.getCellType().equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long)numericCellValue;
			value = String.valueOf(l);
		}
	}
	System.out.println(value);
}
	}

	public static void particularRow() {

	}

	public static void particularColumn() {

	}
	public static void main(String[] args) throws IOException {
		fetchAllData();
	}

}
