package WebElementMethodUsed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("manual Class");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
		//get text
		driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		System.out.println(text); 

	}

}
