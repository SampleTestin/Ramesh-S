package TestNgAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookLogin {
	 WebDriver driver;
	 @Test
	  public void loginpage() throws InterruptedException 
	  {  
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9769542343");
			driver.findElement(By.xpath("//div[@class='_55r1 _1kbt']")).sendKeys("ramesh1807");
			driver.findElement(By.xpath("//button[@value='1']")).click();
			Reporter.log("login sucuss",true);
			 Thread.sleep(1000);
			 
		  
	  }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException 
	  {  
		  driver.findElement(By.xpath("(//span[@dir='auto'])[7]")).click();
		  Reporter.log("logout sucessfully",true);
		  Thread.sleep(1000);
	  }

	  @BeforeClass
	  public void beforeClass() throws InterruptedException
	  {System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		 
		
		  driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  Reporter.log("Browser launch sucessfully",true);
	  Thread.sleep(1000);
		  
		  
	  }

	  @AfterClass
	  public void afterClass() throws InterruptedException 
	  {
		  
		  driver.close();
			Reporter.log("Browser close sucessfully",true);
			 Thread.sleep(1000);
		 
		  
	  }
	  
	
}
