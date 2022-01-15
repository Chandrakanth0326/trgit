package mouceover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dd {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		WebElement b1 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement b2 = driver.findElement(By.xpath("//div[@id='box106']"));
		Actions csk = new Actions(driver);
		csk.dragAndDrop(b1, b2).perform();
		Thread.sleep(2000);
		WebElement b3 = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement b4 = driver.findElement(By.xpath("//div[@id='box104']"));
		Actions cskk = new Actions(driver);
		csk.dragAndDrop(b3, b4).perform();
		Thread.sleep(2000);
		WebElement b5 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement b6 = driver.findElement(By.xpath("//div[@id='box103']"));
		Actions cskkk = new Actions(driver);
		cskkk.dragAndDrop(b5, b6).perform();
		
		
	}

}
