package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("9632695627");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("9945127586");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
