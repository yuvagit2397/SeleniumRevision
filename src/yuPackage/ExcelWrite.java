package yuPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static  void writeOnce() throws IOException {
		int idcolumnIndex=0;
		int branchIndex=0;
		int rowIndex=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the data");
		String nextLine = scanner.nextLine();
		String actual=nextLine;
		File f=new File("D:\\desktopfiles\\datadriven.xlsx");
		FileInputStream fs=new FileInputStream(f);
		 Workbook wb=new XSSFWorkbook(fs);
		 Sheet sheet=wb.getSheet("sheet1");
		 int p = sheet.getPhysicalNumberOfRows();
			for (int i = 0; i < p; i++) {
				Row row = sheet.getRow(i);
				int cells = row.getPhysicalNumberOfCells();
				String value = "";
				for (int j = 0; j < cells; j++) {
					Cell cell = row.getCell(j);
					if (cell.getCellType().equals(CellType.STRING)) {
						value = cell.getStringCellValue();
						if (value.equalsIgnoreCase("id")) {
							 idcolumnIndex = cell.getColumnIndex();
							 System.out.println("columnindex is"+idcolumnIndex);
						}
						else if (value.equalsIgnoreCase("branch")) {
							branchIndex = cell.getColumnIndex();
							 System.out.println("branchindex is"+branchIndex);
						}
						
						if(actual.equalsIgnoreCase(value)) {
							  if (cell.getColumnIndex()==idcolumnIndex){
								  rowIndex = cell.getRowIndex();
								  sheet.getRow(rowIndex).createCell(branchIndex).setCellValue("uthangarai");
									 break;
							}
				        }
						}
					else if (cell.getCellType().equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						long l = (long) numericCellValue;
						value = String.valueOf(l);
						if(actual.equalsIgnoreCase(value)) {
							  if (cell.getColumnIndex()==idcolumnIndex){
								  rowIndex = cell.getRowIndex();
								  sheet.getRow(rowIndex).createCell(branchIndex).setCellValue("uthangarai");
									 break;
							}
				        }
					}
					}
				}
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			wb.close();
					
	}

	public static void writeAnyWhere() throws IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the data");
		String nextLine = scanner.nextLine();
		String actual=nextLine;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the repalcing data");
		String next = sc.nextLine();
		String replace=next;
		File f1=new File("D:\\desktopfiles\\datadriven.xlsx");
		FileInputStream fs1=new FileInputStream(f1);
		 Workbook wb1=new XSSFWorkbook(fs1);
		 Sheet sheet1=wb1.getSheet("sheet1");
		 int p = sheet1.getPhysicalNumberOfRows();
			for (int i = 0; i < p; i++) {
				Row row1 = sheet1.getRow(i);
				int cells = row1.getPhysicalNumberOfCells();
				String value = "";
				for (int j = 0; j < cells; j++) {
					Cell cell1 = row1.getCell(j);
						if (cell1.getCellType().equals(CellType.STRING)) {
							value = cell1.getStringCellValue();
							if (actual.equalsIgnoreCase(value)) {
								cell1.setCellValue(replace);
							}
						} else if (cell1.getCellType().equals(CellType.NUMERIC)) {
							double numericCellValue = cell1.getNumericCellValue();
							long l = (long) numericCellValue;
							value = String.valueOf(l);
							if (actual.equalsIgnoreCase(value)) {
								cell1.setCellValue(replace);
							}
						}
					}	
	}
			
			FileOutputStream fos1=new FileOutputStream(f1);
			wb1.write(fos1);
			wb1.close();
			}
	
	public static void main(String[] args) throws IOException {
		//writeOnce();
		writeAnyWhere();
	}
}
