package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_urll {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i=0; i<3; i++) 
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}
		for (int i = 0; i < 3 ; i++) 
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(2000);
		}
	}

}
