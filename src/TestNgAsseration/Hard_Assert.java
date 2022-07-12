package TestNgAsseration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {

  @Test/*
  //1.AssertEqualsto
  public void Test() 
  {	  
	String a ="Ramesh"; 
	String b ="Ramesh";
	Assert.assertEquals(a, b,"Tc is fail value is not same");  
	 Reporter.log("Value is same TC pass",true); 
	  
  }
	//2.AssertNotEqualsto
	  @Test
	  public void Test() 
	  {	  
		String a ="Ramesh1"; 
		String b ="Ramesh";
		Assert.assertNotEquals(a, b,"Tc is fail value is  same");  
		 Reporter.log("Value is not same TC pass",true); 
		  
	  }
	//3.AssertTrue
	 @Test
	  public void Test() 
	  {	  
		boolean a =true; 
		Assert.assertTrue(a, "Tc is failed value is false ");
		Reporter.log("Tc is passed value is true",true);
		  
	  }
  //4.AssertFalse
	
	 public void mymethod() 
	  {	  
		
		boolean b =true;
		Assert.assertFalse(b, "Tc is failed value is true");
		Reporter.log("Tc is passed value is false",true);
		  
	  }
  
  //5.AssertNull
  public void mymethod1() 
  {	  
	
	String b=null;
	Assert.assertNull(b, "Tc is failed value is not Null");
	Reporter.log("Tc is passed value is Null",true);
	  
  }
  
//6.AssertNotNull
  public void mymethod1() 
  {	  
	
	String b="Ab";
	Assert.assertNotNull(b, "Tc is failed value is  Null");
	Reporter.log("Tc is passed value is NotNull",true);
	  
  }*/
  //7.AssertFail
  public void mymethod2() 
  {	 Assert.fail();
	  System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
  }
 
  
  
  
  
  
  
}




