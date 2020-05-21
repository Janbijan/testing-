package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP {

	//Branch creation Element Properties
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement Branch;
	@FindBy(id="BtnNewBR")
WebElement NewBR;
	
	//Home
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement HomeB;
	
	//Role creation Element Properties
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement Role;
	@FindBy(id="btnRoles")
	WebElement Newrole;
	
	//Home
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement HomeR;
	
	
	
	
	
	//Element methods
	public void BR()
	{
		Branch.click();
		NewBR.click();
		HomeB.click();
		
		}
		public void Rol(){
		Role.click();
		Newrole.click();
		HomeR.click();
		
		}	
	}
	
	
	
	
	
	
	

