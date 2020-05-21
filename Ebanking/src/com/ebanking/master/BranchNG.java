package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchNG extends Base
{
@Test(dataProvider="Rdata")
public void Branchcre(String Bn,String Add1,String Zc,String cty,String state,String city) throws InterruptedException{
	Lb.Branchcre(Bn, Add1, Zc, cty, state, city);
}
@DataProvider
public Object[][]Rdata(){
	Object[][]obj=new Object[2][6];
	obj[0][0]="Mindq12";
	obj[0][1]="7-26a2";	
	obj[0][2]="54321";
	obj[0][3]="INDIA";
	obj[0][4]="GOA";
	obj[0][5]="GOA";
	obj[1][0]="Srnagar2";
	obj[1][1]="2a62-7";
	obj[1][2]="45678";
	obj[1][3]="INDIA";
	obj[1][4]="Delhi";
	obj[1][5]="Delhi";
	return obj;
			
			
			
			
			
			
			
			
			
}
}
