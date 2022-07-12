package TestNgAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg {
	
  @Test
  public void LaunchBrowser() 
  {
	 System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	Reporter.log("hii",true);
	
  }
}
