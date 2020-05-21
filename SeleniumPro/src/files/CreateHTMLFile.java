package files;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;


import org.testng.annotations.Test;


public class CreateHTMLFile 
@Test
  public void f() throws Exception {
	 
 File f = new File(".\\Results\\HMSResults.html");
	 
 FileWriter fw = new FileWriter(f);
	 
 BufferedWriter bw = new BufferedWriter(fw);
	  
bw.write("<html>");
	 
 bw.write("<body>");
	  
bw.write("<table cellspacing='2' cellpading='3' border='5'>");
	
  bw.write("<tbody>");
	 
 bw.write("<tr>");
		 
 bw.write("<td>");
bw.write("<font size ='6' color='green'>");
			 
 bw.write("Username");

		  bw.write("</font>");	  
		 
 bw.write("</td>"); 

		  bw.write("<td>");
		 
 bw.write("<font size='5' color='red'>");
			 
 bw.write("Password");
		  bw.write("</font>");
		 
 bw.write("</td>");
		 
 bw.write("<td><font size='6' color='blue'>Result</font></td>");
	 
 bw.write("</tr>");
	  
	 
 bw.write("<tr>");
		bw.write("<td><font size='6' color='yellow'> admin </font></td>");
		
bw.write("<td><font size='6' color='yellow'> admin </font></td>");
		
bw.write("<td><font size='6' color='yellow'> Pass </font></td>");
	 
 bw.write("</tr>");
	  
	
q  bw.write("<tr>");
	
  bw.write("<td> Nagesh1 </td>");

	  bw.write("<td> Test1 </td>");

	  bw.write("<td> Fail </td>");

	  bw.write("</tr>");
	  
	
  bw.write("</tbody>");
	  
bw.write("</table>");
	
  bw.write("</body>");
	  
bw.write("</html>");
	 
 bw.close();
	  
  }
}





