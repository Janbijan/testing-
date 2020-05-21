package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Freecrm {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		driver.findElement(ById.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
		driver.findElement(By.name("email")).sendKeys("nag010683@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Nagesh@123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
		driver.findElement(By.name("first_name")).sendKeys("janbi");
		driver.findElement(By.name("last_name")).sendKeys("shaik");
		driver.findElement(By.name("middle_name")).sendKeys("js");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/input")).click();
		driver.findElement(By.name("value")).sendKeys("skjanbishaik@gmail.com");
		driver.findElement(By.name("name")).sendKeys("skjanbi@gmail.com");
		driver.findElement(By.name("description")).sendKeys("nothing ");
		//company
	  driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")).sendKeys("CRM");
				//tags
	driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[1]")).sendKeys("tags");
			
		//social channel
	//driver.findElement(By.xpath("//div[@name='channel_type']")).click();
		//driver.findElement(By.xpath("(//input[@name='value'])[3]")).sendKeys("twitter");
		//time Zone
	driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[6]/div[2]/div/div/input")).click();
	//address
	
	
	}
}
