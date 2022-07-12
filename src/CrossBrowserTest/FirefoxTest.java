package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
  @Test
  public void My_Method() 
  {
	System.setProperty("webdriver.gecko.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
  }
}
