package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropd {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/selenium/drop.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("BBQ"));
		Select s = new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("l");
		Thread.sleep(2000);
		s.selectByVisibleText("butter chicken");
		Thread.sleep(2000);
		s.deselectAll();
		
	}

}
