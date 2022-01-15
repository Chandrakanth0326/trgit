package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screen {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://103.91.181.45:9007/");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File hdd=new File("C:\\Users\\HP\\OneDrive\\Desktop\\short1.jpeg");
		FileUtils.copyFile(temp, hdd);
		driver.close();

	}

}
