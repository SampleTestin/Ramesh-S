package TestNgParralel_Serial_Run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerirsClass 
{ @Test
	  public void MyMethod1() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(1000);
			driver.close();
	  
	  }
  
}
