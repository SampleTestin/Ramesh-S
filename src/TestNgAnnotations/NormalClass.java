package TestNgAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalClass {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
	     WebDriver driver =new ChromeDriver();
		 //driver.get("https://vctcpune.com/selenium/practice.html");
		 System.out.println(driver);
	

	}

}
