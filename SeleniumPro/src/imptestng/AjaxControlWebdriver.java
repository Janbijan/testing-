package imptestng;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxControlWebdriver 
{
	WebDriver driver;
	@Test
	  public void f() throws InterruptedException {
		 
		 
	
	driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		
	  Thread.sleep(2000);
		 
	 String str =driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[2]/div[2]")).getText();

		  System.out.println(str);
		
	  String[] s = str.split("\n");
		 

	 System.out.println(s.length);
		
	  for (int i = 0; i < s.length; i++) {
			
	  if(s[i].equalsIgnoreCase("selenium webdriver tutorial"))
			  {
				 
	 System.out.println(s[i]);
				 
	 driver.findElement(By.name("q")).clear();
				 
	 driver.findElement(By.name("q")).sendKeys(s[i]);

			  }
		}
	  }
	 
	 @BeforeTest
	  public void beforeTest() {
		  
	System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
		
		driver = new ChromeDriver();
			
	driver.manage().window().maximize();
			
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	driver.get("http://google.com/");

	  }

	 
	 @AfterTest
	  public void afterTest() 
	 {
	  }

	


}
