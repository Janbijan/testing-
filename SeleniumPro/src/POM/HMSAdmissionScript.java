package POM;




import org.testng.annotations.Test;


public class HMSAdmissionScript {
	
HMSComponents hmsComp = new HMSComponents();
	

  @Test
  public void f()
 {
	
  hmsComp.launchURL();
	
  hmsComp.login();
	
  
  }
}

