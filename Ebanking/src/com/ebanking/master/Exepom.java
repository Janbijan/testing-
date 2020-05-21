package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exepom 
{
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2/");
		//page factory
		RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
		RHP.Login();
	AdminHP ADHP=PageFactory.initElements(driver, AdminHP.class);
		ADHP.BR();
		Branchcreationpom Bpom=PageFactory.initElements(driver,Branchcreationpom.class );
		Bpom.Brancre();
		
		ADHP.Rol();
		Rolecrepom Rpom=PageFactory.initElements(driver,Rolecrepom.class);
		Rpom.Rolecre();
		
		
		
   }

	
	
   			
   
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

