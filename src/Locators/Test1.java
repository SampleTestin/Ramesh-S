package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#");
        driver.manage().window().maximize();
        
        //1. by contains
        //driver.findElement(By.xpath("//a[contains(text(),'About U')]")).click();
        
        //2. by index
        driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
	}

}
