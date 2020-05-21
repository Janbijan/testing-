package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hmsregistrationform {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/hms/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Permanent Registration")).click();
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Insurance");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Ms.");
		driver.findElement(By.name("PNT_NAME")).sendKeys("ja");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("n");
		driver.findElement(By.name("LAST_NAME")).sendKeys("bi");
		driver.findElement(By.name("DOB")).sendKeys("december201925");
		driver.findElement(By.name("AGE")).sendKeys("25");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Female");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Married");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Hindi");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Wife");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("maa");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("1234567");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("AB+");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		//address2
		driver.findElement(By.name("ADDRESS2")).sendKeys("juihbf");
		driver.findElement(By.name("ZIP")).sendKeys("245645");
		// permannt address address1
		//driver.findElement(By.name("address")).sendKeys("dgregcvbf");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("1216432154");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("skjanbishaik@gmail.com");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		//image
		driver.findElement(By.name("image")).sendKeys("C:\\Users\\DELL PC\\Pictures\\2018-03\\MQSY5933.JPG");
		driver.findElement(By.name("submit")).click();
		
	}

}
