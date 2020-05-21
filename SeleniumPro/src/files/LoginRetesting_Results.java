package files;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;


import java.io.BufferedWriter;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileWriter;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;


public class LoginRetesting_Results {
	
WebDriver driver;
	
String str;
	
Logger log = Logger.getLogger(LoginRetesting_Results.class);
 
 @Test
  public void f() throws Exception {
	
  FileInputStream fi = new FileInputStream("C:\\Nagesh\\WorkSpace730AM_19Dec\\SeleniumAutomation\\TestData\\HMSData.xlsx");
	
  Workbook w = new XSSFWorkbook(fi);

	  
Sheet s = w.getSheet("Sheet1");
	  
	 
 File f =new File(".\\Results\\HMSLoginResults.html");
	 
 FileWriter fw = new FileWriter(f);
	  
BufferedWriter bw = new BufferedWriter(fw);
	  
bw.write("<html>");
	  bw.write("<body>");
	 
 bw.write("<table cellspacing='2' cellpading='3' border='3'>");
	
  bw.write("<tbody>");
	  bw.write("<tr>");
	  
bw.write("<td><font size='5' color='blue'> Username </font></td>");

	  bw.write("<td><font size='5' color='blue'> Password </font></td>");
	 
 bw.write("<td><font size='5' color='blue'> Result </font></td>");
	 
 bw.write("</tr>");
	
  for (int i = 1; i <= s.getLastRowNum(); i++) {
		 
 Row r = s.getRow(i);	
		
  Cell username = r.getCell(0);
		 
 Cell password = r.getCell(1);
		  

bw.write("<tr>");
		 
 bw.write("<td>");
		 
 bw.write(username.toString());
		 
 bw.write("</td>");
		  
bw.write("<td>" + password.toString() +"</td>");
		  
		  
 v driver.findElement(By.name("username")).sendKeys(username.toString());
		  
log.info("Entered the username");
			
driver.findElement(By.name("password")).sendKeys(password.toString());
			
 log.info("Entered the password");
			
driver.findElement(By.name("submit")).click(); 
			
 log.info("Clicked on login");
			
Thread.sleep(2000);
			
try {
				
driver.findElement(By.linkText("Logout")).click();	
				
str="Pass";
				
log.info("Login successful");
			}catch(Exception e) {
				
str="Fail";

				log.error("Login invalid");
				//driver.switchTo().alert().accept();
			}
			bw.write("<td>"+ str+ "</td>");
			bw.write("</tr>");
	}
	  bw.write("</tbody>"); 
	  bw.write("</table>");
	  bw.write("</body>");
	  bw.write("</html>");
	  bw.close();
  }
  @BeforeTest
  public void beforeTest() {
	  try {
		
System.setProperty("webdriver.chrome.driver", "");
			
driver = new ChromeDriver();
log.info("Opened the browser");
			
driver.manage().window().maximize();
			
log.info("Window maximised");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://selenium4testing.com/hms/");
			log.info("Opened the URL");
	
} 
catch (Exception 

log.fatal("Unable to open the URL" +e.getMessage());
	}
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}











	