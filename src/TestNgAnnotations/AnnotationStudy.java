package TestNgAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy 
{
	@Test
	  public void ValidateUserId() {
		  Reporter.log("Validation done", true);
	  }
	  @BeforeMethod
	  public void EnterUserIdAndPassword() {
		  Reporter.log("UserIdPasswordEntered  done", true);
	  }

	  @AfterMethod
	  public void Logout() {
		  Reporter.log("Logout  done", true);
	  }

	  @BeforeClass
	  public void BrowserLaunch() {
		  Reporter.log("Launch Browser", true);
	  }

	  @AfterClass
	  public void CloseBrowser() {
		  Reporter.log("Closed Browser", true);  
	  
}
}
