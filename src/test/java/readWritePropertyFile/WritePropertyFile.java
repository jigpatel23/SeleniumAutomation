/**
 * 
 */
package readWritePropertyFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Jignesh
 *
 */
public class WritePropertyFile {
	private static Properties pro = new Properties();

	public static void main(String[] arg) {
		File file = new File(System.getProperty("user.dir") + "/DataFile.properties");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
			FileOutputStream fos;
			try {
				fos = new FileOutputStream(file);

				pro.setProperty("baseUrl", "http://www.dailymail.co.uk/");
				pro.setProperty("directUsername", "directlogin@gmail.co.uk");
				pro.setProperty("directPassword", "testpassword");
				
				pro.store(fos, "newBaseUrl");
				fos.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		

	}

}
