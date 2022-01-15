package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cpc {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///E:/selenium/hkhk.html");
		WebElement ele1=driver.findElement
				(By.xpath("//input[@value='hello']"));
		WebElement ele2=driver.findElement
				(By.xpath("//input[@value='world']"));
		WebElement ele3=driver.findElement
				(By.xpath("//a[contains(.,'googlegmail')]"));
				ele1.sendKeys(Keys.CONTROL+"a");
				Thread.sleep(2000);
				ele1.sendKeys(Keys.CONTROL+"c");
				Thread.sleep(2000);
				ele2.sendKeys(Keys.CONTROL+"av");
				Thread.sleep(2000);
				ele3.sendKeys(Keys.ENTER);
		

	}

}
