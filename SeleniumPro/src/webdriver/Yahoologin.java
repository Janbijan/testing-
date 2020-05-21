package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoologin {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.name("username")).sendKeys("selenium4u");
		 WebElement e = driver.findElement(By.name("signin"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click()",e);
		 Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("selenium@123");
		//driver.findElement(By.name("signin")).click();
		WebElement e1 = driver.findElement(By.id("login-signin"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click()",e1);
		 Thread.sleep(3000);
		
	}

}
