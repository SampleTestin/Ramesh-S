package Kite_Pom_App;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class {

	public static void main(String[] args) throws InterruptedException 
	{    

		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(500);
		
		
		Login_Page L = new Login_Page(driver);
		L.usrename();
		L.password();
		L.loginbutton();
		
		Thread.sleep(500);
		Pin_Page P = new Pin_Page(driver);
		P.sendpin();
		P.clickcontinuebutton();
		
		Thread.sleep(500);
		Home_Page  H = new Home_Page(driver);
		H.Actualusername();
		H.logoutbutton();
		
	   driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
