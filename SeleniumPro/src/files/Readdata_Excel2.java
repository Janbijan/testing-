package files;

import java.io.FileInputStream;

import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;


public class Readdata_Excel2 {
 
 @Test
  public void f() throws Exception
 {
	 
 FileInputStream fi = new FileInputStream(".\\TestData\\HMSLogin.xlsx");
	  Workbook w = new XSSFWorkbook(fi);
	 
 Sheet s = w.getSheet("Sheet1");
	  
System.out.println(s.getLastRowNum());
	  
	 
 for (int i = 0; i <= s.getLastRowNum(); i++) {
		
Row r = s.getRow(i);
		
System.out.println(r.getLastCellNum());
		
for (int j = 0; j < r.getLastCellNum(); j++) {
	
		
			
Cell c = r.getCell(j);
			System.out.println(c);
	
		}
		
	}
	
  
  }
}














	