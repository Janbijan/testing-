package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class RoleNG extends Base{
	@Test(dataProvider="Rdata")
	public void Role(String rn,String rd, String rt) throws InterruptedException
	{
		Lb.Role(rn,rd,rt);
	}
@DataProvider
public  Object[][] Rdata(){
	Object[][]obj=new Object[3][3];
	
	obj[0][0]="Tellerabcd";
	obj[0][1]="janujanu";
	obj[0][2]="E";
	
	obj[1][0]="Managerabcd";
	obj[1][1]="unajunaj";
	obj[1][2]="E";
	
	obj[2][0]="Clerkabcd";
	obj[2][1]="asdfasdf";
	obj[2][2]="E";
	return obj;
	
	                               
	
}
}
