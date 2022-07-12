package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod
{
	@Test
	  public void A() 
	  {
		Reporter.log("A is Running",true);  
	  }
	  
	  @Test(dependsOnMethods={"A"},priority=1)
	  public void B() 
	  {
		  Reporter.log("B is Running",true);  
	  }
	  
	  @Test
	  public void C() 
	  {
		  Reporter.log("C is Running",true);  
	  }
	  @Test
	  public void E() 
	  {
		  Reporter.log("E is Running",true);  
	  }
	  @Test
	  public void F() 
	  {
		  Reporter.log("F is Running",true);  
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
