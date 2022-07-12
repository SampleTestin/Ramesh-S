package Kite_Pom_App;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{

	  //1. Data members/variable
	
    @FindBy(xpath="//span[@class='user-id']")  private WebElement Actualusername;
    @FindBy(xpath="//a[@target='_self']")private WebElement logoutbutton;
	
	
	//2.Constructor
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//this us for access the global variable
	}
	
	
	//3.Methods
	public void Actualusername()
	{
		String Ausername = Actualusername.getText();
		String Expecxtedusername = "ELR321";
		
		if(Ausername.equals(Expecxtedusername))
		{
			
			System.out.println("Tc is passed username is match");
		}
		else
		{
			
			System.out.println("Tc is failed username is not match");
		}
		
	}
	
	public void logoutbutton()
	{   
		Actualusername.click();
		logoutbutton.click();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

