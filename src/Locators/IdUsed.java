package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdUsed {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
      //1. find web element by ID locators
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//2. find web element by linktext & partiallink text
		driver.findElement(By.linkText("Apple iPhone 13 Pro (128GB) - Sierra Blue")).click();
		driver.findElement(By.partialLinkText("13 Pro (128GB) - Sierra Blue")).click();
        
		//3. find web element by class
		driver.findElement(By.className("a-color-base headline truncate-2line")).getClass();

	}

}
