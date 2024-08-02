package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataDrivenTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Documents\\TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet("Sheet1");
		String email=s1.getRow(0).getCell(0).toString();
		String password=s1.getRow(0).getCell(1).toString();
		System.out.println(email);
		System.out.println(password);
	}

}
