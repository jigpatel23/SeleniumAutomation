package coreJava;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	String username;
	String password;

	ExcelReader(String username, String password) {
		this.username = username;
		this.password = password;

	}

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\Jignesh\\Desktop\\Automation\\Credentials.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			int rowCount = sheet.getLastRowNum();
			System.out.println("the no of rows are : " + rowCount);
			for (int row = 1; row <= rowCount; row++) {
				String ID = sheet.getRow(row).getCell(0).getStringCellValue();
				String Password = sheet.getRow(row).getCell(1).getStringCellValue();

				System.out.println(ID + " , " + Password);
			}
			ExcelReader er = new ExcelReader(sheet.getRow(1).getCell(0).getStringCellValue(),
					sheet.getRow(1).getCell(1).getStringCellValue());
			System.out.println(er.username);
			System.out.println(er.password);
			wb.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
