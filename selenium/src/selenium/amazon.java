package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=5826229502449682865&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062078&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMI5I6xqILl9AIVizgrCh1bUg7yEAAYASAAEgLAdvD_BwE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung mobile");
		Thread.sleep(2000);
	}
	

}
