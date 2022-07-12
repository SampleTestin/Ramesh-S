package TestNgKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTc {
  @Test
  public void A() 
  {   
	  Reporter.log("A is running ", true);
  }
  @Test
  public void B() 
  {   Assert.fail();
	  Reporter.log("B is running ", true);
  } @Test
  public void C() 
  {
	  Reporter.log("C is running ", true); 
  }
}
