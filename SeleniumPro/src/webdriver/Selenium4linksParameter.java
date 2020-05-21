package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4linksParameter {

	public WebDriver driver;
	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();	2
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
		public void openURL() {
				driver.get("http://selenium4testing.com/");
				driver.findElement(By.id("closediv")).click();	
			}
			public void clickLink(String str) {
				driver.findElement(By.linkText(str)).click();	
			}
			public static void main(String[] args) {
				Selenium4linksParameter s = new Selenium4linksParameter();
				s.openBrowser();
				s.openURL();
				s.clickLink("Manual FAQs");
				s.clickLink("Selenium FAQs");
				s.clickLink("Core Java FAQs");
				s.clickLink("Downloads");

	}

}
