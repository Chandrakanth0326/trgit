package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flip1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		String src= driver.getPageSource();
		System.out.println(src);
		driver.close();
	}

}
