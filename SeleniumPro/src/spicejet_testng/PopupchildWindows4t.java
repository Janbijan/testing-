package spicejet_testng;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PopupchildWindows4t {
	public WebDriver driver;
	public void login()
	{

		  driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.name("submit")).click();  
			driver.findElement(By.id("closediv")).click();
			}
  @Test
  public void f() {
	  login() ;
	  
  }
  
	

@BeforeTest
  public void beforeTest(){
  System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");

	driver = new ChromeDriver();
	
driver.manage().window().maximize();
	
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://selenium4testing.com");
}
  

  @AfterTest
  public void afterTest() {
  }

}
