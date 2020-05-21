package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crmparameters {

	public WebDriver driver1;
	public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver","D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
	driver1=new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void openURL(){
		driver1.get("https://freecrm.co.in/");
		
	}
	public void login(){
		driver1.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
	}
	
	public void enternamepsw(){
		driver1.findElement(By.name("email")).sendKeys("nag010683@gmail.com");
		driver1.findElement(By.name("password")).sendKeys("Nagesh@123");
		driver1.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
	}
	public void companies (){
		driver1.findElement(By.xpath("//*[@id='main-nav']/a[4]/span")).click();
		
	}
	
	public void New(){
		driver1.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	}
	
	
	public static void main(String[] args) {
		Crmparameters crm=new Crmparameters();
		crm.launchBrowser();
		crm.openURL();
		crm.login();
		crm.enternamepsw();
		crm.companies();
		crm.New();
		
	}







}