package webdriver;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class HMSRegistration_parameters {
		private WebDriver driver;
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "");
			 driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		public void openURL(String url) {
			driver.get(url);
		}
		public void enterText(By loc, String data) {
			driver.findElement(loc).sendKeys(data);
		}
	/*	public void click(String loc) {
			driver.findElement(By.name(loc)).click();
		}*/
		
		public void click(By loc) {
			driver.findElement(loc).click();
		}
		public void select(By loc, String data) {
			new Select(driver.findElement(loc)).selectByVisibleText(data);
		}
		
		public void login() {
			enterText(By.name("username"), "admin");
			enterText(By.name("password"), "admin");
			click(By.name("submit"));
		}
	/*	public void clickLink(String linkName) {
			driver.findElement(By.linkText(linkName)).click();	
		}*/

		public void navigateToPRPage() {
			click(By.linkText("Registration"));
			click(By.linkText("Permanent Registration"));
		}
		public void createPatient() {
			select(By.name("PATIENT_CAT"),"Insurance");
			select(By.name("RELATION"), "Father");
			select(By.name("TITLE"), "Mr.");
			click(By.name("DOB"));
		//	click("tcalSelected");
			driver.findElement(By.className("tcalSelected")).click();
			enterText(By.name("image"), "C:\\Nagesh\\test.PNG");
		//	driver.findElement(By.name("image")).sendKeys("C:\\Nagesh\\test.PNG");	
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HMSRegistration_parameters	 hms = new HMSRegistration_parameters();
			hms.openBrowser();
			hms.openURL("http://selenium4testing.com/hms");
			hms.login();
			hms.navigateToPRPage();
			hms.createPatient();
		}

	}




