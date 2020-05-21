package imptestng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
	
	
public class Hmsadmissionadvise {
	WebDriver driver;
	
	@Test public  void f() throws InterruptedException {
	
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin");
driver.findElement(By.name("submit")).click();
driver.findElement(By.linkText("ADT")).click();
driver.findElement(By.linkText("Admission Advice")).click();
driver.findElement(By.name("MR_NO")).sendKeys("PR");
Thread.sleep(2000);
String str=driver.findElement(By.xpath("//*[@id='results']")).getText();

System.out.println(str);
Thread.sleep(2000);
String[] s=str.split("/n");
Thread.sleep(2000);
System.out.println(s.length);
for(int i=0;i<s.length;i++)
{
	if(s[i].equalsIgnoreCase("PR5607014843")){
		System.out.println(s[i]);
	}
	}



}
		
	
		 @BeforeTest
		  public void beforeTest() {
System.setProperty("webdriver.chrome.driver","D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("http://selenium4testing.com/hms/");}
		
		@AfterTest
		public void afterTest() {
		{
		}
		}

}
