package mouceover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclk {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		WebElement rightclick = driver.findElement(By.xpath("//span[.='right click me']"));
		Thread.sleep(3000);
		Actions csk = new Actions(driver);
		csk.contextClick(rightclick).perform();

	}

}
