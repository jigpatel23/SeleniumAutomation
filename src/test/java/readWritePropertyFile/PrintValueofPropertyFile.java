package readWritePropertyFile;

public class PrintValueofPropertyFile {

	private static ReadPropertyFile readFile = new ReadPropertyFile();

	public static void main(String[] args) {

		System.out.println(readFile.getBaseUrl());
		System.out.println(readFile.getDirectUsername());
		System.out.println(readFile.getDirectPassword());
	}
}
