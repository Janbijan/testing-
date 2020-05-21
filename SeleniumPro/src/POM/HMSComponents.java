package POM;



import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class HMSComponents extends BaseClass{
  
  public void launchURL() {
	
  openBrowser();
	  openURL("http://selenium4testing.com/hms/");
 
 }
 
 public void login() {
	  enterText(By.name("username"), "admin");
	
  enterText(By.name("password"), "admin");
	  click(By.name("submit"));
 

 }
  public void navigateToReg()
  {
	
  click(By.linkText("Registration"));
  click(By.linkText("Permanent Registration"));
  
  
		select(By.name("PATIENT_CAT"),"Insurance");
		select(By.name("RELATION"), "Father");
		select(By.name("TITLE"), "Mr.");
		click(By.name("DOB"));
		
		//driver.findElement(By.name("image")).sendKeys("C:\\Users\\DELL PC\\Pictures\\2018-03\\MQSY5933.JPG");
		enterText(By.name("AGE"), "24");
		select(By.name("SEX"),"Female");
		select(By.name("MTRL_STATUS"), "Married");
		select(By.name("RELIGION"), "Hindu");
		select(By.name("PLANGUAGE"), "Hindi");
		select(By.name("RELATION"),"Wife");
		enterText(By.name("MOTHER_NAME"),("Shajeeda"));
		select(By.name("PAT_IDENTITY"), "PAN Cord");
		enterText(By.name("PAT_IDENTITY_PROOF"),("123456"));
		select(By.name("NATIONALITY"), "Indian");
		select(By.name("IS_MLC"), "Yes");
        select(By.name("EDUCATION"),"B.Tech");
		select(By.name("OCCUPATION"), "Employee");
		select(By.name("BLOOD_GRP_CODE"), "AB+");
        select(By.name("CITIZENSHIP"), "Indian ");
		select(By.name("SC_PROOF"), "YES");
		
		//Permanent Address

		enterText(By.name("ADDRESS1"),("fnkrhtksd"));
		enterText(By.name("MOBILE_NO"),("362784528354"));
		enterText(By.name("EMAIL_ID"),("skjanbishaik@gmail.com"));
		select(By.name("COUNTRY_CODE"), "India");
		enterText(By.name("ADDRESS2"),("hbnfktuh"));
		enterText(By.name("ZIP"),("nvkura"));
		//image
		enterText(By.name("image"), "C:\\Users\\DELL PC\\Pictures\\2018-03\\MQSY5933.JPG");
		
		
		click(By.name("submit"));//save
		}
  
  public void navigateToAdmission() 
  {
	 
 click(By.linkText("ADT"));
  }
 
 public void navigateToAdmissionAdvise() {
	 
 click(By.linkText("ADT"));
	 
 click(By.linkText("Admission Advice"));
 
 }
 
 public void createPatient() {
	 
	 enterText(By.name("MR_NO"),"123");
	 enterText(By.name("PNT_NAME"),"hub");
	 select(By.name("GENDER"),"Female");
	 
	 select(By.name("DOC_NAME"),"Sai");
	 select(By.name("DOC_SPL"),"Cordialagist");
	 select(By.name("ADMISSION_TYPE"),"Out Patient");
	 select(By.name("PATIENT_CAT"),"Self");
	 select(By.name("HOSPITAL_SERVICES"),"Surgery");
	 
	 
	 
	 enterText(By.name("PROVI_DIOGNOS"),"ncjddk");
	 enterText(By.name("EXP_DATE"), "31marcnh2020");
	 enterText(By.name("EXP_LENGTH"), "4"); 
		select(By.name("EXP_FORMAT"),"Days");
		select(By.name("BED_REQ"), "Yes");
		select(By.name("REMARKS"), "hcsjdhfskmdnc");
		 click(By.name("submit"));
			select(By.name(""), "");
			select(By.name(""), ""); 
			select(By.name(""),"");

  }
 

 public void admission() {
	  

  }
 

 public void admissionAdvise() {
	  
 
 }
  
public void searchPatient() {
	  
  }

  
}




