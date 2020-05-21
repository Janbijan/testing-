package webdriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Freecrmcompanies {

		public WebDriver driver;
		public void openBrowser() {
		//	System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
		public void openURL() {
			driver.get("https://ui.freecrm.com/");
		}
		public void Login() {
			driver.findElement(By.name("email")).sendKeys("nag010683@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Nagesh@123");
			driver.findElement(By.xpath("//div[text()='Login']")).click();
				
		}
		public void Companies() {
			driver.findElement(By.xpath("//*[@id=\'main-nav\']/a[4]/span")).click();
			driver.findElement(By.xpath("//*[@id=\'dashboard-toolbar\']/div[2]/div/a/button")).click();
		}
		public void Details() throws Exception{
			driver.findElement(By.name("name")).sendKeys("Suresh");
			driver.findElement(By.xpath("//button[@class='ui small fluid positive toggle button']")).click();
			driver.findElement(By.xpath("//div[text()='Select users allowed access']")).click();
			driver.findElement(By.xpath("(//span[text()='Nagesh Kella'])[2]")).click();
			driver.findElement(By.name("url")).sendKeys("nag010683@gmail.com");
		//	driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[2]/div/div/div/button")).click();
			driver.findElement(By.name("address")).sendKeys("PraneethNagar");
			driver.findElement(By.name("city")).sendKeys("Hyderabad");
			driver.findElement(By.name("state")).sendKeys("Telagana");
			driver.findElement(By.name("zip")).sendKeys("500005");	
			
		//	driver.findElement(By.xpath("(//input[@class='search'])[2]")).click();
		//	driver.findElement(By.xpath("(//input[@class='search'])[2]")).sendKeys("United States");
			driver.findElement(By.name("value")).sendKeys("9999912456");
			
			driver.findElement(By.xpath("//input[@placeholder='Home, Work, Mobile...']")).sendKeys("0847522684");
			driver.findElement(By.xpath("//div[@class='four fields']//button[@class='ui icon button']")).click();

			driver.findElement(By.xpath("(//input[@class='search'])[3]")).sendKeys("India");
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			driver.findElement(By.name("description")).sendKeys("Automation");
			driver.findElement(By.xpath("//div[@name='channel_type']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Facebook']")).click();
		//	driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[1]/div[2]/div[2]/span")).click();
			driver.findElement(By.xpath("//input[@placeholder='Facebook profile link']")).sendKeys("surehreddy");
			driver.findElement(By.xpath("(//button[@class='ui icon button']//i)[3]")).click();
			driver.findElement(By.name("industry")).sendKeys("Skylabs");
			driver.findElement(By.name("num_employees")).sendKeys("30");
			driver.findElement(By.name("symbol")).sendKeys("SL");
			driver.findElement(By.name("annual_revenue")).sendKeys("20Cr");
			driver.findElement(By.name("status")).click();
			driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[10]/div[1]/div/div/div[2]/div[2]")).click();
			driver.findElement(By.name("source")).click();
			driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[10]/div[2]/div/div/div[2]/div[3]")).click();
			driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[11]/div[1]/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[11]/div[1]/div/div/div[2]/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("category")).click();
			driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[11]/div[1]/div/div/div[2]/div[1]/span")).click();
			driver.findElement(By.name("vat_number")).sendKeys("645789421");
			driver.findElement(By.name("identifier")).sendKeys("Suresh");
			driver.findElement(By.xpath("//input[@name='image']")).sendKeys("C:\\Nagesh\\choose.PNG");
			
			
		}
		public void Close() {
			driver.quit();
			
		}
		public void main(String[] args)throws Exception {
			// TODO Auto-generated method stub
			Freecrmcompanies c=new Freecrmcompanies();
			c.openBrowser();
			c.openURL();
			c.Login();
			c.Companies();
			c.Details();
			//c.Close();

		}

	}

	

