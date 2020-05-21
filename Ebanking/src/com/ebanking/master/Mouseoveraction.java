package com.ebanking.master;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mouseoveraction {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://accounts.google.com");
			JavascriptExecutor jsx=(JavascriptExecutor)driver;
             jsx.executeScript("window.confirm('selenium')");
             Thread.sleep(2000);
             String a=driver.switchTo().alert().getText();
             System.out.println(a);
             Thread.sleep(2000);
             driver.switchTo().alert().dismiss();
             
             
             

	}

}
