package readExcelFile;

public class PrintExcelValues {

	private static ExcelReader exl = new ExcelReader();

	public static void main(String[] args) {

		System.out.println("BrowserStack Username:  " + exl.getBsUsername());
		System.out.println("BrowserStack Key:  " + exl.getBsKey());
		System.out.println("DirectLogin Username:  " + exl.getDirectUsername());
		System.out.println("DirectLogin Password:  " + exl.getDirectPassword());
		System.out.println("FacebookLogin Username:  " + exl.getFacebookUsername());
		System.out.println("FacebookLogin Password:  " + exl.getFacebookPassword());
		System.out.println("Twitter Username:  " + exl.getTwitterUsername());
		System.out.println("Twitter Password:  " + exl.getTwitterPassword());

	}

}
