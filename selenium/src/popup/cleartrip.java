package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cleartrip {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=EAIaIQobChMI8Jro2v309AIVEBsrCh35RgeFEAAYASAAEgIXTvD_BwE&gclid=EAIaIQobChMI8Jro2v309AIVEBsrCh35RgeFEAAYASAAEgIXTvD_BwE");
		
	}

}
