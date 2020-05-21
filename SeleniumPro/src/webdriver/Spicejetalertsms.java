package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejetalertsms {
	public WebDriver driver;

	// browser
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// url
	public void openURL() {
		driver.get("https://spicejet.com/");
	}

	public void roundtrip() {
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

	}

	public void from() {
		driver.findElement(
				By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"))
				.click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	}

	public void to() {

		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
	}

	public void date() throws InterruptedException {
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.linkText("30")).click();
		Thread.sleep(2000);
		}
public void date1(){
	driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date2']")).click();
	driver.findElement(By.linkText("11")).click();
}
	public void enterPASSENGERS() {
		driver.findElement(By.id("divpaxinfo")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")))
				.selectByVisibleText("9");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")))
				.selectByVisibleText("3");
	}

	public void alert() {
		String str;
		str = driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) throws InterruptedException {
		Spicejetalertsms s = new Spicejetalertsms();
		s.openBrowser();
		s.openURL();
		s.roundtrip();
		s.from();
		s.to();
		s.date();
		s.date1();
		s.enterPASSENGERS();
		s.alert();
	}
}