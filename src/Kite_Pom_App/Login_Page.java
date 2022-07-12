package Kite_Pom_App;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page
{

	//1. Data members/variable
	
	@FindBy(xpath="//input[@id='userid']")  private WebElement username;
	@FindBy(xpath="//input[@type='password']")  private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
	
	
	//2.Constructor
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//this us for access the global variable
	}
	
	//3.Methods
	public void usrename()
	{
		username.sendKeys("ELR321");
	}
	public void password()
	{
		password.sendKeys("Dhana1111");
	}
	public void loginbutton()
	{
		loginbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
