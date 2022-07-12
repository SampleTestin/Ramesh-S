package FirstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Test1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.get("https://www.flipkart.com/");
		Reporter.log("Hii",true);

	}

}
