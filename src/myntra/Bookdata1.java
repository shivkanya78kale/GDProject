package myntra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Bookdata1 {

	
	@Test
	public void XceelSheet() throws IOException {
		FileInputStream fis=new FileInputStream("E:\\TestFile.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet= book.getSheet("Name");
		XSSFRow row=sheet.getRow(4);
		XSSFCell cell=row.getCell(4);
		System.out.println(cell.getStringCellValue());
	}
	
	
	
}
