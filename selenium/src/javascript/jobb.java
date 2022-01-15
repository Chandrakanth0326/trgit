package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jobb {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://122.166.192.191:9008/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//i[@class='icon-facebook-rect']"));
		Point locn = ele.getLocation();
		int X = locn.getX();
		int Y = locn.getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+X+","+Y+")");
		Thread.sleep(3000);
		ele.click();
		
	}

}
