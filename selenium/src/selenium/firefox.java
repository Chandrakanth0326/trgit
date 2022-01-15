package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./driver/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		

	}

}
