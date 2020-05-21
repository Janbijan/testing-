package POM;

import org.testng.annotations.Test;
public class HMSRegistrationScript
 {
	
HMSComponents hms = new HMSComponents();

  @Test public void f()
 {
	
  hms.launchURL();
	
  hms.login();
	
  hms.navigateToReg();
 
	}

}

 
