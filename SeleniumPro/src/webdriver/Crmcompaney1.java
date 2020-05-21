package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Crmcompaney1 {
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
	public void click(){
		click("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]");
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
		click("//*[@id='ui']/div/div/form/div/div[3]");
		}

	public void companies(String loc){
		driver.findElement(By.xpath(loc)).click();
	}
	public void companies(){
		companies("//*[@id='main-nav']/a[4]/span");
		companies("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[2]");
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
		Crmcompaney1 c= new Crmcompaney1();
		c.openBrowser();
		c.openUrl("https://freecrm.com/");
		c.click();
		c.enterText();
		c.companies();
		//c.new();
		


	}

}
