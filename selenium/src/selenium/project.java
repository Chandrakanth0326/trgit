package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class project {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://122.166.192.191:9008/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chandrakanth.rpee11@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Chan263");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	
	}

}
