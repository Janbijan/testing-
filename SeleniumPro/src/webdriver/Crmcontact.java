package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Crmcontact {
public WebDriver driver;
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumsoftware\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void openUrl(String url){
		driver.get(url);
	}
public void click(String loc){
	driver.findElement(By.xpath(loc)).click();
}
	
	public void enterText(String loc, String data) {
		driver.findElement(By.xpath(loc)).sendKeys(data);
	}

	public void Select(String loc, String data) {
		new Select(driver.findElement(By.xpath(loc))).selectByVisibleText(data);
	}
	public void clickLink(String linkName) {
		driver.findElement(By.linkText(linkName)).click();
	}
	public void enterText() {
		enterText("//input[@type='text']", "nag010683@gmail.com");////input[@type="text"]
		enterText("//input[@type='password']", "Nagesh@123");////input[@type='password']
		click("//span[text()='Log In']");
		}

	public void companies(String loc){
		driver.findElement(By.xpath(loc)).click();
	}
	//public void clicklink(String loc){

		//driver.findElement(By.linkText(loc)).click();
	//}
	public void select(String loc, String data) {
		new Select(driver.findElement(By.name(loc))).selectByVisibleText(data);
	}
	//public vouid creatnewcompanie(){
	//	drver.findElement(By.xpath)
//	}
	
		
	
	
	
	public static void main(String[] args) {
		Crmcontact c= new Crmcontact();
		c.openBrowser();
		c.openUrl("https://freecrm.com/");
		
		//c.companies();
		//c.new();
		


	}

}
