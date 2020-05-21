package com.ebanking.master;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Base {
	Library Lb=new Library();
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  Lb.AdminLgn("Admin","M1ndq");
	  Thread.sleep(4000);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Lb.admlgt();
	  Thread.sleep(4000);
	  
  }

  @BeforeSuite
  public void beforeSuite() throws IOException, InterruptedException {
	  Lb.OpenApp("http://183.82.100.55/ranford2/");
	  Thread.sleep(4000);
	  

	  
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException {
	  Lb.Appc();
	  

  }

}
