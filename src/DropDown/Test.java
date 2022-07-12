package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//1.Identify list box to be handled and store it in reference variable
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Option3']")).click();
	

	}

}
