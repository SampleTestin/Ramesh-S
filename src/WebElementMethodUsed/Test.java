package WebElementMethodUsed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) 
	{ // isEnabled
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		/*driver.get("https://www.facebook.com/login/");
       WebElement loginbutton= driver.findElement(By.xpath("//button[@value='1']"));
			System.out.println(loginbutton.isSelected());*/
			
			driver.get("https://wetransfer.com/");
    driver.findElement(By.xpath("//button[text()='No thanks']")).click();
    //driver.findElement(By.xpath("//span[text()='Log in']")).click();
	WebElement Button =driver.findElement(By.xpath("//input[@type='password']"));	
			System.out.println(Button.isEnabled());
			
		
		
	}

}
