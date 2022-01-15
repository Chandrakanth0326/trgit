package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("7464131");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-lable='Password']")).sendKeys("54646310");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[disabled type='submit']")).click();
	}

}



