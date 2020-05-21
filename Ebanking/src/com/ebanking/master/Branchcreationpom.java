package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class Branchcreationpom {
	
//Element Properties
	@FindBy(id="txtbName")
WebElement BranchName;
@FindBy(id="txtAdd1")
WebElement Address1;
@FindBy(id="txtZip")
WebElement zipcode;
@FindBy(id="lst_counrtyU")
WebElement country;
@FindBy(id="lst_stateI")
WebElement state;
@FindBy(id="lst_cityI")
WebElement city;
@FindBy(id="btn_insert")
WebElement submit;

	
	
	
	//Element Methods
public void Brancre()
{
	
	BranchName.sendKeys("Mindqhdbhsj");
	Address1.sendKeys("7-26bdjzbu");
	zipcode.sendKeys("12345");
	country.click();
	country.sendKeys("INDIA");
	state.click();
	state.sendKeys("GOA");
	city.click();
	city.sendKeys("GOA");
	submit.click();
	
	
	
	
}
}