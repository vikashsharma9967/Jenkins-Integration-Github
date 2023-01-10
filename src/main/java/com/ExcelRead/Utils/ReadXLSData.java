package com.ExcelRead.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.flipkart.Constants.FrameworkConstant;

public class ReadXLSData {
	
	
	@DataProvider(name="byData")
	public String[][] getData(Method m) throws Exception
	{
		String excelSheetName = m.getName();
		File f = new File(FrameworkConstant.ExcelPath);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetName = wb.getSheet(excelSheetName);
		
		
		int totalRows = sheetName.getLastRowNum();
		
		Row rowCells = sheetName.getRow(0);
		
		int totalCols = rowCells.getLastCellNum();
		
		DataFormatter format = new DataFormatter();
		String testData[][] = new String[totalRows][totalCols];
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=0;j<totalCols;j++)
			{
				testData[i-1][j] = format.formatCellValue(sheetName.getRow(i).getCell(j));
				
			}
		}
		
		
		
		
		 
		return testData;
	
	}
	
	

}
