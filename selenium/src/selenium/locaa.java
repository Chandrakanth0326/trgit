package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).click();

	}

}
