package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test
	  public void A() 
	  {
		Reporter.log("A is Running",true);  
	  }
	  
	  @Test(timeOut=2000)
	  public void B() throws InterruptedException 
	  {
		  Reporter.log("B is Running",true); 
		  Thread.sleep(3000);
	  }
	  
	  @Test
	  public void C() 
	  {
		  Reporter.log("C is Running",true);  
	  }
 }
