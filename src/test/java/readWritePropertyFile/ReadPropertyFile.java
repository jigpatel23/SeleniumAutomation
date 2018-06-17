package readWritePropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {

	private static Properties prop;

	public ReadPropertyFile() {
		prop = new Properties();
		try {
			File file = new File(System.getProperty("user.dir") + "/DataFile.properties");
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getBaseUrl() {
		String username = prop.getProperty("baseUrl");
		return username;
	}

	public String getDirectUsername() {
		String username = prop.getProperty("directUsername");
		return username;
	}

	public String getDirectPassword() {
		String password = prop.getProperty("directPassword");
		return password;
	}

}
