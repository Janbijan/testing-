package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Libraryng {

	
	
	WebDriver driver;
    String Expval,Actval;
    FileInputStream FIS;
    Properties PR;
	@Test(priority=1)
	public void OpenApp() throws IOException
	{
		 Expval="Ranford Bank";
			
			//Launch Browser
			
		    driver=new FirefoxDriver();
			
//Url
			
			
			driver.get("http://183.82.100.55/ranford2/");
			FIS=new FileInputStream("D:\\Seleniumsoftware\\SeleniumWorkspace\\Ebanking\\src\\com\\ebanking\\properties\\Rep.properties");
			PR=new Properties();
			PR.load(FIS);
			//Maximise
			
			driver.manage().window().maximize();
			
		 Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
			
			//Comparision
			
			if (Expval.equalsIgnoreCase(Actval)) 
			{
			System.out.println("Ranford Application Launch Succ");	
			}
			else
			{
				System.out.println("Ranford Application Not Launch");	
			}
			
			
			
	}
	@Test(priority=2)
	 public void AdminLgn() throws InterruptedException
	{
		Expval="Welcome to Admin";
		Thread.sleep(3000);
		driver.findElement(By.id(PR.getProperty("Uname"))).sendKeys("Admin");
		driver.findElement(By.id(PR.getProperty("Pswd"))).sendKeys("M1ndq");
		
		driver.findElement(By.id(PR.getProperty("Lgn"))).click();
		
		Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//Comparision
		
				if (Expval.equalsIgnoreCase(Actval)) 
				{
				System.out.println("Admin Login Succ");	
				}
				else
				{
					System.out.println("Admin Login Failed");	
				}
				
		
	}
	
		
		
}
	
	


