package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP {
	
	//Element properties
	@FindBy(id="txtuId")
			WebElement Uname;
	@FindBy(id="txtPword")
	WebElement pswd;
	@FindBy(id="login")
	WebElement log;
	
	
	//Element methods
	public void Login()
	{
		Uname.sendKeys("Admin");
		pswd.sendKeys("M1ndq");
		log.click();
		
		
		
		
	}
	
	
	
	

}
