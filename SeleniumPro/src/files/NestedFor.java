package files;
import org.testng.annotations.Test;


public class NestedFor
 {
  @Test
  public void f() 
{
	 
 for (int i = 1; i < 6; i++) {
	
	for (int j = 1; j <=i; j++)
 {
			
System.out.print(j);

		}
		
System.out.println();
	
}

  }

}


	