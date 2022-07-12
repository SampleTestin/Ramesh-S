package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class invocationcountused {
  @Test(invocationCount=2) 
  public void login() {
	  
	  Reporter.log("login Sucessfully",true);  
  }
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("logout Sucessfully",true);   
  }
}
