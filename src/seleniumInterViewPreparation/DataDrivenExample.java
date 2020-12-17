package seleniumInterViewPreparation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import sbasics.BaseClass;

public class DataDrivenExample extends BaseClass {
	static FileInputStream fs;
	static Workbook wb;
	static Sheet sheet;

	public static void commonMethod() throws IOException {
		// String s = "D:\\desktopfiles\\datadriven.xlsx";
		File f = new File("D:\\desktopfiles\\datadriven.xlsx");
		fs = new FileInputStream(f);
		wb = new XSSFWorkbook(fs);
		sheet = wb.getSheet("sheet1");
	}

	public static void fetchAllData() throws IOException {
		commonMethod();
		int noOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < noOfRows; i++) {
			Row row = sheet.getRow(i);
			int noOfCells = row.getPhysicalNumberOfCells();
			String value = "";
			for (int j = 0; j < noOfCells; j++) {
				Cell cell = row.getCell(j);
				if (cell.getCellType().equals(CellType.STRING)) {
					value = cell.getStringCellValue();
					System.out.println(value);
				} else if (cell.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}
		}
	}

	public static void particularRow() throws IOException {
		commonMethod();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the data");
		String nextLine = scanner.nextLine();
		String actual=nextLine;
		int rowIndex=0;
		int p = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < p; i++) {
			Row row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			String value = "";
			for (int j = 0; j < cells; j++) {
				Cell cell = row.getCell(j);

				if (cell.getCellType().equals(CellType.STRING)) {
					value = cell.getStringCellValue();
					if(actual.equalsIgnoreCase(value)) {
				 rowIndex = cell.getRowIndex();
						
					}
				} else if (cell.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					if(actual.equalsIgnoreCase(value)) {
					rowIndex = cell.getRowIndex();
					}
				}
          
			}
		
		}
		Row row = sheet.getRow(rowIndex);
		int allCell = row.getPhysicalNumberOfCells();
		String v="";
		for (int i = 0; i < allCell; i++) {
			Cell cell = row.getCell(i);
			if (cell.getCellType().equals(CellType.STRING)) {
				v = cell.getStringCellValue();
				System.out.println(v);
			} else if (cell.getCellType().equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				v= String.valueOf(l);
				System.out.println(v);
			}
		}
	}

	public static void particularColumn() throws IOException {
		String path="D:\\desktopfiles\\datadriven.xlsx";
		
		seleniumInterViewPreparation.BaseClass.getParticularRowIndex("1", path, "sheet1","col");
	     
		}

	public static void main(String[] args) throws IOException {
		// fetchAllData();
		//particularRow();
		particularColumn();
	}

}
