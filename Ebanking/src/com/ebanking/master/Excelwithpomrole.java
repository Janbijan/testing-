package com.ebanking.master;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Excelwithpomrole 
	{

		WebDriver driver;
		
	    @BeforeTest
	    
		  public void login()
		  {
			  driver=new FirefoxDriver();
			  driver.manage().window().maximize();
			  driver.get("http://183.82.100.55/ranford2");
			  
			  //Pagefactory
			  
			  RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
			  RHP.Login();
		  }
			  
		  
	  @Test
	    public void Rolec() throws IOException
	    {
	  	
	    	

	    	//To get Test Data Excel File
	    	
	    			FileInputStream Fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\Role.xlsx");
	    			
	    			//Workbook
	    			
	    			XSSFWorkbook WB=new XSSFWorkbook(Fis);
	    			
	    			//Sheet
	    			
	    			XSSFSheet WS=WB.getSheet("Sheet1");
	    			
	    			//Rowcount
	    			
	    			int Rcount=WS.getLastRowNum();
	    			System.out.println(Rcount);
	    			
	    			//Multiple Iterations-------Loop
	    			
	    			//For Loop
	    			
	    			for (int i=1;i<=Rcount;i++) 
	    			{
	    			  //Row
	    				
	    				XSSFRow WR=WS.getRow(i);
	    				
	    				//Cells
	    				
	    				XSSFCell WC=WR.getCell(0);
	    				XSSFCell WC1=WR.getCell(1);
	    				XSSFCell WC2=WR.getCell(2);
	    				
	    				//XSSFCell WC2=WR.createCell(2);
	    				
	    				//Cell Values
	    				
	    				String Rname=WC.getStringCellValue();
	    				String Roledescr=WC1.getStringCellValue();
	    				String Rtyp=WC2.getStringCellValue();
	    			

	    				AdminHP AdHP=PageFactory.initElements(driver, AdminHP.class);
	    				  AdHP.Rol();
	    				  
	    				  
	    				  //New role
	    				  
	    				  Rolecrepom Rcpom=PageFactory.initElements(driver,Rolecrepom.class);
	    				  Rcpom.NewRole();
	    				  
	    				  //Role creation
	    				 
	    				  Rolecre Rc=PageFactory.initElements(driver,Rolecre.class);
	    				  Rc.rcre(Rname,Rtyp);
	    				  
	    				  
	    				  //Alert
	    				  driver.switchTo().alert().accept();

	    				  //Home
	    				  RD.Rhome();
	    				  
	    		    }
	    		    			
	    		    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
