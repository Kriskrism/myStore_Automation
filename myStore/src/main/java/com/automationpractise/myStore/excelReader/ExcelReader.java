package com.automationpractise.myStore.excelReader;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public String path;
	public FileInputStream fis;
	public XSSFWorkbook workbook;
	
	public ExcelReader(String path) {
		this.path = path;
		try {
			//provide the path where the excel sheet is located
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String[][] getdata(String excelName, String sheetName){
	
		String dataset[][] = null;
		
		try {
			//get the sheet from the workbook
			XSSFSheet sheet = workbook.getSheet(sheetName);
			
			//get the rows and columns of the sheet
			int totalRow = sheet.getLastRowNum() +1;
			
			//get the column/ cell
			int totalColumn = sheet.getRow(0).getLastCellNum();
			
			//declare the array with the row and column count
			dataset = new String[totalRow -1][totalColumn];
			
			//run a for loop to store data into the array from the excel sheet
			
			for(int i = 1; i < totalRow; i++) {
				
				XSSFRow row = sheet.getRow(i);
				
				//get the column
				
				for(int j= 0; j< totalColumn; j++) {
					XSSFCell cell = row.getCell(j);
					
					//checking if the cell content is of type string
					if(cell.getCellType() == Cell.CELL_TYPE_STRING) {
						dataset[i - 1][j] = cell.getStringCellValue();
					}
					//checking if the cell content is of type number
					else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						String cellText = String.valueOf(cell.getNumericCellValue());
						dataset[i-1][j] = cellText;
					}
					//checking if the cell content is of type boolean
					else
						dataset[i-1][j]= String.valueOf(cell.getStringCellValue());
					
				}
			}
			
			//return dataset;
			
		}catch(Exception e) {
			e.printStackTrace();
		}return dataset;
		
}
	
	

}
