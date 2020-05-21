package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel {

	
	public static void main(String[] args) throws IOException, InterruptedException   {
		Library Lb = new Library();
		Lb.OpenApp("http://183.82.100.55/ranford2");
		Lb.AdminLgn("Admin","M1ndq");
		//to get data from excel(right click-found.xlsx->properties->location) 
	//WorkBook(xssf=extendalble spread sheet format) 
FileInputStream fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\Role.xlsx");
		XSSFWorkbook Wb=new XSSFWorkbook(fis);
	//Sheet
		XSSFSheet Ws=Wb.getSheet("Sheet1");
		//Row count
		int RC=Ws.getLastRowNum();
		System.out.println(RC);
		//Multiple iteration
		for(int i=1;i<=RC;i++)
		{
		//row
			XSSFRow Wr=Ws.getRow(i);
			XSSFCell Wc=Wr.getCell(0);
			XSSFCell Wc1=Wr.getCell(1);
			XSSFCell Wc2=Wr.getCell(2);
//string
			String Rname=Wc.getStringCellValue();
			String Rdes=Wc1.getStringCellValue();
			String Rtyp=Wc2.getStringCellValue();
			
			
		      String Res=Lb.Role(Rname,Rdes,Rtyp);
		      System.out.println(Res);
		      
		      Wc2.setCellValue(Res);
		      
		      
		}
		
		FileOutputStream Fos=new FileOutputStream("D:\\Seleniumsoftware\\SeleniumWorkspace\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
		Wb.write(Fos);
		Wb.close();
		
		}


			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			String Res=Lb.Role(Rname,Rdes,Rtyp);
		      System.out.println(Res);
		      
		      Wc2.setCellValue(Res);
		      
		      
		}
		//right click on result package-propr=erties->location->give some name for resulting data in eclipse
		FileOutputStream Fos=new FileOutputStream("D:\\Seleniumsoftware\\SeleniumWorkspace\\Ebanking\\src\\com\\ebanking\\results\\Res_Found.xlsx");
		Wb.write(Fos);
		Wb.close();
		
			

			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	}


