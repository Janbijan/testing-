package files;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import org.apache.poi.ss.usermodel.Cell;
import org.testng.annotations.Test;


public class AddInputDataToResultFile
  @Test
  public void f() throws Exception {
	  FileInputStream fi =new FileInputStream("D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe\\TestData\\HMSData.xlsx");
Workbook w = new XSSFWorkbook(fi);
	  Sheet s =w.getSheet("Sheet1");
	
  File f =new File("D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe\\Results\\HMSLoginResults.html");
	 
 FileWriter fw = new FileWriter(f);

	  BufferedWriter bw = new BufferedWriter(fw);
	
  bw.write("<html>");
	 
 bw.write("<body>");
	 
 bw.write("<table cellspacing='2' cellpading='2' border='3'>");
	
  bw.write("<tbody>");

	  bw.write("<tr>");
	
  bw.write("<td> Username </td>");
	
  bw.write("<td> Password </td>");
	 
 bw.write("<td> Result </td>");
	
 bw.write("</tr>");
	  for (int i = 1; i <= s.getLastRowNum(); i++) {
		
Row r =s.getRow(i);
		
Cell username = r.getCell(0);
		
Cell passwrod = r.getCell(1);
		
bw.write("<tr>");
			
bw.write("<td>");

			
bw.write(username.toString());
			
bw.write("</td>");

			
bw.write("<td>");
			
bw.write(passwrod.toString());
			
bw.write("</td>");
			
bw.write("<td>");
			
bw.write("Pass");
			
bw.write("</td>");}}
  )	