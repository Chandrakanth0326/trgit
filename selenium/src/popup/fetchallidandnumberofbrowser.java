package popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchallidandnumberofbrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(4000);
		Set<String> all = driver.getWindowHandles();
		int count = all.size();
		System.out.println(count);
		for (String whall : all) 
		{
			System.out.println(whall);
		}
		driver.quit();
	}

}
