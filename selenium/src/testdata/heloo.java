package testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class heloo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./excel/testt.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet s = book.getSheet("sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		System.out.println(value);
	}
	

}
