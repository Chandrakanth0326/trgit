package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom.LoginPage;

public class Data1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(3000);
		LoginPage lp = new LoginPage(driver);
		lp.clickLogin();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.clickLogin();
		
	}

}
