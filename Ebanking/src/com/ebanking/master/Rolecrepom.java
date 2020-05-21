package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rolecrepom {
	
	//ElementProperties
	@FindBy(id="btnRoles")
	WebElement NewRole;
	@FindBy(id="txtRname")
	WebElement RoleName;
	@FindBy(id="txtRDesc")
	WebElement Description;
	
	@FindBy(id="lstRtypeN")
	WebElement Roletype;
	@FindBy(id="btninsert")
	WebElement subR;
	
	
	//ElementMethods
	public void Rolecre()
	{
		RoleName.sendKeys("mindqssd");
		Description.sendKeys("kingking");
		Roletype.click();
		Roletype.sendKeys("E");
		subR.click();
		
			
			
	}


		
	
	
	
	
	
	
	
	
	
	

}
