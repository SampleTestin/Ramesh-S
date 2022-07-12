package Kite_Pom_Using_Excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{   
	File myfile= new File("E:\\SELENIUM\\Selenium1\\XML FILE\\Sheet_02.xlsx");
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	String UN = mysheet.getRow(6).getCell(0).getStringCellValue();
	String PWD = mysheet.getRow(6).getCell(1).getStringCellValue();
	String PiN= mysheet.getRow(6).getCell(2).getStringCellValue();
		

		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Selenium1\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(500);
		
		
		Login_Page L = new Login_Page(driver);
		L.usrename(UN);
		L.password(PWD);
		L.loginbutton();
		
		Thread.sleep(500);
		Pin_Page P = new Pin_Page(driver);
		P.sendpin(PiN);
		P.clickcontinuebutton();
		
		Thread.sleep(500);
		Home_Page  H = new Home_Page(driver);
		H.Actualusername(UN);
		H.logoutbutton();
		
	   driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
