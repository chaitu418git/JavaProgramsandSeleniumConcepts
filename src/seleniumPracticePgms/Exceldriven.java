package seleniumPracticePgms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldriven {
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static void main(String []args) throws IOException
	{
		 
		String value=getCellData(3,1);
		System.out.println(value);
		String value1=setCellData("automation", 2, 1);
		System.out.println(value1);
		
	}
	public static String getCellData(int rownum, int col) throws IOException
	{
		 fis = new FileInputStream("E:\\Apache POI\\Data.xlsx");
		  wb = new XSSFWorkbook(fis);
		 sheet = wb.getSheetAt(0);
		 row = sheet.getRow(rownum);
		 cell = row.getCell(col);
		// cell.setCellValue("hai");
		 return cell.getStringCellValue();
		 
		 
	}
	public static String setCellData(String text,int rownum, int col) throws IOException
	{
		 fis = new FileInputStream("E:\\Apache POI\\Data.xlsx");
		  wb = new XSSFWorkbook(fis);
		 sheet = wb.getSheetAt(0);
		 row = sheet.getRow(rownum);
		 cell = row.getCell(col);
		 cell.setCellValue(text);
		 return cell.getStringCellValue();
	}
	
}
