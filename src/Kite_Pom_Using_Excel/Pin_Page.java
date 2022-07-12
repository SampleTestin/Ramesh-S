package Kite_Pom_Using_Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_Page
{

	    //1. Data members/variable
	
	    @FindBy(xpath="//input[@id='pin']")  private WebElement pin;
	    @FindBy(xpath="//button[@type='submit']") private WebElement continuebutton;
		
		
		//2.Constructor
		public Pin_Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);//this us for access the global variable
		}
		
		
		//3.Methods
		public void sendpin(String PIn)
		{
			pin.sendKeys(PIn);
			
		}
		public void clickcontinuebutton()
		{
			continuebutton.click();
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
