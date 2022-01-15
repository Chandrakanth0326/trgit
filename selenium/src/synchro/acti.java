package synchro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class acti {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://localhost/user/submit_tt.do");
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		d.findElement(By.xpath("//div[.='Login ']")).click();
		d.findElement(By.xpath("//div[.='Tasks']")).click();
		d.findElement(By.xpath("//div[.='Reports']")).click();
		d.findElement(By.xpath("//div[.='Users']")).click();
		d.close();
		

	}

}
