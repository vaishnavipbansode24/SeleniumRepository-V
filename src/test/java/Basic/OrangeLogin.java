package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OrangeLogin {

	public static String Login(String key) throws IOException {
		Properties prop=new  Properties();
		FileInputStream file=new  FileInputStream(".\\configurefile\\orange.properties");
		prop.load(file);
		String data=prop.getProperty(key);
		return data;
		
	}

}
