package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Library {

	
	
	WebDriver driver;
     String Expval,Actval;
     FileInputStream FIS;
     Properties PR;
	
	public String OpenApp(String Url) throws IOException
	{
		FIS=new FileInputStream("D:\\Seleniumsoftware\\SeleniumWorkspace\\Ebanking\\src\\com\\ebanking\\properties\\Rep.properties");
		PR=new Properties();
		PR.load(FIS);
		
		 Expval="Ranford Bank";
			
			//Launch Browser
			
		    driver=new FirefoxDriver();
			
//Url
			
			driver.get(Url);
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
			
			return "Pass";
			
	}
	
	 public String AdminLgn(String un,String pwd) throws InterruptedException
	{
		Expval="Welcome to Admin";
		Thread.sleep(3000);
		driver.findElement(By.id(PR.getProperty("Uname"))).sendKeys(un);
		driver.findElement(By.id(PR.getProperty("Pswd"))).sendKeys(pwd);
		
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
				return Actval;
				
		
	}
	
	public String Branchcre(String Bn,String Add1,String Zc,String cty,String state,String city) throws InterruptedException
	{
		Expval="Sucessfully";		
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id(PR.getProperty("Bnewbutton"))).click();
		
		
		driver.findElement(By.id(PR.getProperty("Bname"))).sendKeys(Bn);
		driver.findElement(By.id(PR.getProperty("Badd1"))).sendKeys(Add1);
		driver.findElement(By.id(PR.getProperty("Bzip"))).sendKeys(Zc);
		
		//dropdown
		
		Select Ctry=new Select(driver.findElement(By.id(PR.getProperty("Bcountry"))));
		Ctry.selectByVisibleText(cty);
		
		Select Sta=new Select(driver.findElement(By.id(PR.getProperty("Bstate"))));
		Sta.selectByVisibleText(state);

		Select Cty=new Select(driver.findElement(By.id(PR.getProperty("Bcity"))));
		Cty.selectByVisibleText(city);

		driver.findElement(By.id(PR.getProperty("Bsubmit"))).click();
		
		
		Thread.sleep(4000);
		
		
		
		//Alert
		
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		//Comparision
		
		if (Actval.contains(Expval)) 
		{
		System.out.println("Branch Created");	
		}
		else
		{
			System.out.println("Branch not created");
		}
		return Actval;
		
	

	}
	
	
	//Rolecre
	public String Role(String rn,String rd,String rt) throws InterruptedException
	{
		Expval="New Role Insertion ";
		Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	driver.findElement(By.id(PR.getProperty("newRole"))).click();
	Thread.sleep(4000);
driver.findElement(By.id((PR.getProperty("rolename")))).sendKeys(rn);
	driver.findElement(By.id(PR.getProperty("rolediscription"))).sendKeys(rd);
	Select state1 =new Select(driver.findElement(By.id("lstRtypeN")));
	state1.selectByVisibleText(rt);
	driver.findElement(By.id(PR.getProperty("rolesubmit"))).click();
	Thread.sleep(4000);
	//Alert
	 Actval=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	

			
			//home
			driver.findElement(By.xpath((".//*[@id='Table_01']/tbody/tr/td[1]/a/img"))).click();
			
			//Comparision
			
			if (Actval.contains(Expval)) 
			{
			System.out.println("Role created sucessfully");	
			}
			else
			{
				System.out.println("Rloe not created");
			}
		return Actval ;
	
	}
	//Empcre
	
	//Logout
	public void admlgt()
	{
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();
		
	}
	//Close
	public void Appc()
	{
		driver.close();
	}
	
	
}	
	

	
			
		
		
		
		

	
	


