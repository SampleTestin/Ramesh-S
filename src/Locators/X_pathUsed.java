package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_pathUsed
{
public static void main(String[] args)
{
	 System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
		
		//1. find x-path by using attribute
    driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']")).click();
		
		//2. find x-path by using text
     driver.findElement(By.xpath("//a[text()='Fashion']")).click();
		
		//3.find xpath by contains
     driver.findElement(By.xpath("//div[contains(@class,'rhf-sign-in-tool')]")).isDisplayed();
}
}
