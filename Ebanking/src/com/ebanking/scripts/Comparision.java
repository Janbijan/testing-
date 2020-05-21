package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Comparision {

		public static void main(String[] args) {
			String Expval=" Ranford Bank";
			//Launch 
			
			WebDriver driver=new FirefoxDriver();
			
			//URL
			
			driver.get("http://183.82.100.55/ranford2");
			//maximize
			driver.manage().window().maximize();
			
			
			String Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
			//Comparision
			
			if (Expval.equalsIgnoreCase(Actval)) 
			{
			System.out.println("Ranford Application Launch Succ");	
			}
			else
			{
				System.out.println("Ranford Application Not Launch");
				}
			/*//get title
				
		String Tit=driver.getTitle();
				System.out.println(Tit);*/
				//Login
			String Expaval="Welcome to Admin";
			driver.findElement(By.id("txtuId")).sendKeys("Admin");
			driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
			driver.findElement(By.id("login")).click();
			String Actuval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();	
			//Comparision
			if(Expaval.equalsIgnoreCase(Actuval))
				System.out.println(" Admin login sucessfully");
		
			else
			{
				System.out.println(" Admin login is  not sucessfully");
			}
}
			
			
}
          