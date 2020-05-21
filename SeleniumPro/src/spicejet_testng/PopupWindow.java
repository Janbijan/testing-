package spicejet_testng;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


	


	import org.testng.annotations.Test;

	import java.util.Set;

	import java.util.concurrent.TimeUnit;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.support.ui.Select;



	public class PopupWindow
	 {
		private WebDriver driver;


		
		public void login() {

			  driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("password")).sendKeys("admin");
				driver.findElement(By.name("submit")).click();  
		}
		
	  @Test
	  public void f() throws InterruptedException {
		  login() ;
		  driver.findElement(By.linkText("Feedback")).click();
		  Set<String> str = driver.getWindowHandles();
		  System.out.println(str);
		  Object[] s = str.toArray();
		  driver.switchTo().window(s[1].toString());
		  driver.findElement(By.id("name")).sendKeys("TEsting");
		  driver.findElement(By.id("email")).sendKeys("nag@gmail.com");
		  new Select(driver.findElement(By.id("car"))).selectByVisibleText("Mercedes");
		  Thread.sleep(2000);
		  driver.close();
		  driver.switchTo().window(s[0].toString());
		  driver.findElement(By.linkText("ADT")).click();
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
	  }

	}
