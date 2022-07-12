package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		/*//1. driver.get ("URL");
		
		//2.driver.close();
		
		//3.driver.quit();
		
		//4.driver.manage().window().minimize();
	   //  driver.manage().window().maximize();
		
		//5.navigation used
		
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  Thread.sleep(10000);
		  driver.navigate().to("https://www.youtube.com/");
		  Thread.sleep(10000);
		driver.navigate().back();
		  Thread.sleep(10000);
		  driver.navigate().forward();
		  Thread.sleep(10000);
		  driver.navigate().refresh();
		  Thread.sleep(10000);
		  driver.close();*/
		  
		  //6. get title
		  driver.get("https://www.youtube.com/");
		  String title=driver.getTitle();
		  System.out.println(title);
		  
		  //7. get URL
		  //driver.get("https://www.youtube.com/");
		   //String url=driver.getCurrentUrl();
		  //System.out.println(url);
		  


	}

}
