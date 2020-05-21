package com.ebanking.master;

import java.io.IOException;

public class Exercise {

	 
	

		public static void main(String[] args) throws InterruptedException, IOException  {
		//instance class
			Library Lb= new Library();
			String Rval=(String) Lb.OpenApp("http://183.82.100.55/ranford2");
			System.out.println(Rval);
		
			Lb.AdminLgn("Admin","M1ndq");
			Lb.Branchcre("Hdfcbanksrnagar","Ammerpet","12345","INDIA","GOA","GOA");
			Lb.Role("janbu","handhand","E");
			//Lb.close();
		}

	
	}

