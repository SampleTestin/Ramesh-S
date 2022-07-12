package TestNgAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteAppLogin
{    WebDriver driver ;
	@BeforeClass
	  public void LaunchBrowser() throws InterruptedException 
	   { 
		 System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		 driver =new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    Reporter.log("Browser launch sucessfully",true);
	    Thread.sleep(1000);
	   }
	 
	 @BeforeMethod
	   public void LoginPage() throws InterruptedException 
	   { 
		 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dhana1111");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ELR321");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Reporter.log("login sucuss",true);
	
		Thread.sleep(500);
	    WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		continuebutton.click();
		  	  
		
	  }
		  
	@Test
	public void PIN() throws InterruptedException
	{ 
	  WebElement Value = driver.findElement(By.xpath("//span[@class='user-id']"));
	  String A = Value.getText();
	  System.out.println(A);
	}

	@AfterMethod
	public void Logout() throws InterruptedException
	{  
		WebElement Value = driver.findElement(By.xpath("//span[@class='user-id']"));
	     Value.click();
		WebElement logoutbutton = driver.findElement(By.xpath("//a[@target='_self']"));
		Thread.sleep(1000);
		logoutbutton.click();
	    Reporter.log("logout sucessfully",true);
	   Thread.sleep(1000);
	  
	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{  
	
	driver.close();
	Reporter.log("Browser close sucessfully",true);
	 

	}	  
 
}
