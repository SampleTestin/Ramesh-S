package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Excludeused
{
	 @Test
	  public void A() 
	  {
		Reporter.log("A is Running of Exclude Class",true);  
	  }
	  @Test
	  public void B() 
	  {
		  Reporter.log("B is Running of Exclude Class",true);  
	  }
	  @Test
	  public void C() 
	  {
		  Reporter.log("C is Running of Exclude Class",true);  
	  }
	  @Test
	  public void D() 
	  {
		  Reporter.log("D is Running of Exclude Class",true);  
	  }
	  
	
	
}
