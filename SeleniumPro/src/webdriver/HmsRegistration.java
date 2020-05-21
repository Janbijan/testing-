package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HmsRegistration {
	public WebDriver driver;
	public void openBrowser(){
	System.setProperty("webdriver.chrome.driver","D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}	

	public void openURL(String url) {
		driver.get(url);
		}
		    
		
	public void login() {
		driver.findElement(By.xpath("/html/body/div[2]/div/form/input")).sendKeys("admin");
	    driver.findElement(By.name("password")).sendKeys("admin");
	    driver.findElement(By.name("submit")).click();
	}
	public void registration()
	{
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Permanent Registration")).click();
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Ms.");
		driver.findElement(By.name("PNT_NAME")).sendKeys("janbi");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("shaik");
		driver.findElement(By.name("LAST_NAME")).sendKeys("feroz");
		driver.findElement(By.name("AGE")).sendKeys("21");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Father");
		driver.findElement(By.name("ADDRESS2")).sendKeys("sr nagar");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		driver.findElement(By.name("ZIP")).sendKeys("500015");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Female");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Self Employeed");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("shajeeda");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("12345fff");
		driver.findElement(By.name("ADDRESS1")).sendKeys("hyderabad");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9974656254");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("aaaaa@gmail.com");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");

		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.xpath("//*[@id=\"tcalGrid\"]/tbody/tr[2]/td[4]")).click();
		driver.findElement(By.name("image")).sendKeys("C:\\Users\\DELL PC\\Pictures\\2018-03\\MQSY5933.JPG");
		driver.findElement(By.name("submit")).click();
		
	}
		public void main(String[] args) {
			// TODO Auto-generated method stub
			HmsRegistration h=new HmsRegistration();
			h.openBrowser();
			h.openURL("http://selenium4testing.com/hms/");
			h.login();
			 h.registration();
		}

			
	}

	


