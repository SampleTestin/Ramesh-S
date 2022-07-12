package TestNgAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test {
  @Test
  public void youtube() {
	  System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		Reporter.log("hii",true);
  }
}
