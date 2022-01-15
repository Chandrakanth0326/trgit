package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class login {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://122.166.192.191:9008/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chandrakanth.rpee11@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Chan263");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Post a Job']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[@id='select2-category-container']"));
		

	}

}
