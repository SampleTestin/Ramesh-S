package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUsed {
  @Test(enabled=false)
  public void A() 
  {
	Reporter.log("A is Running",true);  
  }
  
  @Test(enabled=true)
  public void B() 
  {
	  Reporter.log("B is Running",true);  
  }
  
  @Test
  public void C() 
  {
	  Reporter.log("C is Running",true);  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
