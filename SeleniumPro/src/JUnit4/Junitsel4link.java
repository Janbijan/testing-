package JUnit4;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitsel4link {
	private WebDriver driver;
	@Before //Pre-condition
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://selenium4testing.com/");
			driver.findElement(By.id("closediv")).click();	
	}

	@After //Post Condition
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test // TEst Scenario
	public void clickMFAQs() {
		driver.findElement(By.linkText("Manual FAQs")).click();	
	}
	
	@Test
	public void clickSFAQs() {
		driver.findElement(By.linkText("Selenium SFAQS")).click();
	}
	@Test
	public void clickCFAQs() {
		driver.findElement(By.linkText("Core Java FAQs")).click();	
	}
}








