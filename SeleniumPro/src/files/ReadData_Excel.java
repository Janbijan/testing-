package files;



import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;


public class ReadData_Excel 
{
  @Test(enabled = false)
 
 public void f() throws IOException
 {
	  //FileInputStream fi =new FileInputStream("C:\\Nagesh\\WorkSpace730AM_19Dec\\SeleniumAutomation\\TestData\\HMSLogin.xlsx");

	  FileInputStream fi =new FileInputStream(".\\TestData\\HMSLogin.xlsx");
	  
Workbook w= new XSSFWorkbook
Sheet s = w.getSheet("Sheet1");
	  Row r = s.getRow(0);
	  Cell c = r.getCell(0);
	 

 Cell c1 = r.getCell(1);
	 
 System.out.println(c);
	  System.out.println(c1);
	  
	  Row r1 = s.getRow(1);
	  
Cell c2 = r1.getCell(0);
	  
Cell c3 = r1.getCell(1);
	  System.out.println(c2);
	  
System.out.println(c3);

	  
	 
 Row r2 = s.getRow(2);
	 
 Cell c4 = r2.getCell(0);
	  

Cell c5 = r2.getCell(1);
	
  System.out.println(c4);
	  
System.out.println(c5);
	  
 
 }
  @Test(enabled = false)
 
 public void f2() throws IOException
 {
	 
 FileInputStream fi =new FileInputStream(".\\TestData\\HMSLogin.xlsx");

	  Workbook w = new XSSFWorkbook(fi); /// to support .xlsx
	

  Sheet s  = w.getSheet("Sheet1");
	  System.out.println(s.getLastRowNum());
	 
 for(int i =0; i <= s.getLastRowNum(); i++)
	  {
		  Row r = s.getRow(i);
		
  Cell c1 = r.getCell(0);
		  Cell c2 = r.getCell(1);
		  
System.out.println(c1);

		  System.out.println(c2);  
	  }

  }
  @Test
  public void f2_xls() throws IOException {

	  FileInputStream fi =new FileInputStream(".\\TestData\\HMSLogin.xls");
	
  Workbook w = new HSSFWorkbook(fi);  // to support .xls
	 
 Sheet s  = w.getSheet("Sheet1");
	  System.out.println(s.getLastRowNum());
	 
 for(int i =0; i <= s.getLastRowNum(); i++)
	  {
		 
 Row r = s.getRow(i);
		  
Cell c1 = r.getCell(0);
		  Cell c2 = r.getCell(1);
		 
 System.out.println(c1);
		  System.out.println(c2);  
	  

}
  }












