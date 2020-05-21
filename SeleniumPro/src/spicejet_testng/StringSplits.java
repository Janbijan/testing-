package spicejet_testng;

import org.testng.annotations.Test;

public class StringSplits {
  @Test (enabled=false) 
  public void ex1() {
	
  String str="one, two, three, four";
	
  String[] s =str.split(",");
	

  System.out.println(s.length);
	 

 for(int i=0; i<s.length; i++) {
		
  if(s[i].trim().equalsIgnoreCase("three"))

	  {
			  System.out.println(s[i]);

		  }
	  }
  }
  
  @Test// (enabled=false)--(when ever we give  the enabled=false that one won't execute)  
  public void ex2() {
	 

 String str= "I love selenium";
	  String str1 = null;

	  String[] s = str.split(" ");//(here with in double quotes we gave space ie:i space love space you
	 
 System.out.println(s.length);
	
  for (int i = 0; i < s.length; i++) {
	

	  if(s[i].equalsIgnoreCase("selenium"))
	
	  {
			  str1=s[i];

			  System.out.println(str1);


		  }
	}
	  
	  
	 
 for(int i=str1.length()-1; i>=0; i--) {
		 
 System.out.println(str1.charAt(i));
	  }
  }
}


























  
