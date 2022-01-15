package testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class hi {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./excel/test.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet("Sheet1");
		for (int i = 0; i < s.getLastRowNum(); i++) 
		{
			Row r = s.getRow(i);
			for (int j = 0; j < r.getLastCellNum(); j++) 
			{
				System.out.println(r.getCell(j).getStringCellValue());
			}
			System.out.println();
		}
	}

}
