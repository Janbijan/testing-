package imptestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WebTable_HMS  {

	WebDriver driver;

  @Test
  public void login() {
			 
		  driver.findElement(By.name("username")).sendKeys("admin");

		 			driver.findElement(By.name("password")).sendKeys("admin");

		 			driver.findElement(By.name("submit")).click(); 
		  
		 			driver.findElement(By.linkText("Registration")).click();

		 	}
		   @Test
		   public void f() {
		 	
		   login();
		 	 
		  String str = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]")).getText();
		 	
		  System.out.println(str);
		 	
		   String[] s = str.split("\n");
		 	
		   System.out.println(s.length);
		 	 
		  for (int i = 0; i < s.length; i++) {
		 		
		   if(s[i].contains("*"))
		 		  {
		 			 

		  System.out.println(s[i]);
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
