package seleniumInterViewPreparation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDuplicateRows {
	static int rowIndex=0;
	
	public static void getRows() throws IOException {
		int columnIndex=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the data");
		String nextLine = scanner.nextLine();
		String actual=nextLine;
	 FileInputStream fs=new FileInputStream("D:\\desktopfiles\\datadriven.xlsx");
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
						 columnIndex = cell.getColumnIndex();
						 System.out.println("columnindex is"+columnIndex);
					}
				  if(actual.equalsIgnoreCase(value)) {
					  if (cell.getColumnIndex()==columnIndex){
						  rowIndex = cell.getRowIndex();
							 break;
					}
				
					}
					else {
						rowIndex=rowIndex-1;
					}
				} 
				else if (cell.getCellType().equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					if(actual.equalsIgnoreCase(value)) {
						if (cell.getColumnIndex()==columnIndex) {
							  rowIndex = cell.getRowIndex();
								 break;
						}
					
					}
					else {
						rowIndex=rowIndex-1;
					}
				}
       
			}
			//try {
			if (rowIndex>=0) {
			Row row1	 = sheet.getRow(rowIndex);
			int allCell = row1.getPhysicalNumberOfCells();
			String v="";
			for (int k = 0; k< allCell; k++) {
				Cell cell = row1.getCell(k);
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
			}
			//catch (NullPointerException e) {
			//}
			//finally{
				//}
			//}
		
	}
	public static void main(String[] args) throws IOException {
		getRows();
	}
}
