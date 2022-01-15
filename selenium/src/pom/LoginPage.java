package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	//declaration
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Initialization
	public void clickLogin()
	{
		loginBtn.click();
	}
}
