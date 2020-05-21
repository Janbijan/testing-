package com.ebanking.scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class BasicScript {

	
	public static void main(String[] args) {
		//Launch 
		
				WebDriver driver=new FirefoxDriver();
				
				//URL
				
				driver.get("http://183.82.100.55/ranford2");

          //Maximise
				
				driver.manage().window().maximize();
				
				//Admin Login
				
				driver.findElement(By.id("txtuId")).sendKeys("Admin");
				driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
				driver.findElement(By.id("login")).click();
				
				//Branch Creation
				
				driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
				driver.findElement(By.xpath("//*[@id=\"BtnNewBR\"]")).click();
			
				//Branchname
				driver.findElement(By.id("txtbName")).sendKeys("allah786");
				//Add1
				driver.findElement(By.id("txtAdd1")).sendKeys("aji@143");
				//Zipcode	
						driver.findElement(By.id("txtZip")).sendKeys("54321");
						
				
				//Drop down
				
				Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
				Ctry.selectByVisibleText("INDIA");
				
				//State
				Select state=new Select(driver.findElement(By.id("lst_stateI")));
				state.selectByVisibleText("Andhra Pradesh");
				
				//city
				Select city=new Select(driver.findElement(By.id("lst_cityI")));
				city.selectByVisibleText("Hyderabad");
				//Submit
				driver.findElement(By.id("btn_insert")).click();
				//Alert
				driver.switchTo().alert().accept();
				
				//Home button
				driver.findElement(By.xpath("html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img"));
				
				//Rolecreation
				driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
				driver.findElement(By.id("btnRoles")).click();
				driver.findElement(By.id("txtRname")).sendKeys("abcdabcdabcdabcdabcdabcd");
				driver.findElement(By.id("txtRDesc")).sendKeys("abdhgfxncbukauwwagrsdsbnn xcj364t72q#nf ,jeez");
				Select state1 =new Select(driver.findElement(By.id("lstRtypeN")));
				state1.selectByVisibleText("E");
				driver.findElement(By.id("btninsert")).click();
				//switchTO
				driver.switchTo().alert().accept();
				//Emp creation
				driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
				driver.findElement(By.id("BtnNew")).click();
				
				driver.findElement(By.id("txtUname")).sendKeys("ajkjnxcjwe123");
				driver.findElement(By.id("txtLpwd")).sendKeys("sakda@nkjk");
				Select role =new Select(driver.findElement(By.id("lst_Roles")));
				role.selectByVisibleText("pandu");
				Select branch1  =new Select(driver.findElement(By.id("lst_Branch")));
				branch1.selectByVisibleText("abc");
                 driver.findElement(By.id("BtnSubmit")).click();
                 driver.switchTo().alert().accept();
                 driver.close();
                 
				//Logout
				//Banker Login
				//Logout
				//Close

	}

}
