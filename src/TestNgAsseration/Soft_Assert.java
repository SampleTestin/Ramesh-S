package TestNgAsseration;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
  @Test
  public void Mymethod() 
  {
	 SoftAssert soft=new SoftAssert(); 
	 String a="abcd";
	 String b="abcd";
	 soft.assertEquals(a, b, "Tc is Failed value is not same");
	Reporter.log("Tc is passe value is same",true);
	 
	 soft.assertNotEquals(a, b,"Tc is failed the value is same");
	
	 
	 soft.assertAll();
	 
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
