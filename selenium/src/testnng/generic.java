package testnng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic 
{
	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
