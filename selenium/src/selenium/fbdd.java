package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdd {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='year']"));
		Select s = new Select(ele);
		s.selectByValue("2021");
		Thread.sleep(2000);
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("multi");
			
		}
		else
			System.out.println("not multi");
	}
}