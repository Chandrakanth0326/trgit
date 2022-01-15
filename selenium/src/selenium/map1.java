package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class map1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/maps/@21.125498,81.914063,5z?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='searchboxinput']")).sendKeys("mysuru");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='searchbox-searchbutton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@draggable='false' and @alt='Directions']")).click();
		Thread.sleep(2000);
	}

}
