package spicejet_testng;

import org.testng.annotations.Test;

public class ArraysEx {

	
	@Test (enabled=false)
	  public void f() 
	{
	/*  String[] str;
		  int[] k;
		
	  char[] c;
		  Object[] o;
		  
		  
	String[] s1= new String[10];*/
		  
	String[] s= {"Nagesh", "Rajesh","Ramesh", "Mahesh","Ram","Sita"};

		  System.out.println(s.length);
		  
	for(int i=0; i<s.length; i++) {
			
	  System.out.println(s[i]);	  
		  }
		
	  System.out.println("---------------------------");
		
	  for(int i=s.length-1; i>=0; i--) {
			
	  System.out.println(s[i]);
		  }
	/*	 
	 System.out.println(s[0]);
		 
	 System.out.println(s[1]);
		 
	 System.out.println(s[2]);
		  
	System.out.println(s[3]);*/
	  }
	  
	 
	 @Test(enabled=false, description="Print only Ramesh")
	  
	public void arrayex2() {
		 
	 String[] s= {"Nagesh", "Rajesh","Ramesh123", "Mahesh","Ram","Sita"};
		
	  int k=0;
		  
	for (int i = 0; i < s.length; i++) {
			
	  if(s[i].equalsIgnoreCase("Ramesh"))
			  {
				
	  System.out.println(s[i]);
				 
	System.out.println(k);
			
	  }
		}
		 
	 if(k==0)
		  {
			  
	System.out.println("Not available");

		  }

		 
	  }
	  
	 
	 @Test(description="Print all values except Ramesh")
	  public void arrayex3()
	 {
		  String[] s= {"Nagesh", "Rajesh","Ramesh", "Mahesh","Ram","Sita"};

		 
		  for (int i = 0; i < s.length; i++) {
			 
	 if(!s[i].equalsIgnoreCase("Ramesh"))
			
	  {
				 
	 System.out.println(s[i]);
			 
	 }
		}
		  
		 
	  }
	}















