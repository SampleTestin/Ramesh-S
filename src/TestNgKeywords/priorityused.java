package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityused {
  @Test(priority=1)
  public void Z() 
  {
	Reporter.log("Z is Running",true); 
	  
  }
  @Test(priority=2)
  public void R() 
  {
	  Reporter.log("R is Running",true);   
	  
  }
  @Test(priority=3)
  public void A() 
  {
	  Reporter.log("A is Running",true);   
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
}
