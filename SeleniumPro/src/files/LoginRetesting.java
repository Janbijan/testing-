package files;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;


import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.util.concurrent.TimeUnit;

 org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;


public class LoginRetesting {

	WebDriver driver;
 
 @Test
  public void f() throws Exception
 {
	  
FileInputStream fi = new FileInputStream("D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe\\TestData\\HMSData.xlsx");
	  Workbook w = new XSSFWorkbook(fi);
	  Sheet s = w.getSheet("Sheet1");
	  for (int i = 1; i <= s.getLastRowNum(); i++) {
		  Row r = s.getRow(i);	
		  Cell username = r.getCell(0);
		  Cell password = r.getCell(1);
		  driver.findElement(By.name("username")).sendKeys(username.toString());
			driver.findElement(By.name("password")).sendKeys(password.toString());
			driver.findElement(By.name("submit")).click(); 
			Thread.sleep(2000);
			try {
				driver.findElement(By.linkText("Logout")).click();	
			}catch(Exception e) {
				//driver.switchTo().alert().accept();
			}
			
	}
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
driver.get("http://selenium4testing.com/hms/");
 
 }

  @AfterTest
  public void afterTest() {
	
  driver.quit();
  }

}









