package week6.day2;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
@Test
	public static String[][] readExcel(String filename) throws IOException {
		// TODO Auto-generated method stub
XSSFWorkbook wb=new XSSFWorkbook("./DATA/"+filename+".xlsx");
XSSFSheet sheet = wb.getSheetAt(0);
int rows = sheet.getLastRowNum();
System.out.println("Total number of rows : " +rows);
short col = sheet.getRow(0).getLastCellNum();
System.out.println("Total number of Column : " +col);
XSSFCell cell = sheet.getRow(1).getCell(0);
XSSFRichTextString firstrowfirstcolum = cell.getRichStringCellValue();
System.out.println(firstrowfirstcolum);
String[][] data=new String[rows][col];
for (int i = 1; i <=rows; i++) {
	XSSFRow row = sheet.getRow(i);
	for (int j = 0; j < col; j++) {
		String stringCellValue = row.getCell(j).getStringCellValue();
		System.out.println(stringCellValue);
		data[i-1][j]=stringCellValue;
	}
	
}
wb.close();
return data;
	}

}