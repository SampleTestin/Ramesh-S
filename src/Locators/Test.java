package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        
	        //1.attribute
	          driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9769542343");
	        
	        //2.text
	          driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	       
	}

}
