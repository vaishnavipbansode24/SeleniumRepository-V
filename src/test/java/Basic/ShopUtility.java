package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ShopUtility {

	public static String LogD(String key) throws IOException {
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream(".\\configurefile\\Shopperstack.properties");
		prop.load(file);
		String data=prop.getProperty(key);
		return data;
	}
}
