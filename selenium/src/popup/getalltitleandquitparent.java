package popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getalltitleandquitparent {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(4000);
		String p_id = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		int count = all.size();
		System.out.println(count);
		for (String wh : all) 
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(4000);
			if (wh.equals(p_id)) 
			{
				driver.close();
			}
			
		}
		
	}

}
