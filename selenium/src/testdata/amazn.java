package testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./excel/test.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet("sheet1");
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (int i = 0; i < links.size(); i++) 
		{
			Row r=s.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(links.get(i).getAttribute("href"));
		}
		FileOutputStream fout = new FileOutputStream("./excel/test.xlsx");
		book.write(fout);
		}
}
