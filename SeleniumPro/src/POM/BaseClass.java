package POM;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;


import org.apache.log4j.Logger;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

//
import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;


public class BaseClass {
	
public WebDriver driver;
Logger log = Logger.getLogger(BaseClass.class);


public void openBrowser()
 {
		 
 System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
			
driver = new ChromeDriver();
			
driver.manage().window().maximize();
			
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	}
	
public void openURL(String url)
 {
		
driver.get(url);
	
}
	
public void enterText(By loc, String data) 
{
		
driver.findElement(loc).sendKeys(data);
log.info("Entered the value in the text box");
	
}
	
public void click(By loc) {
		
driver.findElement(loc).click(); 	
	
}
	
public void select(By loc, String data) 
{
		
 new Select(driver.findElement(loc)).selectByVisibleText(data);	
	
}
	public void select(By loc, int data)
 {
		 
 new Select(driver.findElement(loc)).selectByIndex(data);
	
}
	
public void navigateToFrame(By loc) 
{
		
driver.switchTo().frame(driver.findElement(loc));
	
}
	
	
public void alert_OK() {
		
driver.switchTo().alert().accept();
	
}
	
public void alert_Cancel()
 {
		
driver.switchTo().alert().dismiss();

	}
public String printText()
{
	
	String str = driver.switchTo().alert().getText();
		
System.out.println(str);
		
return str;
		
	}
}

























