package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mail1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=search&activity=header-signin&pspid=2114723002&done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&add=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("v_chandrakanth");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Chan263@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div [@class='icon mail']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a [@data-test-id='compose-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("mnbechetti@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("cvantettinavar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Send this email']")).click();
		
	}

}
