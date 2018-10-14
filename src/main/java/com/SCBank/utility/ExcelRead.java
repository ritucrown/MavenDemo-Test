package com.SCBank.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import MavenDemo.MavemDemo.Base;

public class ExcelRead {

	public void  excelReader(String strFileName, String strSheetName) throws IOException {
		Base base = new Base();
		Workbook wb;
		Workbook workbook;
		Sheet sheet;
		FileInputStream fileInput;
		Row row;
		Cell cell;
		
		System.out.println(base.getExcelFilePath());
		String filePath = base.getExcelFilePath()+strFileName;
		String strFileExtension = filePath.substring(filePath.indexOf("."));
		
		fileInput = new FileInputStream(filePath);
		if (strFileExtension.equals(".xlsx")) {
					
			
		} else if(strFileExtension.equals(".xls")){
			wb = new HSSFWorkbook(fileInput);
			sheet = wb.getSheet(strSheetName);
			row = sheet.getRow(0);
			int rowCount = sheet.getLastRowNum();
			int colCount = row.getLastCellNum();
		}
	}
	
	
}
