package readExcelFile;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private static XSSFSheet sheet;
	private static FileInputStream fis;
	private static XSSFWorkbook wb;

	public ExcelReader() {

		try {
			File file = new File("C:\\Users\\Jignesh\\Desktop\\Automation\\Credentials.xlsx");
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("Sheet1");
			int rowCount = sheet.getLastRowNum();
			System.out.println("the no of rows are : " + rowCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getBsUsername() {
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		return username;
	}

	public String getBsKey() {
		String key = sheet.getRow(1).getCell(1).getStringCellValue();
		return key;
	}

	public String getDirectUsername() {
		String directusername = sheet.getRow(2).getCell(0).getStringCellValue();
		return directusername;
	}

	public String getDirectPassword() {
		String directpass = sheet.getRow(2).getCell(1).getStringCellValue();
		return directpass;
	}

	public String getFacebookUsername() {
		String fbusername = sheet.getRow(3).getCell(0).getStringCellValue();
		return fbusername;
	}

	public String getFacebookPassword() {
		String fbpass = sheet.getRow(3).getCell(1).getStringCellValue();
		return fbpass;
	}

	public String getTwitterUsername() {
		String twusername = sheet.getRow(4).getCell(0).getStringCellValue();
		return twusername;
	}

	public String getTwitterPassword() {
		String twpass = sheet.getRow(4).getCell(1).getStringCellValue();
		return twpass;
	}

}
