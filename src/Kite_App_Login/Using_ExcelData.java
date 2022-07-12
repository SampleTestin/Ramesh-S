package Kite_App_Login;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ExcelData {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		File myfile= new File("E:\\SELENIUM\\Selenium1\\XML FILE\\Sheet_02.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		String UN = mysheet.getRow(6).getCell(0).getStringCellValue();
		String PW = mysheet.getRow(6).getCell(1).getStringCellValue();
		String PIN= mysheet.getRow(6).getCell(2).getStringCellValue();
		
		
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(500);
		//1.login page
		WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys(UN);
		password.sendKeys(PW);
		loginbutton.click();
		
		//2.pin page
		Thread.sleep(500);
	    WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
	    pin.sendKeys(PIN);
		continuebutton.click();
		
		//3. home page
		Thread.sleep(500);
		WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualuserid = username.getText();
		String expecteduserid = UN;
		
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
