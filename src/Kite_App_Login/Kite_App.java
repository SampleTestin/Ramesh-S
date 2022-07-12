package Kite_App_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_App {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(500);
		//1.login page
		WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginbutton.click();
		
		//2.pin page
		Thread.sleep(500);
	    WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		continuebutton.click();
		
		//3. home page
		Thread.sleep(500);
		WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualuserid = username.getText();
		String expecteduserid = "ELR321";
		
		if(actualuserid.equals(expecteduserid))
		{
			System.out.println("Tc is passed userid is matching");
		
		}
		else
		{
			System.out.println("Tc is failed useid is not matching");
		}
		
		Thread.sleep(1000);
		username.click();
		WebElement logoutbutton = driver.findElement(By.xpath("//a[@target='_self']"));
		Thread.sleep(1000);
		logoutbutton.click();
		
		Thread.sleep(1000);
		driver.close();
		
		
		
	}

}
