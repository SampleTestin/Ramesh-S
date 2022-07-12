package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class includeUsed {
  @Test
  public void A() 
  {
	Reporter.log("A is Running of Include Class",true);  
  }
  @Test(groups="Sanity")
  public void B() 
  {
	  Reporter.log("B is Running of Include Class",true);  
  }
  @Test(groups="Retesting")
  public void C() 
  {
	  Reporter.log("C is Running of Include Class",true);  
  }
  @Test(groups="Regresstion")
  public void D() 
  {
	  Reporter.log("D is Running of Include Class",true);  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}











