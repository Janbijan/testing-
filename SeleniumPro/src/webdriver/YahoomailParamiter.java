package webdriver;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahoomailParamiter {
	
	public WebDriver driver;
	//launchingurl
	public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver","D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	}
	//openurl
	public void openURL(String url){
		driver.get(url);
	}
	public void enterData(){
		driver.findElement(By.name("username")).sendKeys("selenium4u");
	}
	public void signIn() throws InterruptedException{
		 WebElement e = driver.findElement(By.name("signin"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click()",e);
		 Thread.sleep(3000);
	}
	public void psw(){
		driver.findElement(By.name("password")).sendKeys("selenium@123");
	}
	public void login() throws InterruptedException{
		WebElement e1 = driver.findElement(By.id("login-signin"));

		((JavascriptExecutor)driver).executeScript("arguments[0].click()",e1);
		 Thread.sleep(3000);
		 
	}
	public static void main(String[] args) throws Exception {
		YahoomailParamiter y=new YahoomailParamiter();
		y.launchBrowser();
		y.openURL("https://login.yahoo.com/");
		y.enterData();
        y.signIn();
        y.psw();
        y.login();
        
        
        			}
		
	}
	
		
	


