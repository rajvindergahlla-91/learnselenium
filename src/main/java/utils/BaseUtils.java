package utils;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseUtils {             // read data from configuration file

	public static String getConfigValue (String key) throws IOException
	{
    Properties property = new Properties();
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/data/configuration.properties");
	property.load(file);
	
	return property.getProperty(key);
	
}
}
