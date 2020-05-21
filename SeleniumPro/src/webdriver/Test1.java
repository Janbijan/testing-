package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("skjanbishaik@gmail.com");
		driver.findElement( By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		driver.findElement(By.name("password")).sendKeys("Shaikferoz12");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		
		
	}

}
