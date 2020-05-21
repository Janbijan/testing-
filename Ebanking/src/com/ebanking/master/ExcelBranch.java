package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBranch {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		Library Lb = new Library();
		Lb.OpenApp("http://183.82.100.55/ranford2");
		Lb.AdminLgn("Admin","M1ndq");
		//To get data from excel
		FileInputStream fis= new FileInputStream("D:\\Seleniumsoftware\\SeleniumWorkspace\\Ebanking\\src\\com\\ebanking\\testdata\\Branchcre.xlsx");
		XSSFWorkbook Wb=new XSSFWorkbook(fis);
		//sheet
		XSSFSheet sh=Wb.getSheet("Branchsheet1");
		//count
		int RC=sh.getLastRowNum();
		System.out.println(RC);
		//multiple iteration
		for(int i=1;i<=RC;i++){
			
			XSSFRow Wr=sh.getRow(i);
			XSSFCell Wc=Wr.getCell(0);
			XSSFCell Wc1=Wr.getCell(1);
			XSSFCell Wc2=Wr.getCell(2);
			XSSFCell Wc3=Wr.getCell(3);
			XSSFCell Wc4=Wr.getCell(4);
			XSSFCell Wc5=Wr.getCell(5);
		
		//string
		String brnam=Wc.getStringCellValue();
		String bradd=Wc1.getStringCellValue();
		String brzip=Wc2.getStringCellValue();
		String brcnt=Wc3.getStringCellValue();
		String brste=Wc4.getStringCellValue();
		String brcty=Wc5.getStringCellValue();
		String Res=Lb.Branchcre(brnam,bradd,brzip,brcnt,brste,brcty);
	      System.out.println(Res);
	      
	      Wc5.setCellValue(Res);
	      
		}  
		//right click on result package-propr=erties->location->give some name for resulting data in eclipse
				FileOutputStream Fos=new FileOutputStream("D:\\Seleniumsoftware\\SeleniumWorkspace\\Ebanking\\src\\com\\ebanking\\results\\Res_Branchcre.xlsx");
				Wb.write(Fos);
				Wb.close();
				
					

					
					
					
					
					
					
				}
		
		
		
		
		
		
}
	
	


